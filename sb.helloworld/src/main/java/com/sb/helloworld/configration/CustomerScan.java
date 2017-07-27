package com.sb.helloworld.configration;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.Annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

@Component
public class CustomerScan  implements  BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("******************************"+beanName);
		if("buildUserDao".equals(beanName)){
			System.out.println("asdf");
		}
		Field[] fields = bean.getClass().getDeclaredFields();
        if (fields != null) {
            for (Field field : fields) {
            	if(!field.isAccessible()){
            		field.setAccessible(true);
            	}
            	MyLog mylog = field.getAnnotation(MyLog.class);
            	if(mylog ==null){
            		continue;
            	}
            	System.out.println("start scan");
            	if(field.getType().toString().endsWith("String")){
            		try {
						field.set(bean, mylog.value());
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
            	}
            }
        }
        return bean;
	}
	
}