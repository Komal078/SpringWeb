package io.com.controller;



import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.com.service.TodoService;




@Controller
public class TodoController {

	@Autowired
	TodoService service;
	
	
	
	

	

//	private String getLoggedInUserName(ModelMap model) {
//		Object principal = SecurityContextHolder.getContext()
//				.getAuthentication().getPrincipal();
//		
//		if (principal instanceof UserDetails) {
//			return ((UserDetails) principal).getUsername();
//		}
//		
//		return principal.toString();
//	}

	
	@RequestMapping(value = "/academic")
	public String showAcademicPage() {
		return "academic";
	}
	
	@RequestMapping(value="/professional")
	public String showAcademicPage1() {
		return "professional";
	}
	
	@RequestMapping(value="/business")
	public String showAcademicPage2() {
		return "business";
	}
	@RequestMapping(value="/Contact")
	public String showAcademicPage3() {
		return "Contact";
	}
	

	@RequestMapping(value="/home")
	public String showHome() {
		
		return "home";
	}
}
