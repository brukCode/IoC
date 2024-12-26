package com.ioc.day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args)
	{
//		Order order= new Order();
//		order.status();
//		
//		Order order2= new Order();
//		
//    
//     order.setOrderId(1);
//		order.setOrderName("Employee");
//		   order2.setOrderId(2);
//			order2.setOrderName("Employee");
//			
//		System.out.println( order);
//		
//	System.out.println(order2);
//	
//	Order order3 = new Order(2, "Manager");
//
//	// Print individual fields for the second Order object
//	System.out.println("Order ID: " + order3.getOrderId());
//	System.out.println("Order Name: " + order3.getOrderName());
//
//	
//	Order another = new Order();
//	//another(3, "Manger");
//	
//   
//	
//	ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("bean.xml");
//	
//	Hr obj = (Hr) applicationContext.getBean("Hrbean");
//
//	obj.position();
//	//obj.getEmpId();
//	
//	System.out.println("HR Employee ID: " + obj.getEmpId());
//	System.out.println("HR Employee ID: " + obj.getEmpName());
//	
//	Employe obj2= (Employe) applicationContext.getBean("empbean");
//	
//	System.out.println( obj2.getDepId());
//	System.out.println( obj2.getPosition());
	
	ApplicationContext Context = new AnnotationConfigApplicationContext(IocConfig.class);
	
//	Order obj3 = (Order) Context.getBean(Order.class);
//	obj3.status();
//	obj3 = new Order(2, "Manager");
//	
//	System.out.println("Order ID: " + obj3.getOrderId());
//	System.out.println("Order Name: " + obj3.getOrderName());
	
	//Autowire example
	
	Employe obj4 = (Employe) Context.getBean(Employe.class);
	obj4.employe();
	
	
	
	

	

        

	}

}
