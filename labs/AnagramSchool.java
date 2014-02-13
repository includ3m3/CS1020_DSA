import java.util.*;

/* Check if two strings are anagrams of each other */

public class Anagram {

	public static void main(String[] args) {	
		Scanner sc = new Scanner (System.in);

		// read in lower case version of each string
		String inStr1 = new String(sc.nextLine().toLowerCase());
		String inStr2 = new String(sc.nextLine().toLowerCase());
		Boolean isAnagram = true;

		// remove white spaces
		inStr1 = inStr1.replaceAll(" ","");
		inStr2 = inStr2.replaceAll(" ","");

		// if not identical and length are the same
		if ((inStr1.compareTo(inStr2) != 0) && 
				(inStr1.length() == inStr2.length())) {
			// get each unique character in the first string
			for (int charIndex=0; charIndex < inStr1.length(); charIndex++) {
				int numCharInStr1 = 0;
				int numCharInStr2 = 0;
				char curChar = inStr1.charAt(charIndex);

				// check that all non-'#' characters have equal occurance in both strings
				if (curChar != '#') {
					for (int counter=0; counter < inStr1.length(); counter++)
						if (inStr1.charAt(counter) == curChar)
							numCharInStr1++;
					for (int counter=0; counter < inStr2.length(); counter++)
						if (inStr2.charAt(counter) == curChar)
							numCharInStr2++;
					if (numCharInStr1 != numCharInStr2) {
						isAnagram = false;	    
						break;
					}
					// replace all occurance of curChar with '#'
					inStr1 = inStr1.replace(curChar,'#');
				}
			}
		}
		else
			isAnagram = false;

		System.out.println(isAnagram.toString());
	}
}
