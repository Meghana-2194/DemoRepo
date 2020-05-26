package test;

public  class FinalConcept {

	final int speed = 90; // final variable

	public final void carSpeed() { // final method
		System.out.println("Running Car....");
	}
}

class Speed extends FinalConcept {
	int speed = 100;

	/*
	 * public void carSpeed() { // final method cannot be override
	 * System.out.println("Running Car1111...."); }
	 */

	public static void main(String[] args) {

		Speed s = new Speed();
		s.carSpeed();
		System.out.println(s.speed);

	}

}
