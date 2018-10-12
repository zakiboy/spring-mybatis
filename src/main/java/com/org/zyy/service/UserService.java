package com.org.zyy.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.org.zyy.entity.User;
import com.org.zyy.mapper.UserDao;

@Service
public class UserService {

private static final Logger log = LoggerFactory.getLogger(UserService.class);
	
	@Resource
	private UserDao userDao;

	public List<User> getUserInfo(String username) {
		log.info("----------------查询用户------------{}",username);
		List<User> users = userDao.findAllUser();
		return users;
	}

	public void deleteUser(String username) {
		log.info("----------------删除用户------------{}",username);
	}

	public User updateUser(User user) {
    	log.info("----------------更新用户------------");
		return user;
	}
	
}

