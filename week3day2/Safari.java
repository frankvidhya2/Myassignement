package week3day2;

public class Safari extends Edge {
	public void readerMode() {
		System.out.println("Safari: reading mode");
	}
	public void fullScreenMode() {
		System.out.println("Safari:fullScreenMode ");
		
	}

	public static void main(String[] args) {
		Safari Safarioptions = new Safari();
		Safarioptions.readerMode();
		Safarioptions.fullScreenMode();
		Safarioptions.takeSnap();
		Safarioptions.clearCookies();
	}

}
