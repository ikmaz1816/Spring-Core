package com.spring.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		AddingStudent adding=(AddingStudent)context.getBean("addingStudent");
		adding.addStudent();
		context.close();
	}
}
