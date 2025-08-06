package week3day2;

public class Elements {

	public static void main(String[] args) {
		
		
		 // Button (Subclass)
		 Button Buttonoptions = new Button();
		 Buttonoptions.submit();
		 Buttonoptions.setText();
		 Buttonoptions.click();
		 
		 
		 // CheckBoxButton (inherits from Button)
	    CheckBoxButton CheckBoxButtonoptions = new CheckBoxButton();
		CheckBoxButtonoptions.clickCheckButton();
		CheckBoxButtonoptions.submit();
		
		 // RadioButton (inherits from Button)
		 RadioButton radioButton = new RadioButton();
         radioButton.selectRadioButton();
         radioButton.submit();
	}

}
