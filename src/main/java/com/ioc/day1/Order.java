package com.ioc.day1;

import org.springframework.stereotype.Component;

//import javax.management.loading.PrivateClassLoader;

@Component
public class Order {
	
	private int orderId;
	private String orderName;
	
	public void status() {
		System.out.println("Orer is pl;aced");
	}

	public Order(int orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + "]";
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}


}