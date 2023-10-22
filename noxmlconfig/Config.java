package com.spring.noxmlconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.noxmlconfig") //WHen we use bean there is no need of component scan as well
public class Config {
   @Bean
   public Student getStudent()
   {
	   Student stud=new Student();
	   stud.setId(1);
	   stud.setName("Imran");
	   return stud;
   }
   
   @Bean
   public Info getInfo()
   {
	   Info info=new Info(getStudent());
	   return info;
   }
}
