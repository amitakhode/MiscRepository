package com.Spring.one.Spring5;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class SimpleLogic implements InitializingBean{

	public SimpleLogic() {
		System.out.println("Class is created");
	}
	
	@PostConstruct 
	public void init() {
		System.out.println("Class was initialized");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception{
		System.out.println("Class is initialized in afterPropertieSet");
	}
	
	@PreDestroy
	public void destroyed() {
		System.out.println("Bean is about to destroy");
	}
}
