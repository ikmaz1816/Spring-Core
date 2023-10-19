package com.spring.constructorAmbiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		//As from bean it passes the string value it calls the String constructor
		Student stud=(Student)context.getBean("ambiguity");
		stud.get();
		
		//to solve this we can use type and specify type 
		Student stud1=(Student)context.getBean("ambiguity1");
		stud1.get();
		
		// we can also specify index
		Student stud2=(Student)context.getBean("ambiguity2");
		stud2.get();
		
		((AbstractApplicationContext)context).close();
	}
}
