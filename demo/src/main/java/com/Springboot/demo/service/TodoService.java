package com.Springboot.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Springboot.demo.model.Todo;

@Service
public class TodoService {
	
	private static List<Todo> todos=new ArrayList<Todo>();
	private static int todocount=3;
	
	static
	{
		todos.add(new Todo(1,"Sai","Learn Spring mvc",new Date(),false));
		todos.add(new Todo(2,"Sai","Learn Spring boot",new Date(),false));
		todos.add(new Todo(3,"Sai","Learn Spring hibernate",new Date(),false));

	}
	
	public List<Todo> retrieveTodo(String user)//sai
	{
		List<Todo> filteredTodos=new ArrayList<Todo>();
		for(Todo todo: todos)
		{
			if(todo.getUser().equals(user))
			{
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
	
	public void addTodo(String user,  String desc, Date targetDate,boolean isDone)
	{
		todos.add(new Todo(++todocount,user,desc,targetDate,isDone));
	}
	
	public void deleteTodo(int id)
	{
	   Iterator<Todo> iterator=todos.iterator();
	   while(iterator.hasNext())
	   {
		   Todo todo=iterator.next();
		   if(todo.getId()==id)
		   {
			   iterator.remove();
		   }
	   }
	}
	
	
	
	
	
	
	
	
	
	
	
}

