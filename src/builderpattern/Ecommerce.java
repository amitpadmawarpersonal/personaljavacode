package builderpattern;

public class Ecommerce {

	public Ecommerce login() {
		System.out.println("Default login");
		return this;

	}

	public Ecommerce login(String username, int password) {
		System.out.println("Log in with username and password");
		return this;

	}

	public Ecommerce searchProduct(String name) {
		System.out.println("Search product with name: " + name);
		return this;

	}

	public Ecommerce searchProduct(String name, int price) {
		System.out.println("Search with product name: " + name +","+ " price: " + price);
		return this;

	}

	public Ecommerce addToCart(String name) {
		System.out.println("Product added to the cart: "+name);
		return this;

	}

	public Ecommerce makePayment(String upi) {
		System.out.println("Make payment using upi: " + upi);
		return this;

	}

	public Ecommerce makePayment(String cc, int cvv) {
		System.out.println("Make payment using card no: " + cc + "cvv: " + cvv);
		return this;

	}
	
	public Ecommerce orderId(int id) {
		System.out.println("Your order id: "+id);
		return this;
	}

	public Ecommerce logOut() {
		System.out.println("Logging out..");
		return this;

	}
}
