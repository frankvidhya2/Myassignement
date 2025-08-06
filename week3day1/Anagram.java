package week3day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		 
		 String text1 = "stops";
	     String text2 = "potss";
	     
	     //check the length
	     if (text1.length()!= text2.length()) {
	    	 System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
	     return;
	     }
	     
	  // Step 2: Convert strings to char arrays
	     char[] arr1 = text1.toCharArray();
	 	 char[] arr2 = text2.toCharArray();
	 	 
	 	// Step 3: Sort both char arrays
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        
	        if(Arrays.equals(arr1, arr2)) {
	        	System.out.println("The given strings are Anagram");
	        }
	        
	        else {
	        	System.out.println("The given strings are not an Anagram.");
	        }
	        
	        
	}

}
