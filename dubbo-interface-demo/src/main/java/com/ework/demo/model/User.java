package com.ework.demo.model;

import java.io.Serializable;

/**
 * 用户实体类
 * @Copyright 天擎天拓集团-2017
 * @author xl
 * @date 2018年3月14日
 * =================Modify Record=================
 * @Modifier			@date			@Content
 *
 */
public class User implements Serializable  {
	
	private static final long serialVersionUID = -4952157528782177553L;

	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 年龄
	 */
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
