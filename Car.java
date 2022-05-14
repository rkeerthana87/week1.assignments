package week1.assignments;

public class Car {
	
	public void applyBreak() {
		System.out.println("Apply Break");

	}

	public void applyGear() {
		System.out.println("Apply Gear");
	}

	public void switchonAc() {
		System.out.println("Switch on the AC");
	}

	public void applyAccelerator() {
		System.out.println("apply the accelerator");
	}
	
	public static void main(String []args)
	{
		Car obj=new Car();
		obj.applyAccelerator();
		obj.applyBreak();
		obj.applyGear();
		obj.switchonAc();
		
	}
}
