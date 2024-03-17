package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Member;

public interface MemberService {

	//create
	Member add(Member m);
	
	//read
	List<Member> queryAll();
	Member queryUser(String username, String password);
	
	//update
	
	//delete
	
}
