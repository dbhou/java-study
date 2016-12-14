package com.javastudy.test.oop3;

public class Rectangle extends Shape {
	private double w, h;

	public Rectangle(Point location, double w, double h) {
		super(location);
		this.w = w;
		this.h = h;
	}

	public Rectangle(double x, double y, double w, double h) {
		this(new Point(x, y), w, h);
	}

	public double getArea() {
		return w * h;
	}

	public double getLength() {
		return 2 * (w + h);
	}

	public void xx() {
		System.out.println("hello");
	}
}
