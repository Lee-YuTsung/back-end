package com.example.demo.util;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Check.checkEmailRegular("misty110.230@gmail.com"));
		System.out.println(Check.compared(10, 20));
	}

	public static Boolean checkEmailRegular(String email) {
		
		return email.matches("^[a-zA-Z0-9.]{1,63}@[a-zA-Z0-9]{2,63}(\\.[a-zA-Z]{2,63})?$");
	}
	
	public static Boolean checkUsername(String username) {
		
		return username.matches("[\\w\\.]?$");
	}
	
	public static <T>T compared(T before, T after){
		return after != null && after != "" ? after : before; 
	}
}
