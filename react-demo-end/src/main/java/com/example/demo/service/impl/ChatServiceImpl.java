package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Chat;
import com.example.demo.repository.ChatRepository;
import com.example.demo.service.ChatService;

@Service
public class ChatServiceImpl implements ChatService{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Autowired
	private ChatRepository cr;
	
	@Override
	public Chat add(Chat c) {
		// TODO Auto-generated method stub
		return cr.save(c);
	}

	@Override
	public List<Chat> queryAll() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}
}
