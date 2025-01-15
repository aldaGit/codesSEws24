package org.hbrs.se1.ws24.solutions.uebung10.test;

public class MyPrettyRectangle {

	private MyPoint LiU;
	private MyPoint ReO;
	
	public MyPrettyRectangle(double d, double e, double f, double g) {
			LiU = new MyPoint(d, e);
			ReO = new MyPoint(f, g);
	}

	public boolean contains(MyPrettyRectangle other) {
		double x1 = LiU.getX();
		double y1 = LiU.getY();
		double x2 = ReO.getX();
		double y2 = ReO.getY();
		
		double mx1 = other.LiU.getX();
		double my1 = other.LiU.getY();
		double mx2 = other.ReO.getX();
		double my2 = other.ReO.getY();
		
		double difx1 = mx1 - x1;
		double dify1 = my1 - y1;
		double difx2 = mx2 - x2;
		double dify2 = my2 - y2;
		
		return(difx1 >= 0 && dify1 >= 0 && difx2 <= 0 && dify2 <= 0);
	}

	public MyPoint getCenter() {
		double x1 = LiU.getX();
		double y1 = LiU.getY();
		double x2 = ReO.getX();
		double y2 = ReO.getY();
		
		double x3 = (x2 + x1)/2;
		double y3 = (y2 + y1)/2;
		
		MyPoint center = new MyPoint(x3, y3);
		return center;
	}
	
	public double getArea() {
		double x1 = LiU.getX();
		double y1 = LiU.getY();
		double x2 = ReO.getX();
		double y2 = ReO.getY();
		
		double a = x2 - x1;
		double b = y2 - y1;
		
		return a*b;
	}

	public double getPerimeter() {
		double laenge1 = ReO.getX() - LiU.getX();
		double laenge2 = ReO.getY() - LiU.getY();

		double umfang = (2*laenge1) + (2*laenge2);
		return umfang;
	}

	public boolean equals(Object other) {
		if(other == null)
			return false;
		if(!(other instanceof MyPrettyRectangle))
			return false;
		MyPrettyRectangle p = (MyPrettyRectangle) other;
		
		return LiU.equals(p.LiU)&&ReO.equals(p.ReO);
	}
	
	public MyPoint getLiU() {
		return LiU;
	}
	
	public MyPoint getReO() {
		return ReO;
	}

	
}
