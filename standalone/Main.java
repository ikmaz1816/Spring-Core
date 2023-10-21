package com.spring.standalone;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		Standalone alone=(Standalone)context.getBean("standalone");
		System.out.println(alone.getLs());
		context.close();
	}
}
