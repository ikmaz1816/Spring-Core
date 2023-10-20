package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifecyleUsingAnnotation {
	@PostConstruct
	public void init()
	{
		System.out.println("In Init Annotate");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("In Annotate Destroy");
	}
}
