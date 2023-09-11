package com.coforge.bean;		

import java.lang.management.GarbageCollectorMXBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {

	public static void main(String[] args) {
			
		BeanFactory ctx = new ClassPathXmlApplicationContext("beans.xml");
		User u1 = (User) ctx.getBean(User.class);
		System.out.println(u1);
		((AbstractApplicationContext) ctx).close();
		
	}
	
}