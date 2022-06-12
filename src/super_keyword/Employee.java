package super_keyword;

public class Employee extends Company {
	
	int salary = 200;
	
	public void getSalary() {
		System.out.println(salary);
		System.out.println(super.salary);
	}
	
	public void holiday() {
		super.holiday();
		System.out.println("Emp holiday");
		System.out.println(super.salary);
	}

	public Employee() {
		super();
		System.out.println("Child no param const");
	}
	
	public Employee(int a) {
		
		System.out.println("Child one param const: "+a);
	}
	
	public Employee(int a,int b) {
		//super(a, b);
		this(a);
		System.out.println("Child two param const: "+a+" "+b);
	}
}
