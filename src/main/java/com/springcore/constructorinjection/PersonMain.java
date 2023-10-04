package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {
	
	public static void main(String[] args) {
		
		
		
		ApplicationContext  context=new ClassPathXmlApplicationContext("com/springcore/constructorinjection/coninjection.xml");
		
		Person ob=(Person)context.getBean("person");
		
		System.out.println(ob);
		
		
		
		
		
		
	}

}
