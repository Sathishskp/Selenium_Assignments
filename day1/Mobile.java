package wk1.day1;

public class Mobile {
	
	public void makeCall() {
		System.out.println("Calling");
		
		String mobileModel ="Apple";
		Float mobileWeight = 67.5f;
		System.out.println("Mobile Model = " +mobileModel);
		System.out.println("Mobile Weight = " +mobileWeight);
	}
	
	public void sendMsg() {
		System.out.println("Message Send");
		
		boolean isCharged = true;
		int mobilePrice = 50000;
		System.out.println("Mobile Charged = " +isCharged);
		System.out.println("Mobile Price = " +mobilePrice);
	}
	
	public static void main(String[] args) {
		
		Mobile mb = new Mobile();
		
		mb.makeCall();
		mb.sendMsg();
		
		
	}

	

}
