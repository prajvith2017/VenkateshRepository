package stepDefinitions;

import junit.framework.Assert;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.CheckoutPage;
import pageObjects.Home;
import pageObjects.OrderPage;
import Cucumber.Automation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	public static WebDriver driver;
	Home home;
	CheckoutPage checkout;
	OrderPage orderpage;

    @Given("^User is on Greencart Landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
    	   driver=	Base.getDriver();
                
    }

    /*@When("^User searched for \"([^\"]*)\" Vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
    	home=new Home(driver);
    	Thread.sleep(3000);
    	home.getSearch().sendKeys(strArg1);
    	//driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
    	Thread.sleep(3000);       
    }*/
    
    @When("^User searched for (.+) Vegetable$")
    public void user_searched_for_vegetable(String vegetablename) throws Throwable {
    	home=new Home(driver);
    	Thread.sleep(3000);
    	home.getSearch().sendKeys(vegetablename);
    	Thread.sleep(3000);    
        
    }

    @SuppressWarnings("deprecation")
	@Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	
    	home=new Home(driver);
    	Assert.assertTrue(home.getSearchItemDisplayed().getText().contains(strArg1));
    	//Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
    	
    	        
    }
    
    @And("^Add items to cart$")
    public void add_items_to_cart() throws Throwable {
    	checkout=new CheckoutPage(driver);
    	Thread.sleep(2000);
    	checkout.clickPlusSymbolButton().click();
        //driver.findElement(By.xpath("//a[@class='increment']")).click();
        Thread.sleep(2000);
        checkout.clickAddToCartButon().click();
       // driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
        Thread.sleep(2000);
        checkout.clickCheckoutImageBtn().click();
        //driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
        Thread.sleep(2000);
    }

    @And("^User proceeded to Checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
    	
    	checkout.clickProccedToCheckoutBtn().click();
    	//driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        
    }
    

   

    

    
}   