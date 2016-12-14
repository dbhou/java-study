package com.javastudy.test.oop4;

public class Rectange extends Shape {
	private double w, h;

	public Rectange(Point location, double w, double h) {
		super(location);
		this.w = w;
		this.h = h;
	}

	public Rectange(double x, double y, double w, double h) {
		this(new Point(x, y), w, h);
	}

	public Rectange() {
	}

	@Override
	public double getArea() {
		return w * h;
	}

	@Override
	public double getLength() {
		return 2 * (w + h);
	}

}
