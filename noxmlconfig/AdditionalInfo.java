package com.spring.noxmlconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("info")
public class AdditionalInfo {
	
	@Autowired
	private Info info;
	
	public void getInfo()
	{
		System.out.println(info.getStudent().getId());
	}
}
