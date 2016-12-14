package com.javastudy.test.lianxi;

public class Point {
	private double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
	}

	public double distance() {
		return Math.sqrt(x * x + y * y);
	}

	public double distance(Point p) {
		return Math.sqrt(Math.abs((x - p.x) * (x - p.x)) + Math.abs((y - p.y) * (y * p.y)));
	}

	public void showLocation() {
		System.out.println(x + "," + y);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}
}
