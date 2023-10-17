package com.spring.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//Calling the context
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		//Using Property
		PrimitiveData data=(PrimitiveData)context.getBean("primitive");
		System.out.println(data);
		
		//using p schema-> property setter injection
		PrimitiveData data1=(PrimitiveData)context.getBean("primitive1");
		System.out.println(data1);
		
		//using constructor-> property constructor injection
		PrimitiveData data2=(PrimitiveData)context.getBean("primitive2");
		System.out.println(data2);
		
		//Using c schema
		PrimitiveData data3=(PrimitiveData)context.getBean("primitive3");
		System.out.println(data3);
		
		NonPrimitive nonData=(NonPrimitive)context.getBean("nonprimitive");
		System.out.println(nonData.getList());
		System.out.println(nonData.getSet());
		System.out.println(nonData.getMap().keySet());
		System.out.println(nonData.getMap().values());
		System.out.println(nonData.getProp());
		
		
		References ref=(References)context.getBean("object");
		System.out.println(ref.getNonPrimitive().getList());
		
		
		((ConfigurableApplicationContext)context).close();
	}
}
