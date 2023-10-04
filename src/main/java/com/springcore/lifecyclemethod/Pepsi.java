package com.springcore.lifecyclemethod;

import org.springframework.beans.factory.DisposableBean;

import org.springframework.beans.factory.InitializingBean;

public class Pepsi  implements  InitializingBean,DisposableBean{
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("This is for taking pepsi: init");
		
		
	}
	
	

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("After drinking pepsi :destroy");
		
	}
	

}
