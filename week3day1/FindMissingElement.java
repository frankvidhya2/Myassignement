package week3day1;

import java.util.Arrays;

public class FindMissingElement {
  
	public static void main(String[] args) {
    	
    	int[] arr = {1, 4,3,2,8, 6, 7};  
    	//sort the array
    	Arrays.sort(arr);
    	
    	//Loop through the array
    	for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
    		
    	//Check if the iterator variable is not equal to the array values
    		if (i != arr[i - arr[0]]) {
    			System.out.println("Missing element: " + i);
                break;
	}

}
}
}