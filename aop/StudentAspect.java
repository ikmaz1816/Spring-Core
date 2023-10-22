package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
///remove runtime from dependency
public class StudentAspect {
	
	@Before("execution(* com.spring.aop.AddingStudent.addStudent())")
	public void beforeAdd()
	{
		System.out.println("Process Instantiated");
	}
	/*
	 If any method call parameter then use
	 @Before("execution(* com.spring.aop.AddingStudent.addStudent(..))")
	public void beforeAdd()
	{
		System.out.println("Process Instantiated");
	}
	Same for after
	StudentApect is an aspect
	@before and @after -> advices
	beforeadd() and afteradd() are methods
	joins are actions that method perform
	 */
	@After("execution(* com.spring.aop.AddingStudent.addStudent())")
	public void afterAdd()
	{
		System.out.println("Process Completed");
	}
}
