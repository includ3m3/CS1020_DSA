// CS1020 (AY2013/4 Semester 2)
// Take-home lab #1
// Name: Kaung Htet Aung
// Matric. No.: A0117993R 
// Lab group: C01 
// This program is to compute the overlapping area of two rectangles
// based on given coordinates

import java.util.*;
import java.awt.*;

public class OverlapRectangles {

	public static void main(String[] args) {
		int area = 0; //Overlapping area
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 2 opposite vertices of 1st rectangle: ");
		Point rect1Vertex1 = new Point(sc.nextInt(), sc.nextInt());
		Point rect1Vertex2 = new Point(sc.nextInt(), sc.nextInt());

		System.out.print("Enter 2 opposite vertices of 2nd rectangle: ");
		Point rect2Vertex1 = new Point(sc.nextInt(), sc.nextInt());
		Point rect2Vertex2 = new Point(sc.nextInt(), sc.nextInt());

		arrangeVertices(rect1Vertex1,rect1Vertex2);
		arrangeVertices(rect2Vertex1,rect2Vertex2);

		area = Math.max(0,(Math.min(rect1Vertex2.x,rect2Vertex2.x) - Math.max(rect1Vertex1.x,rect2Vertex1.x)))
			* Math.max(0,(Math.min(rect1Vertex2.y,rect2Vertex2.y)-Math.max(rect1Vertex1.y,rect2Vertex1.y)));	
		//printAllVertices(rect1Vertex1, rect1Vertex2, rect2Vertex1, rect2Vertex2);
		System.out.println("Overlap area = "+area);

	}

	// To print the 2 opposite vertices of each of the 2 rectangles.
	public static void printAllVertices(Point r1V1, Point r1V2,
			Point r2V1, Point r2V2) {
		System.out.println("1st rectangle vertex 1: " + r1V1);
		System.out.println("1st rectangle vertex 2: " + r1V2);
		System.out.println("2nd rectangle vertex 1: " + r2V1);
		System.out.println("2nd rectangle vertex 2: " + r2V2);
	}

	// Rearranging the points for simpler calculation
	private static void arrangeVertices(Point point1,Point point2){
		int tempX1 = point1.x,tempX2 = point2.x,tempY1 = point1.y,tempY2 = point2.y;

		point1.x = Math.min(tempX1,tempX2); 
		point2.x = Math.max(tempX1,tempX2);

		point1.y = Math.min(tempY1,tempY2);
		point2.y = Math.max(tempY1,tempY2);

	}
}

