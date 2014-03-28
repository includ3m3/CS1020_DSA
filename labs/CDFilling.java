// CS1020 (AY2013/4 Semester 2)
// Take-home lab #5
// Name: Kaung Htet Aung 
// Matric. No.: A0117993R
// Lab group: C01 
// Description : This prgram uses the recursion to find out the number of songs and their size
// best fit for the given capacity of a CD
import java.util.*;

public class CDFilling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int size = sc.nextInt();
			int num = sc.nextInt();
			List<Integer> arr = new ArrayList<Integer>();
			for(int i=0;i<num;i++){
				arr.add(sc.nextInt());
			}
			List<Integer> returnList = bestFit(size,arr);
			for(Integer i:returnList){
				System.out.print(i+" ");
			}
			System.out.println(sum(returnList));
		}
	}
	//Finding best list from the nested list
	public static List<Integer> bestFit(int size,List<Integer> arr){
		int min = size,index=0,diff=0;
		List<Integer> temp = new ArrayList<Integer>();
		List<List<Integer>> listOfPerm = gnrtPerm(arr);
		for(int i=0;i<listOfPerm.size();i++){
			int sumOfPerm = sum(listOfPerm.get(i));
			if(sumOfPerm<=size){
				diff = size - sumOfPerm;
				if(min>=diff){
					min = diff;
					index = i;
				}
			}
		}

		return listOfPerm.get(index);
	}
	//Sum of a list
	public static int sum(List<Integer> list) {
		int sum= 0; 
		for (Integer i:list)
			sum = sum + i;
		return sum;
	}
	//Finding permutations of a given list 
	public static List<List<Integer>> gnrtPerm(List<Integer> input) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (input.isEmpty()) {
			result.add(new ArrayList<Integer>());
			return result;
		}

		Integer headElement = input.remove(0);
		List<List<Integer>> temp = gnrtPerm(input);
		result.addAll(temp);
		for (List<Integer> smaller: temp) {
			List<Integer> headSet = new ArrayList<Integer>(smaller);
			headSet.add(0,headElement);
			result.add(headSet);
		}
		return result;
	}

}
