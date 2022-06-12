package webdriver_arch;

public class TestAmazon {

	public static void main(String[] args) {

		// Cross browser testing: Chrome, FF and Safari

		// ChromeDriver driver = new ChromeDriver();

		String browser = "edge";
		WebDriver driver = null;
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("safari")) {
			 driver = new SafariDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please enter valid browser name: " + browser);
		}

		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getUrl();
		System.out.println(url);

		driver.findElement("email");
		driver.sendKeys("email", "test@test.lcl");

		driver.findElement("pswd");
		driver.sendKeys("pswd", "Amit@123");

		driver.findElement("login-btn");
		driver.click("login-btn");

		driver.quit();

	}

}
