package week4day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

    public static void main(String[] args) {

        //  Declare the array
        Integer[] numbers = {1, 2, 3, 4, 10, 6, 8};

        // Add the array to a List
        List<Integer> numList = new ArrayList<Integer>(Arrays.asList(numbers));
       

        // Sort the List in ascending order
        Collections.sort(numList);


        //  Find the missing elements adding loop
        
        for (int i = 0; i < numList.size() - 1; i++) {
            int current = numList.get(i);
            int next = numList.get(i + 1);

            // Check if there’s a gap
            if (current + 1 != next) {
                // Print all missing numbers between current and next
                for (int missing = current + 1; missing < next; missing++) {
                    System.out.println(missing);
                }
            }
        }
    }
}
