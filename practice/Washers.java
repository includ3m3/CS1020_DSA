// Washers.java
// Compute total weight of a batch of washers
import java.util.Scanner;

public class Washers{
	public static double circleArea(double diameter){
		return Math.pow(diameter/2,2) * Math.PI;
	}
	public static void main(String[] args){
		double d1,d2,thickness,density,unitWeight,totalWeight,rimArea;
		int qty;

		Scanner scVar = new Scanner(System.in);

		//asking user input
		System.out.print("Inner diameter in cm: ");
		d1 = scVar.nextDouble();
		System.out.print("Outer diameter in cm: ");
		d2 = scVar.nextDouble();
		System.out.print("Thickness in cm: ");
		thickness = scVar.nextDouble();
		System.out.print("Density in grams per cubic cm: ");
		density = scVar.nextDouble();
		System.out.print("Quantity: ");
		qty = scVar.nextInt();
		
		//Compute weight of a single washer
		rimArea = circleArea(d2) - circleArea(d1);
		unitWeight = rimArea * thickness * density;

		//compute weight of a batch of washers
		totalWeight = unitWeight * qty;
		System.out.printf("Total weight of %d washers is %.2f grams.\n",qty,totalWeight);
	}
}

