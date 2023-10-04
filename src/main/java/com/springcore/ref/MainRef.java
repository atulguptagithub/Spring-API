package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRef {
	
	public static void main(String[] args) {
		
		
		ApplicationContext   context =new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		
		A ob=(A)context.getBean("aref");
		System.out.println(ob.getX());
		
		System.out.println(ob.getOb().getY());
		
		System.out.println(ob);
		
	}

}
