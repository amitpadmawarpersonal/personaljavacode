package accessmodifiers;

public class AccessModifiers1 extends AccessModifiers {

	public static void main(String[] args) {
		AccessModifiers a = new AccessModifiers();
		System.out.println(a.active);
		System.out.println(a.c);
		System.out.println(a.salary);
		a.displayPrivate();

	}

}
