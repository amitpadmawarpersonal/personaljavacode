package super_keyword;

public class Company extends State {
	
	int salary = 100;
	
	public void getSalary() {
		System.out.println("company salary");
	}
	
	public void holiday() {
		System.out.println("Comp holiday");
	}
	
	public Company() {
		super();
		System.out.println("Company no param const");
	}
	
	public Company(int a) {
		System.out.println("Company one param const: "+a);
	}

	public Company(int a,int b) {
		System.out.println("Company two param const: "+a+" "+b);
	}
}
