package com.javastudy.test.oop3;

public class Test1 {
	public static void main(String[] args) {
		Circle circle = new Circle(10, 10, 10);
		circle.showLocation();

		System.out.println("圆形的面积为："+circle.getArea());
		System.out.println("==============================");

		Rectangle rectangle = new Rectangle(10, 10, 10, 10);
		System.out.println(rectangle.getArea());

		Shape shape = new Rectangle(10, 10, 10, 10);
		System.out.println(shape.getArea());
	}
}
