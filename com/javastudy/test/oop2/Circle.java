package com.javastudy.test.oop2;

public class Circle {
	private Point p;
	private double r;

	public Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}

	public Circle() {

	}

	public Circle(double x, double y, double r) {
		// this.p = new Point(x,y);
		// this.r = r;
		//
		this(new Point(x, y), r);
	}

	public boolean contains(Point p1) {
		return p.distance(p1) <= r;
	}

	public boolean contains(double x, double y) {
		return this.contains(new Point(x, y));
	}

	public double getArea() {
		return Math.PI * r * r;
	}

	public double getRoundLength() {
		return Math.PI * 2 * r;
	}
}
