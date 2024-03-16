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
	public Member register(Member m) {
		// TODO Auto-generated method stub
		return mr.findByUsername(m.getUsername()) == null ? mr.save(m) : null;
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

	@Override
	public Boolean checkUsername(String username) {
		// TODO Auto-generated method stub
		//重複 已存在 return false，不存在不重複 return true
		return mr.findByUsername(username) == null ;
	}

	@Override
	public Member updateMember(Member after) {
		// TODO Auto-generated method stub
		Member before = mr.findById(after.getId()).get();
		//將新資料中的username覆蓋掉，避免被修改
		after.setUsername(before.getUsername());
		//避免輸入空字串或null
		//after.setPassword(compared(before.getPassword(), after.getPassword()));
		after.setName(compared(before.getName(), after.getName()));
		after.setPhone(compared(before.getPhone(), after.getPhone()));
		after.setTelephone(compared(before.getTelephone(), after.getTelephone()));
		after.setAddress(compared(before.getAddress(), after.getAddress()));
		after.setEmail(compared(before.getEmail(), after.getEmail()));
		
		return mr.save(after);
	}

	@Override
	public void deleteMember(Integer id) {
		// TODO Auto-generated method stub
		mr.deleteById(id);
	}

	//前後對照有無null或空字串
	private <T>T compared(T before, T after){
		return after != null && after.toString() != "" ? after : before; 
	}
}
