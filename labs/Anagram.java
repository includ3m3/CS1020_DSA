/*  
 * CS1020 (AY2013/4 Sem2)
 * Sit-in Lab #B 
 * Author    : Kaung Htet Aung
 * Matric no.: A0117993R 
 * Lab group : C01 
 * Description of program: Check if two strings are anagrams of each other 
 */ 

import java.util.*;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		str1 = str1.replaceAll(" ","");
		str2 = str2.replaceAll(" ","");

		System.out.println(anaCheck(str1.toLowerCase(),str2.toLowerCase()));
	}
	public static boolean anaCheck(String str1,String str2){
		int length = 0;
		if(str1.length() != str2.length()){
			return false;
		}
		if(str1.equals(str2)){
			return false;
		}
		for(int i=0;i<str1.length();i++){
			for(int j=0;j<str2.length();j++){
				if(str2.charAt(j) != '#' && str1.charAt(i) == str2.charAt(j)){
					length++;
					str2.replace(str2.charAt(j),'#');
					break;
				}
			}
		}
		if(length==str1.length()){
			return true;
		}
		return false;	
	}
}
