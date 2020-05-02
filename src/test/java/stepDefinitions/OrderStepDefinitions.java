package stepDefinitions;

import io.cucumber.java.en.Then;
import junit.framework.Assert;
import pageObjects.OrderPage;
import Cucumber.Automation.Base;

public class OrderStepDefinitions extends Base {
	public OrderPage orderpage;
		/* @Then("^Verify selected \"([^\"]*)\" items are dispyaled in Checkout page$")
	    public void verify_selected_something_items_are_dispyaled_in_checkout_page(String strArg1) throws Throwable {
	    	orderpage=new OrderPage(driver);
	    	Thread.sleep(2000);
	    	Assert.assertTrue(orderpage.searchItemIsDiplayed().getText().contains(strArg1));
	    	//Assert.assertTrue(driver.findElement(By.xpath("//*[@class='product-name']")).getText().contains(strArg1));
	    	        
	    }*/
		 
		 @Then("^Verify selected (.+) items are dispyaled in Checkout page$")
		    public void verify_selected_items_are_dispyaled_in_checkout_page(String vegetablename) throws Throwable {
			 orderpage=new OrderPage(driver);
		    	Thread.sleep(2000);
		    	Assert.assertTrue(orderpage.searchItemIsDiplayed().getText().contains(vegetablename));
		    }

}
