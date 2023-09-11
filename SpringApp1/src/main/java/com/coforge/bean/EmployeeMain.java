package com.coforge.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	
	public static void main(String[] args) {
			BeanFactory ctx = new ClassPathXmlApplicationContext("beans.xml");
			Employee e1 = (Employee) ctx.getBean("emp1");
			e1.setEmpId(10002);
			e1.setEmpName("Bishan Bedi");
			e1.setEmpSalary(56000.35f);
			
			System.out.println(e1.toString());
			
			Employee e2 = ctx.getBean("emp1", Employee.class); // Different casting technique used here
			
			e1.setEmpId(10003);
			e1.setEmpName("Richard Hoffman");
			e1.setEmpSalary(526000.35f);
			
			// Each bean has singleton nature.
			System.out.println(e1.toString());
			System.out.println(e2.toString());
	}
	
}
