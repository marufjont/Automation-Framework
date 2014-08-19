package common;


import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Maruf on 8/11/2014.
 */

public class CommonAPI {
    public static WebDriver driver;


    @Parameters({"url","username", "key", "os", "browser", "browserVersion", "runSauce"})
    @BeforeMethod
    public void setUp(@Optional("http://www.amazon.com") String url,
                      @Optional("marufjont") String userName,
                      @Optional ("889ce934-413c-43b1-8b1c-b5e9be5eb346") String key,
                      @Optional ("Windows 8.1") String os,
                      @Optional ("firefox") String browser,
                      @Optional ("31.0") String browserVersion,
                      @Optional ("false") boolean runSauce) throws Exception {
        if (runSauce) {
            setUpSauceDriver(userName, key, os, browser, browserVersion);
            } else {
            setUpLocalDriver(url, browser);
        }
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void setUpSauceDriver(String userName, String key, String os, String browser, String browserVersion) throws Exception {
        // Choose the browser, version, and platform to test
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);
        capabilities.setCapability("version", browserVersion);
        capabilities.setCapability("platform", Platform.valueOf(os));
        // Create the connection to Sauce Labs to run the tests
        this.driver = new RemoteWebDriver(
                new URL("http://" + userName + ":" + key + "@ondemand.saucelabs.com:80/wd/hub"),
                capabilities);
    }
    @Parameters({"url", "browser"})
    public void setUpLocalDriver(String url, String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("IE") || browser.equalsIgnoreCase("Internet Explorer")) {
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("HTMLUnitDriver")) {
            driver = new HtmlUnitDriver();
        } else driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to(url);
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
