package webdriver_arch2;

public interface WebDriver extends SearchContext {
	
	@Override
	public void searchElement(String element);
	@Override
	public void searchElements(String element);
	public String getUrl();
	public String getTitle();
	public String url();
	public void click();
	public void quit();
	public void sendKeys(String ele,String value);
	

}
