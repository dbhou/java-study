package com.javastudy.test.lianxi;

public class Test1 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 10, 10, 10);

		System.out.println(rectangle.getArea());

		Rectangle rectangle2 = new Rectangle(new Point(10, 10), 20, 20);
		System.out.println(rectangle2.getArea());

		Rectangle rectangle3 = new Rectangle();
		System.out.println(rectangle3.getArea());
	}
}
