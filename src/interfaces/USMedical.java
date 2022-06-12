package interfaces;

public interface USMedical extends WHO,UNHG {

	int fees = 300;

	public String euroServices(String name);

	public static void physioServices() {
		System.out.println("US - Static method with body");
	}

	public void emergencyServices();

	@Override
	public void pharmacy();

}
