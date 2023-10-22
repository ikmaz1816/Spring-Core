package com.spring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		Laptop lap=(Laptop)context.getBean("object1");
		System.out.println(lap.getFeature().getId());
		System.out.println(lap.getFeature().getSum());
		System.out.println(lap.getFeature().flag);
//		System.out.println(lap.getFeature().pi);
//		System.out.println(lap.getFeature().tensqrt);
		((AbstractApplicationContext)context).close();
	}
}
