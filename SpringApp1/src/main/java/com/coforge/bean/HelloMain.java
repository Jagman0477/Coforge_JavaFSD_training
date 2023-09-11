package com.coforge.bean;

import com.coforge.bean.HelloImplement;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		
		BeanFactory ctx;
		ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		HelloImplement h = (HelloImplement)ctx.getBean("Hell");
		h.display();
	}
	
}