package webdriver_arch;

public class FirefoxDriver implements WebDriver {

	public FirefoxDriver() {
		System.out.println("Launching Firefox browser..");
	}

	@Override
	public void findElement(String element) {
		System.out.println("Find the element: " + element);

	}

	@Override
	public void findElements(String element) {
		System.out.println("Find the elements: " + element);

	}

	@Override
	public void get(String url) {
		System.out.println("Enter the URL: " + url);

	}

	@Override
	public String getTitle() {
		return "Amazon";

	}

	@Override
	public String getUrl() {
		return "https://www.amazon.com";

	}

	@Override
	public void click(String ele) {
		System.out.println("CLick element: " + ele);

	}

	@Override
	public void sendKeys(String ele, String value) {
		System.out.println("Enter value in ele: " + ele + "Value: " + value);

	}

	@Override
	public void quit() {
		System.out.println("Quit the brwoser...");

	}
}
