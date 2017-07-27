package com.sb.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sb.helloworld.configration.JdbcConfig;
import com.sb.helloworld.service.IUserService;

@Controller
public class UserController {

	private IUserService userService;
	
	@Autowired  
    ApplicationContext context;  
	public UserController(){
		
	}
	
	public UserController(IUserService userService){
		this.userService = userService;
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(Long id){
		JdbcConfig jdbcConfig = context.getBean(JdbcConfig.class);
		System.out.println("--------------------"+jdbcConfig.getDriver());
		return userService.login(id);
	}
}
