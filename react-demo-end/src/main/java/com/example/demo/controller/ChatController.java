package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Chat;
import com.example.demo.service.impl.ChatServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/chat")
public class ChatController {

	@Autowired
	private ChatServiceImpl cs;
	
	@PostMapping("/add")
	public Chat add(@RequestBody Chat c) {
		
		return cs.add(c);
	}
	
	@GetMapping("/queryAll")
	public List<Chat> queryAll(){
		
		return cs.queryAll();
	}
}
