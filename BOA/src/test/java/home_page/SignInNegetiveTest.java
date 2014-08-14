package home_page;

import common.CommonAPI;
import org.testng.annotations.Test;

import javax.swing.text.html.CSS;

/**
 * Created by Saafiin on 8/14/2014.
 */
public class SignInNegetiveTest extends CommonAPI {

    @Test
public void signintest () throws InterruptedException {

        String errorMessage = "We can't process your request:";
        //type login info.then
        getElement("#id", SelectorType.CSS).sendKeys("marat");
        Thread.sleep(2000);
        //Click
        getElement("hp-sign-in-btn", SelectorType.ID).click();

        //get the error message
        String actualMessage = getElement("b", SelectorType.CSS).getText();
        System.out.println("signtest");
        if (errorMessage.equals(actualMessage)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
            System.out.println("expectedMessage = " + errorMessage);
            System.out.println("actualMessage = " + actualMessage);

        }
    }


}
