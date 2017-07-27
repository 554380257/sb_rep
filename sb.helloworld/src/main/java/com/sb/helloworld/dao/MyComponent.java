package com.sb.helloworld.dao;

import java.util.List;

import com.sb.helloworld.annotation.MyComponentAnnotation;

@MyComponentAnnotation
public class MyComponent {

	ThreadLocal<List<String>> localList = new ThreadLocal<List<String>>();
	public void print(){
		localList.get().add("asdf");
	}
}
