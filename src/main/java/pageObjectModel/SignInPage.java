package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;
import utulities.ReadPropertiesFile;

public class SignInPage extends  AbstractClass {

    private WebDriver driver ;

    public SignInPage(){

        driver= Driver.getDriver();
        PageFactory.initElements( driver , this );

    }

    @FindBy(css="[formcontrolname=\"username\"]")
    private WebElement inputUserName;

    @FindBy(css="[formcontrolname=\"password\"]")
    private WebElement inputPassword;

    @FindBy(css="button[aria-label=\"LOGIN\"]")
    private WebElement buttonLogin;

    public void typeIninputUserName(){
        sendkeysFunction(inputUserName , ReadPropertiesFile.getData("Username") );
    }

    public void typeIninputPassword(){
        sendkeysFunction(inputPassword ,ReadPropertiesFile.getData( "Password" ) );
    }

    public void clickonbuttonLogin(){
        clickFunction(buttonLogin);
    }

}