package accessmodifiers;

public class AccessModifiers {

	int salary = 100;
	private String name = "Amit";
	protected boolean active = true;
	public char c = 'a';

	public void displayPrivate() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		System.out.println(am.c);
		System.out.println(am.active);
		System.out.println(am.name);
		System.out.println(am.salary);
	}
}