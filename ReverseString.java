package Day5;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		/* Write a method to display the words in reverse order.  
		 * “How are you” should be displayed “you are How”   */
    
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your  words ");
		String words = in.next();
		reverseString(words);
	}
public static void reverseString(String words) {
	String [] strWords = words.split(" ");
	String reversString = "";
	for ( int i =0; i < words.length(); i ++) {
		
		String word = strWords[i];
		String reverseWord ="";
		//for ( int j = word.length() -1;j >0; j -- ) {
			///reverseWord = reverseWord + word.charAt(j);
			
		//}
		reversString = reversString + reverseWord + " ";
		
	}
	System.out.println(words);
	System.out.println(" reverse : "+ reversString);
}
}
