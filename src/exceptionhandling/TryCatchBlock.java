package exceptionhandling;

public class TryCatchBlock {

	String name;

	public static void main(String[] args) {

		System.out.println("A");
		TryCatchBlock obj = null;
		try {
			int i = 9 / 10;
			obj.name = "Amit";
			System.out.println("Hi");
			
		}

		catch (ArithmeticException e) {
			System.out.println("There is AM exception");
		} catch (NullPointerException e) {
			System.out.println("There is NP exception");
			System.exit(1);
		}

		finally {
			System.out.println("This is finally block");
		}

		System.out.println("B");

	}

}
