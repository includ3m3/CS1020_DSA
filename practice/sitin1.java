import java.util.*;

class sitin1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int longest = 0;
		String newstr = "";

		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i) == str.charAt(j)){
					newstr = str.substring(i,j);
				}
			}
			//System.out.println(newstr);
			int length = countStrLength(newstr);	
			if(length > longest){
				longest = length;
			}
			newstr = "";
		}
		System.out.println(longest);

	}
	public static int countStrLength(String str){
		int length = 0;
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i) == str.charAt(j)){
					length++;
				}
			}
		}
		//System.out.println(str + " len = " + str.length() + "-" + length+ "---" + (str.length()-length));
		return str.length()-length;
	}
}
