package test;

public class Finalize {

	public void finalize() {
		System.out.println("Printing finalize ......");
	}

	public static void main(String[] args) {
		Finalize f = new Finalize();

		f = null;
		System.gc();

	}

}
