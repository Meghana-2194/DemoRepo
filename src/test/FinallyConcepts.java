package test;

public class FinallyConcepts {

	public static void main(String[] args) {
		try {
		
			int c =25/0;

			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Throwing .......");
		} finally {
			System.out.println("FINALLY......");
		}
	}
}
