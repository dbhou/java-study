package com.javastudy.test.oop2;

public class Test3 {
	public static void main(String[] args) {
		Person1 person = new Person1(70);
		person.show();

		Person1 person2 = new Person1(75);
		person2.show();

		System.out.println("===============================");

		System.out.println(Person1.diqiu);
		System.out.println(person.diqiu);
		System.out.println(person2.diqiu);

		Person1.diqiu = 2;
		System.out.println(Person1.diqiu);
		System.out.println(person.diqiu);
		System.out.println(person2.diqiu);

		person.diqiu = 3;
		System.out.println(Person1.diqiu);
		System.out.println(person.diqiu);
		System.out.println(person2.diqiu);
	}
}

class Person1 {
	private int h = 175;
	// {
	// h=175;
	// System.out.println("aa...");
	// }
	private int w;

	public static int diqiu = 1;

	public Person1(int w) {
		System.out.println("bb");
		this.w = w;
	}

	public void show() {
		System.out.println(h + "," + w);
	}
}