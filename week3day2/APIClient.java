package week3day2;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println("Sending request to endpoint: " + endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.print("Sending request to endpoint: " + endpoint +  ", Body: " + requestBody);		
		
		if (requestStatus) {
			System.out.println("Request was successfull : True");
			
		}
		else {
			System.out.println("Request not successfull ;  Failed");
		}
	}
	public static void main(String[] args) {
		
		APIClient Clientoptions = new APIClient();
		Clientoptions.sendRequest("endpoint");		
		Clientoptions.sendRequest("endpoint","requestBody", true);
	}

}
