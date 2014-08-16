package common;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Maruf on 8/11/2014.
 */

public class CommonAPI {
    public static WebDriver driver;
    @Parameters({"url", "browser"})
    @BeforeMethod
    public void setUp(String url, String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("IE") || browser.equalsIgnoreCase("Internet Explorer")) {
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("HTMLUnitDriver")) {
            driver = new HtmlUnitDriver();
        } else driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to(url);
        String expected = "As ffasdfa adfga";
        String actual = "as fasdfasdfadf";
        if (actual.startsWith(expected)) {

        }

    }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }

public enum SelectorType {
    CSS, CLASSNAME, XPATH, TAGNAME, ID, LINKTEXT, PARTIALLINKTEXT, NAME
}
    static public WebElement getElement(String selectorValue, SelectorType selectorType) {
        WebElement element=null;
        switch (selectorType) {
            case XPATH:
                element= driver.findElement(By.xpath(selectorValue));
                break;
            case CSS:
                element=driver.findElement(By.cssSelector(selectorValue));
                break;
            case CLASSNAME:
                element= driver.findElement(By.className(selectorValue));
                break;
            case TAGNAME:
                element= driver.findElement(By.tagName(selectorValue));
                break;
            case ID:
                element= driver.findElement(By.id(selectorValue));
                break;
            case LINKTEXT:
                element= driver.findElement(By.linkText(selectorValue));
                break;
            case PARTIALLINKTEXT:
                element= driver.findElement(By.partialLinkText(selectorValue));
                break;
            case NAME:
                element= driver.findElement(By.name(selectorValue));
                break;
        }
        return element;
    }
    public static List<WebElement> getElementsList(String selectorValue, SelectorType selectorType) {
        List<WebElement>elementList=null;
        switch (selectorType) {
            case XPATH:
                elementList= driver.findElements(By.xpath(selectorValue));
                break;
            case CSS:
                elementList=driver.findElements(By.cssSelector(selectorValue));
                break;
            case CLASSNAME:
                elementList= driver.findElements(By.className(selectorValue));
                break;
            case TAGNAME:
                elementList= driver.findElements(By.tagName(selectorValue));
                break;
            case ID:
                elementList= driver.findElements(By.id(selectorValue));
                break;
            case LINKTEXT:
                elementList= driver.findElements(By.linkText(selectorValue));
                break;
            case PARTIALLINKTEXT:
                elementList= driver.findElements(By.partialLinkText(selectorValue));
                break;
            case NAME:
                elementList= driver.findElements(By.name(selectorValue));
                break;
        }
        return elementList;
    }

}
