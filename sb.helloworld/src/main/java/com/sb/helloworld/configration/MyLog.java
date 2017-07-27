package com.sb.helloworld.configration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME) 
public @interface MyLog {

	static String STATUS_NONE = "NONE";
	static String STATUS_YES = "YES";
	
	String value() default STATUS_NONE;
}
