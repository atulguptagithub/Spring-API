package com.spring.collections;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/collections/collectionconfig.xml");
          Emp  em=(Emp)context.getBean("employee");
        
        System.out.println(em.getName());
        System.out.println("###########################################");
        System.out.println(em.getPhones());
        System.out.println(em.getAddresses());
        System.out.println(em.getCourses());
	}

}
