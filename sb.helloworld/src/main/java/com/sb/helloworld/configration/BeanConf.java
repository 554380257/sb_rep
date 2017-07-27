package com.sb.helloworld.configration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sb.helloworld.controller.UserController;
import com.sb.helloworld.dao.UserDao;
import com.sb.helloworld.service.IUserService;
import com.sb.helloworld.service.impl.UserService;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
public class BeanConf {

	@Bean
	public UserDao buildUserDao(){
		return new UserDao();
	}
	@Bean
	public IUserService buildUserService(){
		return new UserService(buildUserDao());
	}
	@Bean
	public UserController builduserController(){
		return new UserController(buildUserService());
	}
}
