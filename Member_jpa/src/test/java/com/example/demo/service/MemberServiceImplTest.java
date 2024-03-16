package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Member;
import com.example.demo.service.impl.MemberServiceImpl;

@SpringBootTest
public class MemberServiceImplTest {

	@Autowired
	private MemberServiceImpl ms;
	
	@Transactional
	@Test
	public void updateTest() {
		Member m = ms.queryUser("aaa", "aaa");
		
		m.setPassword(null);
		
		System.out.println(ms.updateMember(m));
	}
}
