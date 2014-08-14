package home_page;

import common.CommonAPI;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by Saafiin on 8/14/2014.
 */
public class Search extends CommonAPI {
    @Test
    public void searchTest() throws InterruptedException {
        //find the search box
        getElement("questionbox",SelectorType.ID).clear();
        getElement("questionbox",SelectorType.ID).sendKeys("cash"+ Keys.ENTER);
        getElement("stateList",SelectorType.ID).click();

        getElement("option[value='DC']",SelectorType.CSS).click();
        Thread.sleep(1000);

        getElement("state_select_submit", SelectorType.ID).click();
 String expectedMessage="Search";
 String actualMessage= getElement("h1.cnx-regular",SelectorType.CSS).getText();

        System.out.println("searchTest");
        if (expectedMessage.equals(actualMessage)){
            System.out.println("Test Passed");
        }
        else {
            System.out.printf("Test Failed");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
            //type search term
        }
        //hit enter key
    }
}
