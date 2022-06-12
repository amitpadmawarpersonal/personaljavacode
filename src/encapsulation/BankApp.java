package encapsulation;

public class BankApp {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setName("Amit");
		System.out.println(c.getName());
		
		c.setBalance(1234);
		System.out.println(c.getBalance());

	}

}
