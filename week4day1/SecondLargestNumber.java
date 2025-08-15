package week4day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {

		//Declare an Array
		Integer[] number = {3, 2, 11, 4, 6, 7};
	
		// Add the array to a List
        List<Integer> numList = new ArrayList<Integer>(Arrays.asList(number));
       
        
		// Arrange the collection in ascending order
        Collections.sort(numList);

        //Get the second largest number
        int secondLargest = numList.get(numList.size() - 2);

        System.out.println("Second Largest Number Is : " +secondLargest);
		

  }
}