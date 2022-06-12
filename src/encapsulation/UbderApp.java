package encapsulation;

public class UbderApp {

	// 1. Open Uber App
	// 2. Check Internet Connection
	// 3. Check if app version is eligible
	// 4. Check if there is enough space in mobile to launch the app

	public void openUberApp() { //Using this public method to call all the background private methods and call it in UberBooking class
		System.out.println("Launching Uber app...");
		checkInternetConnection();
		latestAppVersion();
		enoughMemory();
		validCity();
		System.out.println("Welcome to the Uber app...");
		
	}
	private void checkInternetConnection() {
		System.out.println("checking if mobile has internet turned on...");
	}

	private void latestAppVersion() {
		System.out.println("Checking if the app version is eligible...");
	}

	private void enoughMemory() {
		System.out.println("Checking if the phone has enough memory...");
	}

	private void validCity() {
		System.out.println("Checking if Uber services are available in your city...");
	}
	
}

//assignments

//2. uni--courses
//
//college -- courses
//
//student - top and down casting