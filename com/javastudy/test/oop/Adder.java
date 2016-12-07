package com.javastudy.test.oop;

public class Adder {
	int add(int a, int b) {
		System.out.println("add1");
		return a + b;
	}

	int add(char a, char b) {
		System.out.println("add2");
		return a + b;
	}

	int add(int a, int b, int c) {
		System.out.println("add3");
		return a + b + c;
	}

	double add(double a, double b) {
		System.out.println("add4");
		return a + b;
	}
}
