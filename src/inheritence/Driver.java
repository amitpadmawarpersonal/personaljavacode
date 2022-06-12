package inheritence;

class parent {
	
	public void parentMethod() {
		System.out.println("Parent");
	}

}
	class child extends parent {
	public void childMethod() {
		System.out.println("Child method");
	}
}

public	class Driver{
	public static void main(String[] args) {
		parent p1 = new parent();
		p1.parentMethod();
		
		parent p2 = new child();
		p2.parentMethod();
		
		child c1 = new child();
		c1.childMethod();
		c1.parentMethod();
		
		
	}

}
