package com.tyan.mangkubumi.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassContext {

	private static ApplicationContext context = new ClassPathXmlApplicationContext("config-db.xml");
	
	public static ApplicationContext getContext(){
		return context;
	}
	
	public static void setContext(ApplicationContext context){
		ClassContext.context = context;
	}
}
