package com.kita.second.level2;

public class Animal extends Object {
	String name;
	int age;
	
	public Animal(String name) {
//		super();
		this.name = name;
	}
	
	void cry() {
		System.out.println("동물이 운다.");
	}
}
