package week3day2;

public class Button extends WebElement {

	public void submit() {
		System.out.println("submitted");
	}
	
	public static void main(String[] args) {
		Button Buttonoptions = new Button();
		Buttonoptions.submit();
		Buttonoptions.click();
		Buttonoptions.setText();
	}

}
