package com.coforge.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Survey {

	private int surveyId;
	private String surveyName;
	private String surveyLocation;
	
	@Autowired
	private SurveyUser surveyUser;
	
	@PostConstruct
	public void startUp(){
		this.surveyId = 7324;
		this.surveyName = "Coforge feedback survey";
		this.surveyLocation = "Virtual";
		System.out.println("Init called .... ");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("\nClean up called .... ");
	}
	
}
