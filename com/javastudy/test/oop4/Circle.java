package com.javastudy.test.oop4;

public class Circle extends Shape {
	private double r;

	public Circle() {
	}

	public Circle(Point location, double r) {
		super(location);
		this.r = r;
	}

	public Circle(double x, double y, double r) {
		this(new Point(x, y), r);
	}

	public double getArea() {
		return Math.PI * r * r;
	}

	public double getLength() {
		return Math.PI * 2 * r;
	}

}
