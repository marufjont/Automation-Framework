package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Maruf on 8/15/2014.
 */
public class SearchObjects {
    WebDriver pageObjectDriver;

    @FindBy(id="searchDropdownBox")
    public WebElement dropdownBox;

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchField;

    @FindBy(css="strong")
    public WebElement depNameBold;

    @FindBy(linkText = "Selenium Testing Tools Cookbook")
    public WebElement cookbook;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCartBtn;

    @FindBy(css = "span.nav-cart-button.nav-sprite")
    public WebElement cart;

    @FindBy(css = ".a-list-item")
    public WebElement itemInCart;

       // This constructor calls initelements method of PageFactory class. initelements method will create the WebElements declared in this class
    public SearchObjects(WebDriver driver) {
        this.pageObjectDriver=driver;
        PageFactory.initElements(driver, this);
    }

}
