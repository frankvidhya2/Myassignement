package week3day2;

public class Polymorphism {
	
	// Overloaded method 1: Takes two input arguments
	public void reportStep(String msg, String status) {
        System.out.println( msg + ", Status: " + status);
    }
	
	public void  reportStep(String msg, String status,boolean snap) {
		System.out.println( msg + ", Status: " + status);
		if (snap){
			System.out.println("snapshot taken");
		}
		else {
			System.out.println("snapshot not taken");
			
		}
	}
	public static void main(String[] args) {
		Polymorphism javaoptions = new Polymorphism();
		javaoptions.reportStep("file uploaded", "passed");
		javaoptions.reportStep("file not uploaded", "fail", true);
	}

}
