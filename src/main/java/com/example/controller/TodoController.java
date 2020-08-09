package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.repository.TodoRepository;

@RestController
public class TodoController {
	
	@Autowired
	TodoRepository todoRepository;

	@RequestMapping("/getAllTodos")
    public ResponseEntity<Object> getAllTodos() {
    	return new ResponseEntity<>(todoRepository.findAll(), HttpStatus.OK);
    }
}
