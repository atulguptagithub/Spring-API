package com.springcore.lifecyclemethod;

public class Samosa {
	
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	
	System.out.println("This is used for setting the value");
	this.price = price;
}

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}


public void init()

{
	  System.out.println("This is init method");
}

public void destroy()

{
	System.out.println("This is destroy method...");
}



}
