package com.coforge.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.coforge.model.User;

import lombok.Data;

@Service
@Data
public class UserService {

	// @Autowired
	// @Qualifier("suser")
	// Resource = Qualifier('name') + Autowired
	@Resource(name = "suser")
	User u1;

}
