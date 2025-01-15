package org.hbrs.se1.ws24.solutions.uebung10.test;

public class BoundingBoxFactory {
	public static MyPrettyRectangle createBoundingBox(MyPrettyRectangle[] rect) {
		if(rect == null) return null;

		if (rect.length == 0)
			return new MyPrettyRectangle(0.0,0.0,0.0,0.0);

		// Erstes Rechteck entnehmen (die bessere Lösung!)
		MyPrettyRectangle first = rect[0];

		double minX= first.getLiU().getX();
		double minY= first.getLiU().getY();
		double maxX= first.getReO().getX();
		double maxY= first.getReO().getY();
		
		for (int i = 0; i < rect.length; i++) {
			if(rect[i].getReO().getX() > maxX ) {
				maxX = rect[i].getReO().getX();
			}
			if(rect[i].getLiU().getX() < minX ) {
				minX = rect[i].getLiU().getX();
			}
			if(rect[i].getReO().getY() > maxY ) {
				maxY = rect[i].getReO().getY();
			}
			if(rect[i].getLiU().getY() < minY ) {
				minY = rect[i].getLiU().getY();
			}
		}
		
		MyPrettyRectangle Box = new MyPrettyRectangle(minX, minY, maxX, maxY);
		
		return Box;
	}
}
