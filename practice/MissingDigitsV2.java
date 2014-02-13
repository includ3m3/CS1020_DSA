// MissingDigitsV2.java
// To find digits that do not appear in user's input number.
// This version uses the Vector class.
import java.util.*;

public class MissingDigitsV2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)	;
		Vector <Boolean> arr = new Vector<Boolean>(10,2);
		System.out.print("Enter a number: ");
		int input = sc.nextInt();
		System.out.print("Missing digits in " +  input +": ");
		for(int i=0;i<10;i++){
			arr.add(false);
		}
		while(input>0){
			arr.set(input%10,true);
			input /= 10;
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i) == false){
				System.out.print(""+i + " ");
			}
		}
	}
}

