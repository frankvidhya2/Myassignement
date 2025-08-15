package week4day1;

public class Amazon extends CanaraBank {
    
	
	public static void main (String[]args) {
		Amazon amazonoption = new Amazon();
		amazonoption.cashOnDelivery();
		amazonoption.cardPayments();
		amazonoption.upiPayments();
		amazonoption.internetBanking();
		amazonoption.recordPaymentDetails();
		
	}

}
