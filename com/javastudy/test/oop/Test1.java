package com.javastudy.test.oop;

public class Test1 {
	public static void main(String[] args) {
		Point point = new Point(10, 10);
		System.out.println(point.distance());

		Point point2 = new Point(20, 20);
		System.out.println(point2.distance());
		System.out.println(point.distance(point2));

		Point point3 = new Point();
		System.out.println(point3.x + "," + point3.y);
	}
}
