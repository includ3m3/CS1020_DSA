/*  
 * CS1020 (AY2013/4 Sem2)  
 * Sit-in Lab #A 
 * Author    : Kaung Htet Aung
 * Matric no.: A0117993R 
 * Lab group : C01 
 * Description of program: Getting length of the longest substring without repeated characters in a string
 */ 

import java.util.*;

public class LongestSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		str = str.toLowerCase();
		System.out.println(longestString(str));
	}

	//looping until the same char found and return the length of the new string
	public static int longestString(String str){
		int longest = 0;
		String newstr = "";
		for(int i=0;i<str.length();i++){
			newstr = newstr+str.charAt(i);
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i) != str.charAt(j)){
					if(repCheck(newstr,str.charAt(j)))
						break;
					else
						newstr = newstr + "" + str.charAt(j);
					/*
					if(j ==  str.length()-1){
						newstr = "";
					}
					*/
				}else{
					break;	
				}
			}
			//System.out.println(newstr);
			if(newstr.length()>longest){
				longest = newstr.length();
			}
			newstr = "";
		}
		return longest;
	}
	// Checking repetition in a string
	public static boolean repCheck(String str,char c){
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==c)
				return true;
		}
		return false;
	}
}
