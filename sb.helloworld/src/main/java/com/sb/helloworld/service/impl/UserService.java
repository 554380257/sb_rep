package com.sb.helloworld.service.impl;

import com.sb.helloworld.dao.UserDao;
import com.sb.helloworld.service.IUserService;

public class UserService implements IUserService {

	public UserDao userDao;
	
	public UserService(){
		
	}
	public UserService(UserDao userDao){
		this.userDao = userDao;
	}
	@Override
	public String login(Long id) {
		return userDao.getUserById(id);
	}
}
