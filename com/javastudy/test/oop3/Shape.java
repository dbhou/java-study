package com.javastudy.test.oop3;

public class Shape {
	private Point location;

	public Shape(Point location) {
		this.location = location;
	}

	public Shape() {
	}

	public void showLocation() {
		location.showLocation();
	}

	public double getArea() {
		return 0;
	}

	public double getLength() {
		return 0;
	}
}
