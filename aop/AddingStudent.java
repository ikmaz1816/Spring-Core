package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class AddingStudent {
	public void addStudent()
	{
		System.out.println("Student Added");
	}
}
