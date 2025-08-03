package week3day2;

public class Edge extends Chrome {
	
   public void takeSnap( ) {
	   System.out.println("Edge:  takeSnap ");
   }
   public void  clearCookies() {
	   System.out.println("Edge: clearCookies");
   }
	public static void main(String[] args) {
		Edge Edgeoptions = new Edge();
		Edgeoptions.takeSnap();
		Edgeoptions.clearCookies();
		Edgeoptions.openIncognito();
		Edgeoptions.clearCache();
		Edgeoptions.openURL();
	}
	

}
