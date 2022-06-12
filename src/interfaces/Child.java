package interfaces;

public class Child extends Parent {

	// MethodHiding
//	public static void displayStatic() {
//		System.out.println("Child static");
//	}

	@Override
	public void displayOverridden() {
		System.out.println("Child normal method");
	}

	public void displayOverload(int a) {
		System.out.println("Child overload: "+a);
	}

	public static void main(String[] args) {

		
		Parent p1 = new Parent();
		p1.displayOverload("Archana");
		p1.displayOverridden();
		p1.displayStatic();

		System.out.println("********");

		Child c1 = new Child();
		c1.displayOverload(10);
		c1.displayOverridden();
		c1.displayStatic();

		System.out.println("********");

		Parent p2 = new Child();
		p2.displayOverload("Amit");
		p2.displayOverridden();
		p2.displayStatic();

	}

}
