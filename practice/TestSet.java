// This program reads two sets of integers A and B, and determines
// if A is a subset of B, and if A is same as B.

import java.util.Scanner;
import java.util.ArrayList;

public class TestSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		System.out.print("Enter number of elements in set A: ");
		int numSetA = sc.nextInt();
		System.out.print("Enter elements for set A: ");
		for(int i=0;i<numSetA;i++){
			list1.add(sc.nextInt());
		}
		Set setA = new Set(list1);
		System.out.print("Enter number of elements in set B: ");
		int numSetB = sc.nextInt();
		System.out.print("Enter elements for set B: ");
		for(int i=0;i<numSetB;i++){
			list2.add(sc.nextInt());
		}
		Set setB = new Set(list2);
		System.out.println("Set A: " + setA.toString());
		System.out.println("Set B: " + setB.toString());
		if (setA.isSubset(setB)) {
			System.out.println("Set A is a subset of set B.");
		}
		else {
			System.out.println("Set A is not a subset of set B.");
		}

		if(setA.getIdentical()){
			System.out.println("Set A is equal to set B.");
		}else{
			System.out.println("Set A is not equal to set B.");
		}
	}

} 

