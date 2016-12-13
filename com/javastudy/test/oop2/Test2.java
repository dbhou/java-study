package com.javastudy.test.oop2;

public class Test2 {
	public static void main(String[] args) {
		Person person = new Person();
		person.addH().addH().addH().addH().printH();
	}

}

class Person {
	private int h;

	public Person addH() {
		this.h++;
		return this;
	}

	public void printH() {
		System.out.println(h);
	}
}
