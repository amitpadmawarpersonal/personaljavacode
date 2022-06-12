package abstractclass;

public class BrowserTest {

	public static void main(String[] args) {

		Browsers b = new Chrome();
		b.launchBrowser();
		b.searchBar();
		b.resize();
		b.close();
		System.out.println("Size: " + b.size);
		b.developerTools();

		System.out.println("*********");

		Chrome c = new Chrome(9, 8);
		c.launchBrowser();
		c.searchBar();
		c.resize();
		c.close();
		c.deviceToolbar();
		System.out.println("Size: " + c.size);
		c.getSize();
		c.developerTools();
		
		//Abstract class can't be instantiated
		//Browsers bss = new Browsers();

	}

}
