package interfaces;

public class TestHospital {

	public static void main(String[] args) {

		NobelHospitals nh1 = new NobelHospitals();
//		nh1.euroServices("Amit");
//		nh1.oncoServices();
//		USMedical.physioServices();
//		nh1.dentalServices();
//		nh1.orthoServices();
//		nh1.emergencyServices();
//		//nh1.donations();
//		NobelHospitals.physioServices();
		nh1.ambulance();
		nh1.fees = 34;
		System.out.println(nh1.fees);

		System.out.println("**********");

		// Top casting - parent ref variable calling child class methods
		USMedical us = new NobelHospitals();
		us.euroServices("Archana");
		USMedical.physioServices();
		us.emergencyServices();
		System.out.println(us.fees);
		

		System.out.println("**********");

		UKMedical uk = new NobelHospitals();
		uk.dentalServices();
		uk.orthoServices();
		uk.emergencyServices();
		uk.ambulance();
		

		System.out.println("**********");

		WHO wh = new NobelHospitals();
		wh.fireDept();
		wh.pharmacy();
		
		System.out.println("**********");
		
		UnitedNations un = new UnitedNations();
		un.donations();
		
		System.out.println("**********");
		
		//Top casting
		UnitedNations  un1 = new NobelHospitals();
		un1.donations();
		
		System.out.println("**********");
		
		//Compile time Down casting not possible - As can't create objects for Interfaces
		
		//Compile time down casting is possible at class level
		//NobelHospitals nh2 = (NobelHospitals) new UnitedNations();
		
		UNHG u123 = new NobelHospitals();
		u123.fundsToAfrica();
		
		 
		
		
		
		

	}

}
