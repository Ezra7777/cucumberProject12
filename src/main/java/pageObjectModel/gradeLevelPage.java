package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

import java.util.List;

public class gradeLevelPage extends  AbstractClass {

    private WebDriver driver ;

    public gradeLevelPage(){

        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );
    }
    @FindBy(xpath="//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement inputgradelevelName;

    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input")
    private WebElement inputgradelevelShortName;

    @FindBy(xpath = "//spn[contains(text(),'Next Grade')]")
    private WebElement dropdownNextGrade;


    @FindAll({
            @FindBy(xpath = "//div[@class='cdk-overlay-pane']/div/div")
    })
    private List<WebElement> nextGradeOptions;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']/input")
    private WebElement inputOrder;


    /**
     *
     */


    public void typeInTheInputgradelevelName(String name) {
        sendkeysFunction(inputgradelevelName, name);
    }

    public void typeIntheInputgradeleveShortName(String shortName) {
        sendkeysFunction(inputgradelevelShortName, shortName);
    }

    public void typeInOrder() {
        sendkeysFunction(inputOrder, "Some order");
    }

    //

    public void handlingDropdown(WebElement dropdownNextGrade, List<WebElement> nextGradeOptions) {
        handlingDropdown(this.dropdownNextGrade, this.nextGradeOptions);
    }
}