package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	public WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By click_puls_symbol=By.xpath("//a[@class='increment']");
	By add_to_cart=By.xpath("//button[text()='ADD TO CART']");
	By click_chekout_image_btn=By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]");
	By click_proceed_to_checkout_btn=By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	
	
	
	public WebElement clickPlusSymbolButton()
	{
		return driver.findElement(click_puls_symbol);
	}
	public WebElement clickAddToCartButon()
	{
		return driver.findElement(add_to_cart);
	}
	public WebElement clickCheckoutImageBtn(){
		return driver.findElement(click_chekout_image_btn);
	}
	public WebElement clickProccedToCheckoutBtn()
	{
		return driver.findElement(click_proceed_to_checkout_btn);
	}
	
	
	

}
