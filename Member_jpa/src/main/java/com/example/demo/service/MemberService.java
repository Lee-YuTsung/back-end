package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Member;

public interface MemberService {

	//create
	Member register(Member m);
	
	//read
	List<Member> queryAll();
	Member queryUser(String username, String password);
	Boolean checkUsername(String username);
	
	//update
	Member updateMember(Member m);
	
	//delete
	void deleteMember(Integer id);
	
}
