package com.spring.component;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
/*
 	There are two types of scopes -> Singleton and prototype
 	Singleton -> Throws same object every time
 	Prototype-> Throws different object every time
 	We can also define scope with the help of above annotations
 */
public class LaptopCharacteristics {
	
	
	@Value("123")
	private int id;
	
	//This is Spel->Spring expression language
	@Value("#{2+3}")
	private int sum;

	@Value("#{2==3}")
	public boolean flag;
	
//	@Value("{T(java.lang.Math).PI}")
//	public double pi;
//	
//	@Value("#{T(java.lang.Math).sqrt(10)}")
//	public double tensqrt;
	//to use this we can create a bean PropertySourcesPlaceholderConfigurer 
	
	
	public int getId() {
		return id;
	}
	
	

	public int getSum() {
		return sum;
	}
	
	
}
