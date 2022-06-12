package abstractclass;

public class LoginPage extends Page {

	public LoginPage() {
		System.out.println("LoginPage const..");
	}

	public LoginPage(int a) {
		super();
		System.out.println("LoginPage const.." + a);
	}

	@Override
	public void getHeader() {
		System.out.println("LP - get header");

	}

	@Override
	public void getUrl() {
		System.out.println("LP - get url");

	}

	@Override
	public void login() {
		System.out.println("LP - login");

	}

	@Override
	public void timeout() {
		System.out.println("LP - timeout");
	}

}
