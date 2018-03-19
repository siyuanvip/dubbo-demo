package com.ework.demo.service.impl;

import org.springframework.stereotype.Service;

import com.ework.demo.model.User;
import com.ework.demo.service.UserService;

/**
 * UserService实现类
 * @Copyright 天擎天拓集团-2017
 * @author xl
 * @date 2018年3月14日
 * =================Modify Record=================
 * @Modifier			@date			@Content
 *
 */
@Service
public class UserServiceImpl implements UserService {

	/**
	 * 添加用户
	 * @author xl 
	 * @date 2018年3月14日 
	 * @param user
	 * @return
	 */
	@Override
	public int addUser(User user) {
		System.out.println("name:"+user.getName()+"; age:"+user.getAge()+";");
		return 0;
	}

}
