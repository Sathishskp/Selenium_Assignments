package wk1.day1;

public class Bike {
	
	public void applyBreak() {
		System.out.println("Bike Break Applied");
	}
	
	public void soundHorn() {
		System.out.println("Bike Horn Applied");
	}
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		Bike myBike = new Bike();
		
		myCar.applyBreak();
		myCar.soundHorn();
		myBike.applyBreak();
		myBike.soundHorn();
	}

}
