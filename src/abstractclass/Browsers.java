package abstractclass;

public abstract class Browsers {
	
	int size = 100;
	
	public void developerTools() {
		System.out.println("Browser method");
	}
	
	public Browsers() {
		System.out.println("Parent class no arg const");
	}
	
	public Browsers(int a) {
		System.out.println("Parent class param const: "+a);
	}
	
	public Browsers(int b,int c) {
		System.out.println("Parent param const: " + b+", "+c);
	}

	public abstract void launchBrowser();

	public abstract void searchBar();

	public abstract void close();
	
	public void resize() {
		System.out.println("Parent - resize");
	}
	
}