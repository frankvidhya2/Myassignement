package testleaf;

public class Palindrome {
	public static void main(String[] args) {
        int input = 121;      
        int rem, output = 0;      

        // Loop to reverse the number
        for (int i = input; i > 0; i = i / 10) {
            rem = i % 10;                   
            output = (output * 10) + rem;   
        }

        // Check if original and reversed are the same
        if (input == output) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }
    }
}