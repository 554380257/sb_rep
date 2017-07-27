package com.sb.helloworld.configration;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;


public class App {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BeanConf.class);
		
		ConfigurableApplicationContext context = SpringApplication.run(BeanConf.class, args);
		JdbcConfig config = context.getBean(JdbcConfig.class);
		System.out.println(config.getUserName());
	}
}
