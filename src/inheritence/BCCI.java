package inheritence;

public class BCCI extends ICC {

	int overs = 70;
	
	public void ipl() {
		System.out.println("BCCI - IPL Individual");
	}
	
	public void ranjiTrophy() {
	System.out.println("BCCI - Ranji Trophy Individual");
	}
	
	public void duleepTrophy() {
		System.out.println("BCCI - Duleep Trophy Individual");
	}
	//@Override
	public void annualCricketAwards() {
		System.out.println("BCCI - Cricket awards Overridden");
	}
	
	public static void teamRatings() {
		System.out.println("BCCI - Ratings Method Hiding");
	}
}
