package com.Springboot.demo.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	public boolean  validateUser(String userId,String password)
	{
		return userId.equalsIgnoreCase("Sai") && password.equalsIgnoreCase("demo");
	}

}
