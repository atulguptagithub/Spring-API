package com.spring;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test.StudentBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Lets come with real time project and learn" );
        
      ApplicationContext applicationContext= new ClassPathXmlApplicationContext("config.xml");
      StudentBean bean=(StudentBean) applicationContext.getBean("student1");
      System.out.println(bean);
      
      System.out.println("=======================================================================");
      
      
     StudentBean bean2=(StudentBean) applicationContext.getBean("student2");
     System.out.println(bean2);
     System.out.println("=========================================================================");
     
     
   
     
   
 
      
     
      
      
       
       
        
        
        
    }
}
