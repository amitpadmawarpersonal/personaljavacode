package webdriver_arch2;

public class SafariDriver implements WebDriver {

	public SafariDriver() {
		System.out.println("Launching the Safari browser...");
	}

	@Override
	public void searchElement(String element) {
		System.out.println("Find element: " + element);

	}

	@Override
	public void searchElements(String element) {
		System.out.println("Search elements: " + element);

	}

	@Override
	public String getUrl() {
		System.out.println("");
		return "https//:www.amazon.com";

	}

	@Override
	public String getTitle() {
		return "Amazon";
	}

	@Override
	public String url() {
		System.out.println("Enter URL");
		return "https//www.amazon.com";
	}

	@Override
	public void click() {
		System.out.println("Click the button ");

	}

	@Override
	public void quit() {
		System.out.println("Quit the browser..");

	}

	@Override
	public void sendKeys(String ele, String value) {
		System.out.println("Search for ele: " + ele + " " + "Enter the valule: " + value);

	}
}
