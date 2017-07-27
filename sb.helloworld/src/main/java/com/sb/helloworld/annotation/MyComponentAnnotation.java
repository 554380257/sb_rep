package com.sb.helloworld.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

@Target({ ElementType.TYPE })
@Documented
@Component
public @interface MyComponentAnnotation {

	String value() default "";
	
}
