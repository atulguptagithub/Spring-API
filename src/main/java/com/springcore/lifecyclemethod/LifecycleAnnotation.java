package com.springcore.lifecyclemethod;



public class LifecycleAnnotation {
	
	
private String  subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}


public LifecycleAnnotation() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "LifecycleAnnotation [subject=" + subject + "]";
}


public void run()
{
	   System.out.println("This is Starting of method");
}



public void end()
{
	System.out.println("This is end method......");
}


}
