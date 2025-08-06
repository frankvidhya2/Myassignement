package week3day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
	
	// Remove the duplicate words from a String with the input
  	String text = "We learn Java basics as part of java sessions in java week1";
	
  	//Split the text into words using space
	String[] words = text.split(" ");
	
	//count of duplicate words
	int count = 0;
	
	//Outer loop
	for (int i=0 ; i<words.length; i++) {
		if(words[i].equals(" ")) {
			continue;
		}
		
	//Inner Loop	
	for (int j =i+1 ; j<words.length; j++) {
		if (words [i].equalsIgnoreCase(words[j])) {
			
			words[j] = " ";
			count++;
	}
	}
	}
	// Check if duplicates were found
    if (count > 0) {
    System.out.print("Removing duplicates:  ");
    
    for (String word : words) {
    System.out.print(word + " ");
        }
        
    } else {
    	
    System.out.println("No duplicate words found.");
    }
	
}
}