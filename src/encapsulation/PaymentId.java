package encapsulation;

public class PaymentId {

	public static void main(String[] args) {
		SubmitPayment id = new SubmitPayment();
		id.makePayment();

		if (id.flag) {
			System.out.println("Your payment id: " + 1212);
		}
	}

}
