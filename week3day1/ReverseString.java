package week3day1;

public class ReverseString {


	public static void main(String[] args) {
        String companyName = "TestLeaf";
       
        //convert string into array
        char[] characters  = companyName.toCharArray();
        
        for (int i = characters.length - 1; i >= 0; i--) {
        	System.out.print(characters[i]);
        }
     }

}

