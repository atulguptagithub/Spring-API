package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdditionMain {
	
	
	public static void main(String[] args) {
		
		
	ApplicationContext context=	 new ClassPathXmlApplicationContext("com/springcore/constructorinjection/coninjection.xml");
	
	Addition addition=(Addition)context.getBean("addition");
	
	
	
	  addition.doSum();
	
	}

}
