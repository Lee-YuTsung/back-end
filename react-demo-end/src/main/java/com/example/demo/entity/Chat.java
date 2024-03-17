package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="chat")
public class Chat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String subject;
	private String content;
	
	public Chat(String name, String subject, String content) {
		super();
		this.name = name;
		this.subject = subject;
		this.content = content;
	}
	public Chat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
