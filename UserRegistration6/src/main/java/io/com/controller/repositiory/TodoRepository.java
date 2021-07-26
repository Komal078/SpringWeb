package io.com.controller.repositiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.com.entity.todo;



public interface TodoRepository extends JpaRepository<todo, Integer> {
	List<todo> findByUser(String user);
		
		//service.retrieveTodos(name)

		//service.deleteTodo(id);
		//service.retrieveTodo(id)
		//service.updateTodo(todo)
		//service.addTodo(getLoggedInUserName(model), todo.getDesc(), todo.getTargetDate(),false);
	}

