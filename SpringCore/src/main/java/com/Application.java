package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infy.model.User;

public class Application {
	public static void main(String[] args) {
		
	
	ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
	User user=  container.getBean("user",User.class);
	System.out.println(user);
	User user2=  container.getBean("user2",User.class);
	System.out.println(user2);
//	User user3=  container.getBean("user",User.class);
//	System.out.println(user3);
//	
	

}
}

