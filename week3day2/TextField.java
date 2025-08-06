package week3day2;

public class TextField extends WebElement {
	
	public void  getText() {
		System.out.println("get the text");
	}

	public static void main(String[] args) {
		TextField fieldoptions = new TextField();
		fieldoptions.getText();
		fieldoptions.click();
		fieldoptions.setText();
	}

}
