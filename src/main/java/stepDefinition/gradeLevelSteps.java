package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.ApplicationPage;
import pageObjectModel.SignInPage;
import pageObjectModel.gradeLevelPage;
import pageObjectModel.leftNav;

public class gradeLevelSteps {

        WebDriver driver;
        SignInPage sip = new SignInPage();
        leftNav lv = new leftNav();
        ApplicationPage ap = new ApplicationPage();
        gradeLevelSteps gp= new gradeLevelSteps();

        @Given("^Click on gradelevel$")
        public void click_on_gradelevel() throws Throwable {
            lv.clickOnGradeLevels();
        }
        @Given("^Click on plus icon$")
        public void click_on_plus_icon() throws Throwable {
            ap.clickPlusButton();
        }
        @Given("^Type the gradelevel name \"(.*?)\"$")
        public void type_the_gradelevel_name(String name) throws Throwable {
            gp.type_the_gradelevel_name(name);
        }

        @Given("^Type the shortName \"(.*?)\"$")
        public void type_the_shortName(String shortname) throws Throwable {
            gp.type_the_shortName(shortname);
        }
//    @Given("^click on nextgrade$")
//    public void click_on_nextgrade(String name) throws Throwable {
//      gp.handlingDropdown();
//    }

        @Given("^Type the order \"(.*?)\"$")
        public void type_the_order(String order) throws Throwable {
            gp.type_the_order(order);
        }

        @When("^Click on save button$")
        public void click_on_save_button() throws Throwable {
            ap.clickSaveButton();
        }

        @Then("^\"(.*?)\" should be displayed$")
        public void should_be_displayed(String name) throws Throwable {
            ap.nameIsCreated(name);
        }

        @Then("^Remove the data \"(.*?)\"$")
        public void remove_the_data(String name) throws Throwable {
            ap.deletingElement(name);
        }

        @Then("^Verify data is removed \"(.*?)\"$")
        public void verify_data_is_removed(String name )throws Throwable {
            ap.verifingDeleted(name);
        }

    }