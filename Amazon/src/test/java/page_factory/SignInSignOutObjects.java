package page_factory;

import common.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Maruf on 8/15/2014.
 */
public class SignInSignOutObjects {
    /**
     * all WebElements to be used in tests will be created here
     * all WebElements will be available to the object reference to this class
     *
     */
    WebDriver pageObjectDriver;

    @FindBy(id="nav-signin-text")
    public WebElement signInPageLink;

    // sing in objects version 1
    @FindBy(id="ap_email")
    public WebElement emailField1;

    @FindBy(id="ap_password")
    public WebElement passwordField1;

    @FindBy(id="signInSubmit-input")
    public WebElement signInBtn1;
            // sign in objects version two
    @FindBy(css="#auth-email")
    public WebElement emailField2;

    @FindBy(css="#auth-password")
    public WebElement passwordField2;

    @FindBy(css=".a-button-input")
    public WebElement signInBtn2;

    @FindBy(id="nav-signin-title")
    public WebElement helloMessage;


    @FindBy(id="ap_signin_existing_radio")
    public WebElement existingCustomerRadioBtn;

    @FindBy(id="nav-item-signout")
    public WebElement signOutLink;


    // This constructor calls initelements method of PageFactory class. initelements method will create the WebElements declared in this class
    public SignInSignOutObjects(WebDriver driver) {
        this.pageObjectDriver=driver;
        PageFactory.initElements(driver, this);
    }
}
