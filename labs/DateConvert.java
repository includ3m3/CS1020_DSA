// CS1020 (AY2013/4 Semester 2)
// Name: Kaung Htet Aung
// Matric. No.: A0117993R 
// Lab group: C01
// This program is to convert UK date format to equivalent American format
// and also whether the year is a leap year
import java.util.*;

public class DateConvert {
	//Checking whether the year is a leap year
	private static boolean isLeapYear(int year){
		return (year%400 == 0) || (year%4 == 0 && year%100 != 0);
	}

	public static void main(String[] args) {
		String ukFormat,month,date;
		int year;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter date in UK format: ");
		ukFormat = sc.nextLine();		

		month = ukFormat.substring(0,ukFormat.indexOf(" "));
		date = ukFormat.substring(ukFormat.indexOf(" ")+1,ukFormat.indexOf(","));
		year = Integer.parseInt(ukFormat.substring(ukFormat.indexOf(",")+2));
		System.out.print("Date in American format: ");
		System.out.println(date+" "+month+" "+year);
		
		if(isLeapYear(year)){
			System.out.println(year+" is a leap year.");
		}else{
			System.out.println(year+" is not a leap year.");
		}
		
	}
}

