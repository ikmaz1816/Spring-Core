package com.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ApplicationContext application = new ClassPathXmlApplicationContext("config.xml");
    Student student=(Student)application.getBean("stud");
    System.out.println(student);
    // We need to downcast so that we can close the application context
    ((ConfigurableApplicationContext)application).close();
    //Or use AbstractApplicationContext
    ((AbstractApplicationContext)application).registerShutdownHook();
    //any can be used to close the context
  }
}
