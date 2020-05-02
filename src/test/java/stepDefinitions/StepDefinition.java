package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
     
    }

    @When("^User loin into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_loin_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    	
     
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        
    }

    @And("^Cards are displayed is \"([^\"]*)\"$")
    public void cards_are_displayed_is_something(String strArg1) throws Throwable {
    	System.out.println(strArg1);
        
    }
	
    @And("^User enter the followig registration form$")
    public void user_enter_the_followig_registration_form(DataTable data) throws Throwable {
    	List<List<String>> obj=data.asLists();
    	System.out.println("Datatable example");
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	System.out.println(obj.get(0).get(3));
    	
    }
    @When("^User loin in to application with different (.+) and (.+)$")
    public void user_loin_in_to_application_with_different_and(String username, String password) throws Throwable {
    	System.out.println("Scenario outline example");
    	System.out.println(username);
    	System.out.println(password);
        
    }
    
    @Given("^User launch the browser$")
    public void user_launch_the_browser() throws Throwable {
        System.out.println("User lauch the chrome browser");
    }

    @And("^User enter the URL$")
    public void user_enter_the_url() throws Throwable {
        System.out.println("User enter the URL in the chrome browser");
    }

    


}

