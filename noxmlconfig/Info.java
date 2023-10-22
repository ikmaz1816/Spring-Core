package com.spring.noxmlconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Info {
	
	@Autowired
	private Student student;

	
	public Info(Student student) {
		super();
		this.student = student;
	}


	public Student getStudent() {
		return student;
	}
}
