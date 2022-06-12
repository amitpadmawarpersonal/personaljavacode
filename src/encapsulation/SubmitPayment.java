package encapsulation;

public class SubmitPayment {
	boolean flag = true;
	public void makePayment() {
		System.out.println("Your payment is in progress...");
		checkInternet();
		checkValidBank();
		checkBalance();
		System.out.println("Your payment is successful");
	}

	private void checkInternet() {
		System.out.println("Checking internet connection...");
	}

	private void checkValidBank() {
		System.out.println("Checking for valid bank...");
	}

	private void checkBalance() {
		System.out.println("Checking positive banlance...");
	}

}
