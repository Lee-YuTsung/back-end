package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Member;
import com.example.demo.service.impl.MemberServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberServiceImpl ms;
	
	@PostMapping("/login")
	public Member login(String username, String password) {
		
		return ms.queryUser(username, password);
	}
	
	@PostMapping("/add")
	public Member add(@RequestBody Member m) {
		
		return ms.add(m);
	}
	
	@GetMapping("/queryAll")
	public List<Member> queryAll(){
		return ms.queryAll();
	}
}
