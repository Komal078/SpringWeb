package io.cts.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.com.controller.repositiory.TodoRepository;
import io.com.entity.todo;

@SpringBootTest

class UserDaoImplTest {
	@Autowired
	TodoRepository todoRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void todotest() {
		todo todo1 = new todo();
		todo1.setId(1);
		todo1.setUser("komal");
		todo1.setDesc("spring jpa");
		todo1.setTarget_Date(Calendar.getInstance().getTime());
		todo1.setIs_Done(false);

		todoRepo.save(todo1);
	}
	
	@Test
	public void testRead()
	{
		todo todo=todoRepo.findById(1).get();
		assertNotNull(todo);
		assertEquals("komal",todo.getUser());
		System.out.println(todo.getDesc());
	}
	
	@Test
	public void testUpdate()
	{
		todo todo=todoRepo.findById(1).get();
		todo.setUser("susan");
		todoRepo.save(todo);
	}
	
	@Test
	public void testDelete()
	{
		if(todoRepo.existsById(1))
		{
		      todoRepo.deleteById(1);
	    }
	}
	 
	
	
	
	
}