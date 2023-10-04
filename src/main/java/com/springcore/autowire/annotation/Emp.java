package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	
  private  Address address;
  
  

public Address getAddress() {
	return address;
	
             
}
@Autowired
@Qualifier("address2")

public void setAddress(Address address) {
	System.out.println("Inside setter method");
	this.address = address;
}


public Emp(Address address) {
	super();
	this.address = address;
	
	System.out.println("Inside constructor....");
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}







  
  
}
