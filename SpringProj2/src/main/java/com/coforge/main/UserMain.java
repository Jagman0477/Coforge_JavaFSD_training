package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.service.UserService;

public class UserMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		UserService userService1 = ctx.getBean(UserService.class);
		System.out.println(userService1);
		System.out.println("User details: ");
		System.out.println("\tId: " + userService1.getU1().getUserId());
		System.out.println("\tName: " + userService1.getU1().getUserName());
		System.out.println("\tSalary: " + userService1.getU1().getUserSalary());

		((AbstractApplicationContext) ctx).close();

	}

}
