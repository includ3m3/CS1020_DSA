// This program computes the mean and standard deviation
// of an array of values.

import java.util.*;
import java.text.DecimalFormat;
public class Statistics {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat decFormat = new DecimalFormat("0.000");
		int[] arr = readArray(sc);

		// For checking; remove the following 2 lines before submission
		//System.out.print("Values: ");
		//printArray(arr);

		System.out.println("Mean = " + decFormat.format(computeMean(arr)));
		System.out.println("Standard deviation = " + decFormat.format(computeStdDev(arr)));
	}

	// Read a list of values into an array arr
	public static int[] readArray(Scanner sc) {
		int[] arr;
		int size;
		System.out.print("Enter size of array: ");
		size = sc.nextInt();
		arr = new int[size];
		if(size>1){
			System.out.println("Enter "+size+" values: ");
		}else{
			System.out.println("Enter 1 value: ");
		}
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	// Compute mean of the values in arr
	// Precond: arr.length > 0
	public static double computeMean(int[] arr) {
		int total = 0;
		for(int i=0;i<arr.length;i++){
			total += arr[i];
		}
		return (double) total / arr.length;
	}

	// Compute standard deviation of the values in arr
	// Precond: arr.length > 0
	public static double computeStdDev(int[] arr) {
		double var = 0,avg;
		avg = computeMean(arr);
		for(int i=0;i<arr.length;i++){
			var += Math.pow(avg-arr[i],2);
		}
		var = var/arr.length;
		return Math.sqrt(var);
	}

	// Print the array arr on a single line.
	// Note that the last element has a space after it.
	public static void printArray(int[] arr) {
		for (int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
} 

