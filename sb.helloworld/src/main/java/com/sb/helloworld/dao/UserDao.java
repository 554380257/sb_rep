package com.sb.helloworld.dao;

import com.sb.helloworld.configration.MyLog;


public class UserDao {

	@MyLog(value="this value from annotation")
	private String name;
	
	public String getUserById(Long id){
		if(id == 1l){
			return name;
		}
		return "others";
	}
}
