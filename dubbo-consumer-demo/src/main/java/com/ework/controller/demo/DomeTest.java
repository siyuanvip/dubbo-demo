package com.ework.controller.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ework.demo.model.User;
import com.ework.demo.service.UserService;

public class DomeTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/framework/applicationContext.xml");
		context.start();

		UserService userService = (UserService) context.getBean("userService"); // 获取远程服务代理
		User user = new User();
		user.setName("张三");
		user.setAge(18);
		userService.addUser(user); // 执行远程方法
		System.out.println("end");
	}
}
