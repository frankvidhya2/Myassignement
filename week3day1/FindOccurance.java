package week3day1;

public class FindOccurance {

	public static void main(String[] args) {
           
		 String input = "TestLeaf";
		 
		 //Initialize a variable to 0
		 int count = 0;
		 
		 //Convert the given String to a character array
		 char[] chars = input.toCharArray();
		 
		 //Use loop to iterate through each character in the array
		 for(int i=0; i < chars.length; i++) {
			 
			 //Compare each character with 'e
			 if(chars[i] == 'e') {
				 count++;
			 }
		 }
			//, print the count
			 System.out.println("the count of 'e' occurance is : +count");
	}

}

