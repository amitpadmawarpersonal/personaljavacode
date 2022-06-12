package interfaces;

class NobelHospitals extends UnitedNations implements USMedical, UKMedical {

	int fees = 500;

	// USMedical
	@Override
	public String euroServices(String name) {
		System.out.println("Nobel - Euro overridden");
		return name;

	}

	//method hiding
	public static void physioServices() {
		System.out.println("Nobel - Physio method hiding");

	}

	// Individual
	public void oncoServices() {
		System.out.println("Nobel - Onco individual");
	}

	// UKMedical
	@Override
	public void orthoServices() {
		System.out.println("UK - ortho Override");

	}

	@Override
	public void dentalServices() {
		System.out.println("UK - dental Override");

	}

	// Common across Interfaces
	@Override
	public void emergencyServices() {
		System.out.println("Common - Emergency Override");

	}

	// WHO
	@Override
	public void fireDept() {
		System.out.println("Nobel - fire Override");

	}

	@Override
	public void pharmacy() {
		System.out.println("Common interfaces - pharmacy override");

	}
	
	public void ambulance() {
		System.out.println("Default method of UK interface - overridden");
	}

	@Override
	public void fundsToAfrica() {
		System.out.println("Funds to africa overridden");
		
	}

}