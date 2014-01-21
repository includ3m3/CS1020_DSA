// MileToKm.java
// Converts distance in miles to kilometres
import java.util.Scanner;

public class MileToKm{
	public static final double KMS_PER_MILE = 1.609;

	public static void main(String[] args){
		double miles,kms; 

		Scanner scVar = new Scanner(System.in);

		System.out.print("Enter distance in miles: ");
		miles = scVar.nextDouble();

		kms = KMS_PER_MILE * miles;
		System.out.printf("That equals %9.2f km.\n",kms);

	}
}

