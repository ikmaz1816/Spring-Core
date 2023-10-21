package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Annotations {
//	@Autowired
	@Qualifier("prof1")
	//Now we will be having the same name in config file as well and hence it becomes the same as byName and constructor
	private Professor professor;
	
	//If you write it above property or setter it is setter injection
//	@Autowired
//	public void setProfessor(Professor prof)
//	{
//		professor=prof;
//	}
	//For @Autowired in config.xml we have to use <context:component-scan base-package="base package path">
	
	//If you write it above constructor it becomes constructor injection
	//It is by default a byType to specify name we can use qualifier
	@Autowired
	public Annotations(Professor prof)
	{
		professor=prof;
	}
	public Professor getProfessor()
	{
		return this.professor;
	}
}
