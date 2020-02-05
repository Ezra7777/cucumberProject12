package stepDefinition;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageObjectModel.ApplicationPage;
import pageObjectModel.SignInPage;
import pageObjectModel.leftNav;
import utulities.Driver;
import utulities.ReadPropertiesFile;

import java.util.concurrent.TimeUnit;

public class FeeSteps {
    WebDriver driver;
    SignInPage sip = new SignInPage();
    leftNav lv = new leftNav();
    ApplicationPage ap = new ApplicationPage();
    FeeSteps fp = new FeeSteps();

    @Given("^Go to mersys website$")
    public void go_to_mersys_website() throws Throwable {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get(ReadPropertiesFile.getData("URL"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {
        sip.typeIninputUserName();
        sip.typeIninputPassword();
        sip.clickonbuttonLogin();
    }

    @Given("^Click on setup on top$")
    public void click_on_setup_on_top() throws Throwable {
        lv.clickondropdownSetup();
    }

    @Given("^Click on parameters$")
    public void click_on_parameter() throws Throwable {
        lv.clickondropdownParameters();
    }

    @Given("^Click on fee$")
    public void click_on_fee() throws Throwable {
        lv.clickOnFees();

    }


    //    @Given("^Click on plus icon$")
//    public void click_on_plus_icon() throws Throwable {
//        ap.clickPlusButton();
//    }
    @Given("^Type the  feename \"(.*?)\"$")
    public void type_the_feename(String name) throws Throwable {
        fp.type_the_feename(name);
    }

    @Given("^Type the  feecode \"(.*?)\"$")
    public void type_the_feecode(String code) throws Throwable {
        fp.type_the_feecode(code);
    }

    @Given("^Type in Feepriority \"(.*?)\"$")
    public void type_in_Feepriority( String priority) throws Throwable {
        fp.type_in_Feepriority(priority);

    }
}

