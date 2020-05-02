package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {
public WebDriver driver;
public OrderPage(WebDriver driver)
{
	this.driver=driver;
}

By search_item_displayed=By.xpath("//*[@class='product-name']");

public WebElement searchItemIsDiplayed()
{
	return driver.findElement(search_item_displayed);
}

	
}
