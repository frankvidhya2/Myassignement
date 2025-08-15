package week4day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		
		// Declare the array
		Integer[] number1 =  {3, 2, 11, 4, 6, 7};
		
		// Declare another array
		Integer[] number2 =  {1, 2, 8, 4, 9, 7};
		
		//Add number1 to List
		List<Integer> numList1 = new ArrayList <Integer> (Arrays.asList(number1));
		
		//Add number2 to List
		List<Integer> numList2 = new ArrayList <Integer> (Arrays.asList(number2));

		// Iterate the values
        System.out.println("Intersection (matching elements):");
        for (Integer num : numList1) {
            if (numList2.contains(num)) {
                System.out.println(num);
            }

	}

}
}