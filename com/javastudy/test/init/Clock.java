package com.javastudy.test.init;

public class Clock {
	private int h, m, s;

	public Clock(int h, int m, int s) {
		this.h = h;
		this.m = m;
		this.s = s;
	}

	public void showTime() {
		System.out.println(h + ":" + m + ":" + s);
	}
}
