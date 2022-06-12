package abstractclass;

public class DriverClass {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage(23);
		lp.getHeader();
		lp.getUrl();
		lp.login();
		System.out.println(Page.time);
		lp.timeout();
		
		
		System.out.println("********");
		
		Page p = new LoginPage(4);
		p.getHeader();
		p.getUrl();
		p.login();
		p.timeout(); 
	}

}
