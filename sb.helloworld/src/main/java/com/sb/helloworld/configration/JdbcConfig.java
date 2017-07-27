package com.sb.helloworld.configration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdbcConfig {

	@Value("${jdbc.driver-class-name}")
	private String driver;
	
	@Value("${jdbc.username}")
	private String userName;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
