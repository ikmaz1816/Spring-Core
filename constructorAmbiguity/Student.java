package com.spring.constructorAmbiguity;

public class Student {
	private int a;
	private int b;
	
	public Student(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("In Int");
	}
	
	public Student()
	{
		
	}
	public Student(double a,double b)
	{
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("In double");
	}
	public Student(String a,String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("In String");
	}
	
	public void get()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println(a+b);
	}
}
