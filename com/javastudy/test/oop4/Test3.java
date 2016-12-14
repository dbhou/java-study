package com.javastudy.test.oop4;

public class Test3 {
	public static void main(String[] args) {
		B b = new B();
	}
}

class A {
	public A() {
		this.test();
		System.out.println("aa...");
	}

	public void test() {
		System.out.println("hello ");
	}
}

class B extends A {
	private int i = 11;

	public void test() {
		System.out.println(i);
	}
}