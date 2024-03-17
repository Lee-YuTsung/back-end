package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Member;
import java.util.List;



public interface MemberRepository extends JpaRepository<Member, Integer>{

	Member findByUsername(String username);
	Member findByUsernameAndPassword(String username, String password);
}
