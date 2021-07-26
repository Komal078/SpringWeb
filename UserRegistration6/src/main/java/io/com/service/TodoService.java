package io.com.service;



	import java.util.ArrayList;
	import java.util.Date;
	import java.util.Iterator;
	import java.util.List;

	import org.springframework.stereotype.Service;

import io.com.entity.todo;



@Service
public class TodoService {
	
	private static List<todo> todos=new ArrayList<todo>();
	private static int todoCount=3;
	
	
	public List<todo> retrieveTodos(String user) {
        List<todo> filteredTodos = new ArrayList<todo>();
        for (todo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

	public todo retrieveTodo(int id)
	{
		for(todo todo:todos)
		{
			if(todo.getId()==id)
			{
				return todo;
			}
		}
		return null;
	}
	public void updateTodo(todo todo)
	{
		todos.remove(todo);
		todos.add(todo);
	}
	
	
	
	
	
	
    public void addTodo(String name, String desc, Date target_Date, boolean is_Done) {
        todos.add(new todo(++todoCount, name, desc, target_Date, is_Done));
    }
   

    public void deleteTodo(int id) {
        Iterator<todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            todo todo = iterator.next();
            if (todo.getId() == id) {
                iterator.remove();
            }
        }
    }
}
