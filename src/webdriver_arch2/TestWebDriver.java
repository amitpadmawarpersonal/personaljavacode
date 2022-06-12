package webdriver_arch2;

public class TestWebDriver {

	public static void main(String[] args) {
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = null;

		String browser = "SAFARI";
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please enter the valid browser: " + browser);
		}
		String url = driver.getUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		driver.searchElement("email-id");
		driver.sendKeys("email-id", "apadmawar@entrata.lcl");
		driver.searchElement("password");
		driver.sendKeys("password", "Entrata@123");
		driver.searchElement("login-btn");
		driver.click();
		driver.quit();

	}

}
