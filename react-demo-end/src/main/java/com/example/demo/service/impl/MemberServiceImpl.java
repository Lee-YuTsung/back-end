package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Autowired
	private MemberRepository mr;
	
	@Override
	public Member add(Member m) {
		if(mr.findByUsername(m.getUsername()) == null) {
			return mr.save(m);
		}
		return null;
	}

	@Override
	public List<Member> queryAll() {
		// TODO Auto-generated method stub
		return mr.findAll();
	}

	@Override
	public Member queryUser(String username, String password) {
		// TODO Auto-generated method stub
		return mr.findByUsernameAndPassword(username, password);
	}

}
