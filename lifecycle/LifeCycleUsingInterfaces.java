package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleUsingInterfaces implements InitializingBean,DisposableBean{
	//In this there is no need to specify the init-method and destroy-method
	public void afterPropertiesSet() 
	{
		//Initializing 
		System.out.println("In Init Interface");
	}
	public void destroy() 
	{
		//Destroying
		System.out.println("In Destroy Interface");
	}
	
}
