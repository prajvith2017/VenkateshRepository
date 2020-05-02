package stepDefinitions;

import Cucumber.Automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	@Before("@SeleniumTest")
	public void beforeRun()
	{
		System.out.println("Mobile device capabilites set");
	}
	@After("@Smoke")
	public void afterRun(){
		
		driver.close();
	}
	@After("@Regression")
	public void afterRun1(){
		
		driver.close();
	}
	

}
