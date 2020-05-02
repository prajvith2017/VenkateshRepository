package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	public WebDriver driver;
	
	public Home(WebDriver driver)
	{
		
		this.driver=driver;
	}
	

	By search=By.xpath("//input[@type='search']");
	By search_item_displayed=By.cssSelector("h4.product-name");
	
	public WebElement getSearch()
	{
		return driver.findElement(search);
	}
	public WebElement getSearchItemDisplayed()
	{
	return driver.findElement(search_item_displayed);	
	}
}
