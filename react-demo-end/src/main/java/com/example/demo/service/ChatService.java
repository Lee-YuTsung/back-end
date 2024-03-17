package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Chat;

public interface ChatService {

	//create
	Chat add(Chat c);
	
	//read
	List<Chat> queryAll();
	
	//update
	
	//delete
	
}
