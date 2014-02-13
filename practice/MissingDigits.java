// MissingDigits.java
// To find digits that do not appear in user's input number.
import java.util.*;

public class MissingDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)	;
		boolean[] arr = new boolean[10];
		System.out.print("Enter a number: ");
		int input = sc.nextInt();
		System.out.print("Missing digits in " +  input +": ");

		while(input>0){
			arr[input%10] = true;
			input /= 10;
		}
		for(int i=0;i<10;i++){
			if(arr[i] == false){
				System.out.print(""+i + " ");
			}
		}
	}
}
