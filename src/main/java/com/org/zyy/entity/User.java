package com.org.zyy.entity;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 5928386490218898988L;

	private Integer id;
	
	private String userName;
	
	private int age;
	
	
	public User(Integer id, String userName, int age) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", age=" + age + "]";
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
}
