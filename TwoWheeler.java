package week1.assignments;

public class TwoWheeler {
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chasisNumber = 123456789L;
	boolean isPunctured = false;
	String bikeName = "fascino";
	double runningKM = 200.00;

	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler();
		System.out.println("Number of wheel = " + obj.noOfWheels);
		System.out.println("Number of mirrors = " + obj.noOfMirrors);
		System.out.println("Chasis Number = " + obj.chasisNumber);
		System.out.println("Punctured = " + obj.isPunctured);
		System.out.println("Bike name = " + obj.bikeName);
		System.out.println("RunningKM = " + obj.runningKM);

	}

}
