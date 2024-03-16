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
	
	@PostMapping("/register")
	public Member register(@RequestBody Member m) {
		
		return ms.register(m);
	}
	
	@PostMapping("/login")
	public Member login(String username, String password) {
		System.out.println(username + ":" + password);
		
		return ms.queryUser(username, password);
	}
	
	@PostMapping("/update")
	public Member update(@RequestBody Member m) {
		System.out.println(m.getId());
		return ms.updateMember(m);
	}
	
	@GetMapping("/queryAll")
	public List<Member> memberList(){
		
		return ms.queryAll();
	}
}
