package week3day1;

public class FindIntersection {

	public static void main(String[] args) {
		int a[]={3,2,11,4,6,7};
		int b[]={1,2,8,4,9,7};
		
		for (int i = 0; i < a.length; i++) {
		for (int g = 0; g < b.length; g++) {
   
			 if(a[i] == b[g]) {
				 System.out.println("Matching element: " + a[i]) ;
			 }
		}
	}

}
}