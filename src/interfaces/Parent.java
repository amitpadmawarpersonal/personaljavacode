package interfaces;

public class Parent {

	public static void displayStatic() {
		System.out.println("Parent static");
	}

	public void displayOverridden() {
		System.out.println("parent normal method");
	}

	public void displayOverload(String a) {
		System.out.println("Parent overload: " + a);
	}

}
