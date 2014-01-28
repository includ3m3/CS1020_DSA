// Kaung Htet Aung
// A0117993R
// C01
// This program reads the length of a side of a square and
// computes the area of the circle that encloses the square.

import java.util.*; 

public class CircleArea {
	// Circle area formula
	private static double circleArea(double radius){
		return Math.PI * Math.pow(radius,2);
	}

	public static void main(String[] args) {
		double side,radius;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter side of square: ");
		side = sc.nextDouble();
		
		radius = side/Math.sqrt(2);

		System.out.printf("Area of circle = %.2f\n",circleArea(radius));
		
	}
}

