package builderpattern;

public class ATMWork {

	public static void main(String[] args) {
		ATM a = new ATM();
		a.insertCard();
		
//		constructor
//		setter
//		getter
		
//		GET - fetch
//		POST - post new data
//		PUT - update data
//		UPDATE
			
		
		//
		
		a.insertCard()
			.depositMoney(5678)
				.removeCard();
		
		//
		
//		a.insertCard()
//			.depositMoney(56565656)
//				.removeCard();
		
		//
//		a.insertCard()
//			.checkBalance()
//				.removeCard();

	}

}
