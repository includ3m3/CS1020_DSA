// SumIntegers.java
// This program computes sum of positive integers up to n
import java.lang.*;
import java.util.Scanner;

public class SumIntegers{
	public static void main(String[] args){
		int i=0,sum=0,n;
		Scanner scVar = new Scanner(System.in);	
		System.out.print("Enter n: ");
		n = scVar.nextInt();

		while(i<=n){
			sum += i;
			i++;
		}
		System.out.println("Sum = "+sum);
	}
}

