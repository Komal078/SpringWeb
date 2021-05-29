package com.Springboot.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.Springboot.demo.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	@Autowired
	TodoService service;
	@RequestMapping(value="/list-todos",method=RequestMethod.GET)
    public String showlisttodo(ModelMap model)
	{
		String name=(String)model.get("name");
		model.put("todos",service.retrieveTodo(name));
		return "list-todos";
	}
	
	@RequestMapping(value="/add-todos",method=RequestMethod.GET)
    public String Showaddtodo(ModelMap model)
	{
		return "add-todo";
	}
	
	@RequestMapping(value="/delete-todos",method=RequestMethod.GET)
    public String deletetodo(@RequestParam int id)
	{
		service.deleteTodo(id);
		return "redirect:/list-todos";
		
	}
	
	
	
	
	
	
	
	@RequestMapping(value="/add-todos",method=RequestMethod.POST)
    public String addtodo(ModelMap model,@RequestParam String desc)
	{
	    service.addTodo((String)model.get("name"), desc, new Date(), false);
	    return "redirect:/list-todos";
	}
	
	

}
