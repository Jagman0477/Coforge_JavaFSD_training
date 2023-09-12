package com.coforge.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class SurveyUser {

	private int userId;
	private String  userName;
	
	@PostConstruct
	public void startUp() {
		this.userId = 101;
		this.userName = "Jesus H. Christ";
	}
	
}
