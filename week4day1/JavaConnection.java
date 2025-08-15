package week4day1;

public  class JavaConnection implements DatabseConnection {

	//Implementing the interface
	public void  connect() {
		System.out.println("Connect the Database");
	}
	
	public void  disconnect() {
		System.out.println("Disconnect the Database");

	}
	public void executeUpdate() {
		System.out.println("Execute the Update in the  Database");

	}
	
	public static void main(String[] args) {
		
		JavaConnection  javaoptions = new JavaConnection  ();
		javaoptions.connect();
		javaoptions.disconnect();
		javaoptions.executeUpdate();
		
	}

}
