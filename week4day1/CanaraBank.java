package week4day1;

public abstract class CanaraBank implements Payments {
	

	public void cashOnDelivery() {
        System.out.println("cash paid successfully");	
        
	}

	public void upiPayments() {
        System.out.println("upi payment done");		

	}

	public void cardPayments() {
        System.out.println("card payment done");		
		
	}

	public void internetBanking() {
        System.out.println("internet payment done");		
		
	}
	

	public void recordPaymentDetails() {
		System.out.println("payment credited");
	}
   
} 
