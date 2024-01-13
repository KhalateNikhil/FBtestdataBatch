package StepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
public class fbdataSteps {

@Given("user is on rgister page")
public void user_is_on_rgister_page() {
	
   }

@When("user enter firstname, lastname, and email")
public void user_enter_firstname_lastname_and_email(DataTable dataTable) {
	
	List<List<String>> ls=dataTable.cells();
	String a=ls.get(0).get(0);
      System.out.println(a);
	
	String b=ls.get(0).get(1);
	System.out.println(b);
	
	String c=ls.get(0).get(2);
	System.out.println(c);
	
	String d=ls.get(1).get(0);
	System.out.println(d);
	
	String e=ls.get(1).get(1);
	System.out.println(e);
	
	String f=ls.get(1).get(2);
	System.out.println(f);
	
	String g=ls.get(2).get(0);
	System.out.println(g);
	
	String h=ls.get(2).get(1);
	System.out.println(h);
	
	String j=ls.get(2).get(2);
	System.out.println(j);
	
	
	
	
	
 }

}
