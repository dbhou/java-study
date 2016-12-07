package com.javastudy.test.init;

public class Person {
	private String name;
	private double height, walk;

	public Person(String name, double height, double walk) {
		this.name = name;
		this.height = height;
		this.walk = walk;
	}

	public Person() {
	}

	public void walk() {
		System.out.println(name + " is walking...");
	}

	public void eat() {
		System.out.println(name + " is eating...");
	}

}
