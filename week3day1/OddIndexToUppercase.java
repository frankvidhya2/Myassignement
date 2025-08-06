package week3day1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		 
		 String test = "changeme" ;
		 
		 //Convert the given String to a character array.
	     char[] chars = test.toCharArray();
	     
	     //a loop to iterate from end to start
	     for(int i=0; i< chars.length; i++) {
	    	 
	    	// Check if index is odd
	    	 if(i %2 != 0) {
	    		 
	    		// Change character at odd index to uppercase
	             chars[i] = Character.toUpperCase(chars[i]);
	             
	             // Print the character
	             System.out.print(chars[i]);
	    		 
	    		 
	    	 } 
	     }
	}

}
