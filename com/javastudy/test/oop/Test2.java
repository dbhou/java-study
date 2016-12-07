package com.javastudy.test.oop;

public class Test2 {
	public static void main(String[] args) {
		Adder adder = new Adder();

		System.out.println(adder.add(10, 10));
		System.out.println(adder.add(20, 10, 20));
		System.out.println(adder.add('a', 'b'));

		Adder2 adder2 = new Adder2();
		System.out.println(adder2.add(new int[] {}));
		System.out.println(adder2.add(new int[] { 1 }));
		System.out.println(adder2.add(new int[] { 1, 2, 3 }));

		System.out.println(adder2.add1());
		System.out.println(adder2.add1(1));
		System.out.println(adder2.add1(1, 2));
		System.out.println(adder2.add1(1, 2, 3));
		System.out.println(adder2.add1(new int[] { 1, 2, 3, 4, 5 }));
	}
}
