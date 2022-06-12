package builderpattern;

public class Amazon {

	public static void main(String[] args) {
		Ecommerce e = new Ecommerce();
		e.login()
			.searchProduct("iPhone")
				.addToCart("iPhone")
					.makePayment("989898@hdfc")
						.orderId(232323)
							.logOut();
		
		//
		e.login("amit@tgmail.lcl", 12345)
			.searchProduct("bluetooth speakers", 3500)
				.logOut();

	}

}
