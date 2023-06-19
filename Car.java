package week.day1;

public class Car {

	//Methods
	 public void driveCar()
	 {
		 System.out.println("Driver car method called");
	 }
	 
	 public void applyBrake()
	 {
		 System.out.println("apply Brake method called");
	 }
	 
	 public void soundHorn()
	 {
		 System.out.println("soundHorn method called");
	 }
	 
	 public void isPuncture()
	 {
		 System.out.println("isPuncture method called");
	 }
	 
	 public static void main(String[] args) {
		
		 Car c = new Car();
		 c.driveCar();
		 c.applyBrake();
		 c.soundHorn();
		 c.isPuncture();
	}
}

