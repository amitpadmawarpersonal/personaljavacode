package inheritence;

public class ICC extends MCC {
	
	static final int overs = 60;
	
	public final void odiWorldCup() {
		System.out.println("ICC - ODI Worldcup inheritted");
	}
	
	public void t20WorldCup() {
		System.out.println("ICC - T20 Worldcup inheritted");
	}
	
	public void testChampionship() {
		System.out.println("ICC - Test Championship inheritted");
	}
	
	public void annualCricketAwards() {
		System.out.println("ICC - Cricket awards inheritted");
	}
	
	public static void teamRatings() {
		System.out.println("ICC - Team Ratings");
	}

}












//create grandparent vehicle and try to access methods across classes - Done
//create a truck as a parent of BMW class and try to access methods across - Done
//Create sibling of BMW under car and access properties - Done
//create static method in parent and try to override and overload it in child and call across - Done
//Create private method in car and access it across - Done
//Create variables in Car class and try to override, inherit and access it across - Done
//Create method with final keyword and try to override and access it diff classes - Done
//Make parent class a Final and see what happens - Done
//Create static final variables and try to access it in diff classes - Done