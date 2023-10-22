package com.spring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("object1")
//If you dont specify name it considers the name laptop->Laptop
//Now it can directly be used without config.xml but in config we have to specify <context:component-scan base-package="">
//We can also use component scan here as well
@ComponentScan("com.spring.component")
public class Laptop {

	@Autowired 
	private LaptopCharacteristics feature;

	public LaptopCharacteristics getFeature() {
		return feature;
	}

	public void setFeature(LaptopCharacteristics feature) {
		this.feature = feature;
	}
	
	
}
