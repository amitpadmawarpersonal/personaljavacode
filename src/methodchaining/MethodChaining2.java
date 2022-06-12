package methodchaining;

public class MethodChaining2 {
	
	public void m1() {
		System.out.println("non static m1");
		m2();
	}
	
	public void m2() {
		
	}
	
	public static void t1() {
		System.out.println("static t1");
		t2();
		
	}
	
	public static void t2() {
		
	}

	public static void main(String[] args) {
			MethodChaining2 mc = new MethodChaining2();
			mc.m1();
			t1();

	}

}
