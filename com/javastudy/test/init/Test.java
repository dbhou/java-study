package com.javastudy.test.init;

public class Test {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		Person p1 = new Person("zhangsan", 175, 75);
		p1.walk();
		p1.eat();

		Person p2 = new Person("lisi", 165, 50);
		p2.walk();

		Clock c1 = new Clock(12, 10, 11);
		c1.showTime();
	}
}
