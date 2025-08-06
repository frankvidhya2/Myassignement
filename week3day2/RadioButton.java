package week3day2;

public class RadioButton extends Button {
	
	public void  selectRadioButton() {
		System.out.println("select the radio button");
	}

	public static void main(String[] args) {
		RadioButton radioButton = new RadioButton();
        radioButton.selectRadioButton();
	}

}
