// To test out CentredBall class 

// Add import statement(s) below
import java.util.*;
public class TestCentredBall {

	// This method reads ball's input data from user, creates
	// a ball object, and returns it to the caller.
	public static CentredBall readBall(Scanner sc) {

		System.out.print("Enter colour, radius and centre: ");
		String inputColour = sc.next();
		double inputRadius = sc.nextDouble();
		int inputX = sc.nextInt();
		int inputY = sc.nextInt();

		return new CentredBall(inputColour,inputRadius,inputX,inputY);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read input and create 1st ball object
		System.out.println("1st ball");
		CentredBall b1 = readBall(scanner);

		// Read input and create 2nd ball object
		System.out.println("2nd ball");
		CentredBall b2 = readBall(scanner);

		// Read input and create 3rd ball object
		System.out.println("3rd ball");
		CentredBall b3 = readBall(scanner);

		System.out.println();

		if(!b1.equals(b2)){
			System.out.println("1st and 2nd balls are not the same.");
		}else{
			System.out.println("1st and 2nd balls are the same.");
		}
		System.out.printf("The largest ball created is:\n%s\n",largestBall(b1,b2,b3).toString());
	}

	public static CentredBall largestBall(CentredBall ball1,CentredBall ball2,CentredBall ball3){
			CentredBall largest = ball1;
			if(ball2.getRadius() > largest.getRadius()){
				largest = ball2;
			}
			if(ball3.getRadius() > largest.getRadius()){
				largest = ball3;
			}
			return largest;
	}
}

