package com.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		LifecycleUsingConfig config=(LifecycleUsingConfig)context.getBean("lifeConfig");
		System.out.println(config);
		//Using lifecycle bean we should always use AbstractApplication Context
//		context.close();
		//This close method calls the destroy method
		
		LifeCycleUsingInterfaces config1=(LifeCycleUsingInterfaces)context.getBean("lifeInterface");
		System.out.println(config1);
		//Using lifecycle bean we should always use AbstractApplication Context
		
		
		LifecyleUsingAnnotation config2=(LifecyleUsingAnnotation)context.getBean("lifeAnnotate");
		System.out.println(config2);
		
		
		context.close();
		
		//This close method calls the destroy method
		
		
		
	}
}
