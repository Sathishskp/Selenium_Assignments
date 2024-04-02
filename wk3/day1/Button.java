package wk3.day1;

public class Button extends WebElement{
		
		public void submit() {
			
			System.out.println(" Submit from Button Class ");
		}
		
		public static void main(String[] args) {
			
			Button objButton = new Button();
			
			objButton.click();
			objButton.setText();
			objButton.submit();
			
		}
	}

