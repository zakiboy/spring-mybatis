package com.org.zyy.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.org.zyy.common.JunitTest;
import com.org.zyy.entity.User;
import com.org.zyy.service.UserService;

public class UserTest extends JunitTest{

	private static final Logger log = LoggerFactory.getLogger(UserTest.class);
	
	@Resource
	UserService service;
	
	@Test
	public void testGetUserInfo(){
		String username = "mengdee";
		// 第一次执行了方法体
		List<User> users = service.getUserInfo(username);
		for (User user:users) {
			log.info("user==============================={}",user);
		}
	}
	
}
