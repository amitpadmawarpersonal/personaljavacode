package abstractclass;

public class Chrome extends Browsers {
	
	int size = 50;
	
	public void developerTools() {
		System.out.println(size+"545454");
		super.developerTools();
		System.out.println("Chrome method");
	}
	
	public void getSize() {
		System.out.println(super.size);
		
	}

	public Chrome() {
		System.out.println("Child no arg const");
	}

	public Chrome(int a) {
		super(a);
		System.out.println("Child param const: " + a);
	}
	
	public Chrome(int b,int c) {
		super(b,c);
		System.out.println("Child param const: " + b+", "+c);
	}

	@Override
	public void launchBrowser() {
		System.out.println("Chrome - Launch the browser @Override");

	}

	@Override
	public void searchBar() {
		System.out.println("Chrome - searchbar @Override");

	}

	@Override
	public void close() {
		System.out.println("Chrome - close the browser @Override");

	}

	public void deviceToolbar() {
		System.out.println("Chrome - Device toolbar individual");
	}

}
