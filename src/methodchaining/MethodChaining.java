package methodchaining;

public class MethodChaining {

	public void m1() {
		System.out.println("m1");
		m2();
		//t1();
	}

	public void m2() {
		System.out.println("m2");
		m3();
	}

	public void m3() {
		System.out.println("m3");

	}
	
	public static void t1() {
		System.out.println("t1");
		t2();
		MethodChaining m = new MethodChaining();
		m.m3();
	}

	public static void t2() {
		System.out.println("t2");
		t3();
		
	}
	
	public static void t3() {
		System.out.println("t3");
	}
	public static void main(String[] args) {
		MethodChaining mc = new MethodChaining();
		mc.m1();
//		mc.t1();

	}

}