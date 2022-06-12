package encapsulation;

public class SwabSample {
	
		
	public void giveSwabSample() {
		System.out.println("Fetching your swab sample...");
		makePayment();
		checkCovidVirus();
		typeReport();
		System.out.println("Your covid report is negative...");
	}
	
	
	private void makePayment() {
		System.out.println("Your payment is successful...");
	}
	
	private void checkCovidVirus() {
		System.out.println("Checking covid strain under special microscope...");
	}
	
	private void typeReport() {
		System.out.println("Lab is typing your covid report...");
	}

}
