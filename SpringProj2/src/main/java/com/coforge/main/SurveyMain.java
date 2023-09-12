package com.coforge.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Survey;

public class SurveyMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		BeanFactory ctx = new ClassPathXmlApplicationContext("beans.xml");
		Survey s1 = ctx.getBean(Survey.class);
		
		System.out.println("\nSurvey Details: ");
		System.out.println("\tId: "+s1.getSurveyId());
		System.out.println("\tName: "+s1.getSurveyName());
		System.out.println("\tLocation: "+s1.getSurveyLocation());
		System.out.println("\nSurvey User details: ");
		System.out.println("\tUser Id: "+s1.getSurveyUser().getUserId());
		System.out.println("\tUser name: "+s1.getSurveyUser().getUserName());
		
		((AbstractApplicationContext) ctx).close();
		
	}
	
}
