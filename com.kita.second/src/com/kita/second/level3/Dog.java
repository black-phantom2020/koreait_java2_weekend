package com.kita.second.level3;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	String getName() {
		return name;
	}
	
	@Override
	void cry() {
		System.out.println("개가 운다.");
	}
}