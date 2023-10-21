package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowiring {
	public static void main(String[] args) {
		/*
		 	Autowiring are of two types 
		 		Manual(Config)
		 		Annotation
		 		
		 	Manual
		 		byName
		 		constructor
		 		byType
		 		
		 	byName and constructor are same and byType refers to type and only one per type is allowed
		 	
		 	Annotation -> @AutoWired
		 	This is the same as byType but with @Qualifier it can be converted to byName and byType
		 	If used above setter or object it is setter injection else constructor injection
		 	
		 	Autowiring cannot be used with primitive data types
		 	In byName -> the name should be same in the bean and class 
		 	In byType -> the type should be same and there can only be one of that type in bean
		 */
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//		ByName byName=(ByName)context.getBean("name");
//		System.out.println(byName.getprofessor().getId()+" "+byName.getprofessor().getName());
//		
//		ByType byType=(ByType)context.getBean("type");
//		System.out.println(byType.getProfessor().getId()+" "+byType.getProfessor().getName());
//		
//		ConstructorType constr=(ConstructorType)context.getBean("con");
//		System.out.println(constr.getprofessor().getId()+" "+constr.getprofessor().getName());
		
		Annotations annotate=(Annotations)context.getBean("prof1");
		System.out.println(annotate.getProfessor().getId()+" "+annotate.getProfessor().getName());
		((AbstractApplicationContext)context).close();
		
	}
}
