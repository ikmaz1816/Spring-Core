package com.spring.autowiring;

public class ConstructorType {
	private Professor professor;

	public ConstructorType(Professor professor) {
		super();
		this.professor = professor;
	}
	public Professor getprofessor() {
		return professor;
	}
	
}
