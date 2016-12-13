package com.javastudy.test.oop2;

public class Test4 {
//	static {
//		System.out.println("hello world");
//		System.exit(0);
//	}

	public static void main(String[] args) {
		Person2 person2 = new Person2(75);
		Person2 person22 = new Person2(80);

		Person2.f();
		person22.f();
	}
}

class Person2 {
	private int h, w;
	{
		System.out.println("aa...");
		h = 175;
	}

	public Person2(int w) {
		System.out.println("bb");
		this.w = w;
	}

	public static int diqiu;
	static {
		System.out.println("cc....");
		diqiu = 1;
	}

	public static void f() {
		System.out.println("hello");
	}
}