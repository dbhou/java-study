package com.javastudy.test.lianxi;

public class Rectangle {
	private Point location;
	private double w, h;

	public Rectangle(Point location, double w, double h) {
		this.location = location;
		this.w = w;
		this.h = h;
	}

	public Rectangle(double x, double y, double w, double h) {
		this(new Point(x, y), w, h);
	}

	public Rectangle() {
	}

	public double getArea() {
		return w * h;
	}

	public double getLength() {
		return 2 * (w + h);
	}

	public boolean contains(Point p) {
		return true;
	}

	public boolean contains(double x, double y) {
		return this.contains(new Point(x, y));
	}

}
