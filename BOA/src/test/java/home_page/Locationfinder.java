package home_page;

import common.CommonAPI;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by Saafiin on 8/14/2014.
 */
public class Locationfinder extends CommonAPI {
    @Test
    public void locationfinderTest() {
        getElement("atm_zip",SelectorType.ID).clear();
        getElement("atm_zip",SelectorType.ID).sendKeys("20770" + Keys.ENTER);
        getElement("a.featureLink",SelectorType.CSS).click();
        String expectedMessage= "locations at";
        String actualMessage= getElement("headText",SelectorType.ID).getText();
        System.out.println("Locationfinder");
        if (actualMessage.contains(expectedMessage)){
            System.out.println("Test Passed");

        }
        else {
            System.out.println("Test Failed");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }

    }

    //First clear then enter location
    //hit go
    //select service n hours for a branch

}
