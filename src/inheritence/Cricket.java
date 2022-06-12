package inheritence;

public class Cricket {
	
	final static String role = "bowler";

	public static void main(String[] args) {
		
		//Cricket.role = "batter";
		System.out.println(Cricket.role);
		
		
		final int overs = 40;//constant value because of final keyword
		//overs = 90;
		System.out.println(overs);
		
		System.out.println("**ICC i1 = new ICC()**");
		
		ICC i1 = new ICC();
		i1.odiWorldCup();
		i1.t20WorldCup();
		i1.testChampionship();
		i1.annualCricketAwards();
		i1.noSaliva();
		i1.mankaddingIsLegal();
		ICC.teamRatings();
		System.out.println(ICC.overs);

		System.out.println("**ICC i2 = new BCCI**");

		ICC i2 = new BCCI();//only parent and overridden,no individual
		//i2.odiWorldCup();
		i2.t20WorldCup();
		i2.testChampionship();
		i2.annualCricketAwards();
		i2.noSaliva();
		i2.mankaddingIsLegal();
		ICC.teamRatings();
		BCCI.teamRatings();
		System.out.println(ICC.overs);

		System.out.println("**BCCI b1 = new BCCI()**");

		BCCI b1 = new BCCI();
		b1.duleepTrophy();
		b1.ipl();
		b1.odiWorldCup();
		b1.ranjiTrophy();
		b1.t20WorldCup();
		b1.testChampionship();
		b1.annualCricketAwards();
		b1.noSaliva();
		b1.mankaddingIsLegal();
		ICC.teamRatings();
		BCCI.teamRatings();
		System.out.println(b1.overs);

		
		System.out.println("**MCC m1 = new MCC()**");

		MCC m1 = new MCC();
		m1.noSaliva();
		m1.mankaddingIsLegal();
		ICC.teamRatings();
		BCCI.teamRatings();
		System.out.println(m1.overs);

		
		System.out.println("**MCC m2 = new BCCI()**");

		MCC m2 = new BCCI();
		m2.mankaddingIsLegal();
		m2.noSaliva();
		System.out.println(m2.overs);
		
		System.out.println("**MCC m3 = new ICC()*8");

		MCC m3 = new ICC();
		m3.mankaddingIsLegal();
		m3.noSaliva();
		System.out.println(m3.overs);

		
		System.out.println("**MCC m4 = new ECB()**");

		MCC m4 = new ECB();
		m4.mankaddingIsLegal();
		m4.noSaliva();
		System.out.println(m4.overs);

		
		System.out.println("**ECB e1 = new ECB()**");

		ECB e1 = new ECB();
		e1.annualCricketAwards();
		e1.countyCricket();
		e1.theHundred();
		e1.odiWorldCup();
		e1.t20WorldCup();
		e1.testChampionship();
		e1.noSaliva();
		e1.mankaddingIsLegal();
		System.out.println(i2.overs);
		
		
		
	
	}

}
