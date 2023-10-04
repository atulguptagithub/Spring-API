package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new  ClassPathXmlApplicationContext("com/springcore/standalone/collection/standcollectionconfig.xml");
		
		Person  person=(Person)context.getBean("person");
		
		System.out.println(person);
		
		System.out.println(person.getFriends().getClass().getName());
		
		System.out.println("==============================================================================================");
		
		System.out.println(person.getFeestructure().getClass().getName());
		
		System.out.println("=================================================================================================");
		
		System.out.println(person.getProperties());
		
		
	}

}
