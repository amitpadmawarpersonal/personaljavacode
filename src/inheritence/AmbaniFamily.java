package inheritence;

public class AmbaniFamily {

	public static void main(String[] args) {
		MukeshAmbani ma = new MukeshAmbani();
		ma.jio();
		ma.mumbaiIndians();
		ma.petroliumBuiss();
		ma.relianceRetail();
		

		System.out.println("************");

		// Top casting
		// Child class objects can be referred by parent class ref variables
		MukeshAmbani ma1 = new AkashAmbani();
		ma1.mumbaiIndians();
		ma1.petroliumBuiss();
		ma1.relianceRetail();
		ma1.jio();
		

		System.out.println("************");

		AkashAmbani aa = new AkashAmbani();
		aa.footballTeam();
		aa.jio();
		aa.mumbaiIndians();
		aa.relianceRetail();
		aa.robotics();
		

		System.out.println("************");
		// Down casting
		// Parent class variables referred by child ref not allowed
//		AkashAmbani aa1 = (AkashAmbani) new MukeshAmbani();
//		aa1.footballTeam();
		
		System.out.println("************");
		
		MukeshAmbani ma3 = new AnantAmbani();
		ma3.jio();
		ma3.mumbaiIndians();
		ma3.petroliumBuiss();
		ma3.relianceRetail();
		
		System.out.println("************");
		
		AnantAmbani aa4 = new AnantAmbani();
		aa4.construction();
		aa4.jio();
		aa4.petroliumBuiss();
		aa4.relianceRetail();
		aa4.mumbaiIndians();
		
		System.out.println("************");
		
		

	}

}