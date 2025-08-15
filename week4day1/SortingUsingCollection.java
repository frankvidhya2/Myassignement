package week4day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		// Declare String Array
		String[] companies =  {"HCL", "Wipro", "Aspire Systems", "CTS"} ;  
		
		//Add Array to List
		List<String> companyList = new ArrayList<String>(Arrays.asList(companies));
		 
		
		 //Arrange the collection in Ascending Order
	      Collections.sort(companyList);
		
		//iterate the values in list
		for(int i = companyList.size()-1; i>=0; i--) {
			System.out.println(companyList.get(i));
			
			
		}

	}
}
