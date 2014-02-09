import java.util.*;

public class AreaOfTriangle {
	//Calculating area of triangle
	private static double area(double a,double b, double c){
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	//checking valid triangle based on three given values
	private static boolean validTriangle(double a,double b,double c){
		if((a+b)<=c){
			return false;
		}else if((b+c)<=a){
			return false;
		}else if((a+c)<=b){
			return false;
		}else{
			return true;
		}
	}

	public static void main(String[] args) {
		double a, b, c;  // lengths of sides of triangle
		boolean isValidTriangle; 

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 3 lengths: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		isValidTriangle = validTriangle(a,b,c);	

		if(isValidTriangle){
			System.out.printf("Area = %.2f\n",area(a,b,c));
		}else{
			System.out.println("Invalid triangle!");
		}

	}
}

