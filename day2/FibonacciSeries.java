package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
      int n = 8;
      int a = 0, 
    	  b = 1;
      System.out.print(a + ", " + b);

      for (int i = 2; i < n; i++) {
          int number = a + b;
          System.out.print(", " +  number);
          a = b;
          b =  number;

	}

}
}
