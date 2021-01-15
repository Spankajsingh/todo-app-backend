package com.pankajsingh.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResource {
	
	@Autowired
	private TodoHardCodedService todoService;
	
	@GetMapping("user/{username}/todos")
	public List<Todo> getAllTodos(String username) {
		return todoService.findAll();
	}
	

}
