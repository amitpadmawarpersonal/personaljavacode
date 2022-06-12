package abstractclass;

public abstract class Page {

	static int time = 15;

	public Page() {
		System.out.println("Page const..");
	}

	public Page(int a) {
		System.out.println("Page arg const.." + a);
	}

	public abstract void getHeader();

	public abstract void getUrl();

	public abstract void login();
	
	public void timeout() {
		System.out.println("Page - timeout");
	}

}
