package com.springcore.lifecyclemethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SamosaMain {

	public static void main(String[] args) {
		
		
		
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecyclemethod/lifecycleconfig.xml");
		context.registerShutdownHook();
		Samosa samosa=(Samosa)context.getBean("lmethod");
		
	
		System.out.println(samosa);
		
		System.out.println("==============================================");
		
		Pepsi pepsi=(Pepsi)context.getBean("s1");
		System.out.println(pepsi);
		
//		LifecycleAnnotation annotation=(LifecycleAnnotation)context.getBean("annot");
//		
//		System.out.println(annotation);
		
		
		
		
	}

}
