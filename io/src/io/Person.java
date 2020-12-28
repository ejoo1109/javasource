package io;

import java.io.Serializable;

public class Person implements Serializable{
	/**
	*역직렬화시 직렬화된 같은 클래스 인지를 판별
	*/
	
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String job;
	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
	
}
