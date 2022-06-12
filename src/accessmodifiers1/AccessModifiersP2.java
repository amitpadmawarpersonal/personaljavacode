package accessmodifiers1;

import accessmodifiers.AccessModifiers;

public class AccessModifiersP2 extends AccessModifiers {

	public static void main(String[] args) {

		AccessModifiersP2 a2 = new AccessModifiersP2();
		System.out.println(a2.c);
		System.out.println(a2.active);
		a2.displayPrivate();

	}

}