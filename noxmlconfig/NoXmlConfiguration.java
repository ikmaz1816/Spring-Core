package com.spring.noxmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class NoXmlConfiguration {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		AdditionalInfo info=(AdditionalInfo)context.getBean("info");
		info.getInfo();
		((AbstractApplicationContext)context).close();
	}
}
