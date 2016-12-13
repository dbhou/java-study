package com.javastudy.test.oop2;

public class Point {
	private double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point() {

	}

	public double distance() {
		return Math.sqrt(Math.abs(this.x * x) + Math.abs(this.y * y));
	}

	public double distance(Point p) {
		return Math.sqrt(Math.abs((x - p.x) * (x - p.x)) + Math.abs((y - p.y) * (y - p.y)));
	}

	public void showLocation() {
		System.out.println(this.x + ":" + this.y);
	}
}
