// This program reads integer coordinates of 3 points and creates
// 3 Point objects. It then computes the centroid of a triangle
// having these 3 points as its vertices.

import java.util.*;
import java.awt.*;
import java.awt.geom.Point2D;

public class TriangleCentroid {
	// Returns the centroid of a triangle with 
	// 3 vertices v1, v2 and v3
	public static Point2D.Double centroid(Point v1, Point v2, Point v3) {
		Point2D.Double pt = new Point2D.Double();
		pt.setLocation((double)(v1.x+v2.x+v3.x)/3,(double)(v1.y+v2.y+v3.y)/3);
		return pt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 vertices: ");
		Point point1 = new Point(sc.nextInt(),sc.nextInt());
		Point point2 = new Point(sc.nextInt(),sc.nextInt());
		Point point3 = new Point(sc.nextInt(),sc.nextInt());

		System.out.println("Centroid at " + centroid(point1,point2,point3));
	}
}

