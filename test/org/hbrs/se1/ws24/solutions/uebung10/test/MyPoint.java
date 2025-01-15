package org.hbrs.se1.ws24.solutions.uebung10.test;

public class MyPoint {

	private double x;
	private double y;
	
	public MyPoint(double d, double e) {
		this.x = d;
		this.y = e;
	}

	public boolean equals(Object other) {
		if(other == null)
			return false;

		if(!(other instanceof MyPoint))
			return false;

		MyPoint p = (MyPoint) other;
		
		return x == p.getX() && y == p.getY();
	}
	
	public String toString() {
		String s = "Punkt: x = "+ x + " y = "+y;
		return s; 
	}

	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
}
