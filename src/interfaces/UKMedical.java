package interfaces;

public interface UKMedical extends WHO,UNHG {

	void orthoServices();

	void dentalServices();

	public void emergencyServices();

	@Override
	public void pharmacy();
	
	default void ambulance() {
		System.out.println("Default method of UK interface");
	}
}
