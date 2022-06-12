package builderpattern;

public class ATM {

	public ATM insertCard() {
		System.out.println("Please insert your debit card..");
		return this;
	}

	public ATM enterPassword(int a) {
		System.out.println("Please enter your password");
		return this;
	}

	public ATM checkBalance() {
		System.out.println("Checking your balance...");
		return this;
	}

	public ATM withdrawMoney(int cc_no, int cvv) {
		System.out.println("Please collect your money..." +"cc_no: "+ cc_no + " cvv: " + cvv);
		return this;
	}

	public ATM depositMoney(String checkNo) {
		System.out.println("Insert your cheque: " + checkNo);
		return this;
	}

	public ATM depositMoney(int amount) {
		System.out.println("Enter notes.." + amount);
		return this;
	}

	public void removeCard() {
		System.out.println("Please remove your card..");
	}

}
