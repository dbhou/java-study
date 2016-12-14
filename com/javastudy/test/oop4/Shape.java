package com.javastudy.test.oop4;

public abstract class Shape {
	private Point location;

	public Shape(Point location) {
		this.location = location;
	}

	public Shape() {
	}

	public void showLocation() {
		location.showLocation();
	}

	public abstract double getArea();

	public abstract double getLength();
}
