package week3day2;

public class ReverseOddWords {

	
	public static void main(String[] args) {
		String test = "I am a software tester";
		//Split the words a
		String[] words = test.split(" ");
		
		 //Traverse through each word using loop
		 for (int i = 0; i < words.length; i++) {
			 
			   //odd index within the loop
	            if (i % 2 != 0) { 
	                
	            	//Convert the String array into a character array
	            	char[] chars = words[i].toCharArray();
	                for (int j = chars.length - 1; j >= 0; j--) {
	                    System.out.print(chars[j]);
	                }
	            }
	            else { 
	                System.out.print(words[i]);
	            }

	           if (i < words.length - 1) {
	                System.out.print(" ");
	            }
	        }
	}

}
