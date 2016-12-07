package com.javastudy.test.oop;

public class Adder2 {
	public int add(int[] a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}

	public int add1(int... a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}
}
