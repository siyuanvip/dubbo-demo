package com.ework.controller.demo;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ework.demo.model.User;
import com.ework.demo.service.UserService;

/**
 * UserController
 * @Copyright 天擎天拓集团-2017
 * @author xl
 * @date 2018年3月14日
 * =================Modify Record=================
 * @Modifier			@date			@Content
 *
 */

@Controller
@RequestMapping("user")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Resource
	private UserService userService;
	
	/**
	 * 录入用户信息
	 * @author xl 
	 * @date 2018年3月16日 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "fillUserInfo")
	public String fillUserInfo(Model model) {
		return "user/fillUserInfo";
	}
	
	/**
	 * 添加信息
	 * @author xl 
	 * @date 2018年3月16日 
	 * @param model
	 */
	@RequestMapping(value = "addUser")
	@ResponseBody
	public Map<String, Object> addUser(Model model, @ModelAttribute("user") User user) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("name", user.getName());
		result.put("age", user.getAge());
		logger.info("name={};age={};", user.getName(), user.getAge());
		return result;
	}
}
