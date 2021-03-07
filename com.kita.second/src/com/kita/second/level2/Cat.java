package com.kita.second.level2;

public class Cat extends Animal {
	public Cat(String name) {
//		super();
		super(name);
	}
	
	@Override
	void cry() {
		System.out.println("고양이가 운다.");
	}
	// 고양이가 운다.
}




