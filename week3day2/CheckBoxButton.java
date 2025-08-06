package week3day2;

public class CheckBoxButton extends Button {

	
	public void clickCheckButton() {
		System.out.println("click the check button");
	}
	
	public static void main(String[] args) {
		CheckBoxButton CheckBoxButtonoptions = new CheckBoxButton();
		CheckBoxButtonoptions.clickCheckButton();
		CheckBoxButtonoptions.submit();
	}

}
