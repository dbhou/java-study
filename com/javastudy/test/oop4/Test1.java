package com.javastudy.test.oop4;

public class Test1 {
	public static void main(String[] args) {
		Person person = new Person();

		person.h = 175;

		Person person2 = new Person();
		person2.h = 185;
		person = person2;// person引用了person2引用的对象
		System.out.println(person.h + "," + person2.h);

		person.h = 195;
		System.out.println(person.h + "," + person2.h);

		System.out.println(person.equals(person2));
	}
}

class Person {
	int h;

	public boolean equals(Person person) {
		return this.h == person.h;
	}
}