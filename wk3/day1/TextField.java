package wk3.day1;

public class TextField extends WebElement {
	
	public void getText() {
		
		System.out.println(" getText from TextField Class ");
	}

	public static void main(String[] args) {
		
		TextField objText = new TextField();
		
		objText.click();
		objText.setText();
		objText.getText();
		
	}
	
}
