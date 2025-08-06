package week3day2;

public class WebElement {
	
	public void click() {
		System.out.println("click the element");
	}
	
	public void setText() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		WebElement elementoptions = new WebElement();
		elementoptions.click();
		elementoptions.setText();
	}

}
