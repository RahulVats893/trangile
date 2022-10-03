package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	public Example(String subject) {
		super();
		this.subject = subject;
	}
	
	@PostConstruct
	public void satrt() {
		System.out.println("initialisation started...");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("end is coming to me...");
	}
	

}
