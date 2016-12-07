package com.javastudy.test.oop;

public class Point {
	double x, y;

	public Point() {
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distance() {
		return Math.sqrt(x * x + y * y);
	}

	public double distance(Point p) {
		return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
	}
}
