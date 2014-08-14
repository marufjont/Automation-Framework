package home_page;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by Maruf on 8/11/2014.
 */
public class SAMPLE_TEST extends CommonAPI{

    @Test
    public void mainTest() {


        driver.findElement(By.cssSelector("sds")).sendKeys("ssdsd");



    }


}
