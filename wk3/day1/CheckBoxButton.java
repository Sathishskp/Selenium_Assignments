package wk3.day1;

public class CheckBoxButton extends Button {

	public void clickCheckButton() {

		System.out.println(" Click CheckBox Button from CheckBoxButton Class ");
	}
	public static void main(String[] args) {

		CheckBoxButton objcBox = new CheckBoxButton();

		objcBox.click();
		objcBox.setText();
		objcBox.submit();
		objcBox.clickCheckButton();

	}

}
