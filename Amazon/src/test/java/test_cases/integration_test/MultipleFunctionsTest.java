package test_cases.integration_test;

import common.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_factory.SearchObjects;

import static actions.CheckOut.checkOut;
import static actions.Search.search;
import static actions.SignIn.signIn;
import static org.testng.Assert.assertTrue;

/**
 * Created by Maruf on 8/15/2014.
 */
public class MultipleFunctionsTest extends CommonAPI {
    /**
     * This class will test the AUT by completing several steps which are:
     * search for an item;
     * add a result to cart
     * sign in
     * verify that the item is still in the cart
     */
    String email = "yolki@list.ru";
    String password = "user123";
    String searchTerm = "selenium cookbook";
    @Test
    public void multipleFunctionsTest() throws InterruptedException {
        driver.manage().window().maximize();
        // search
        search(searchTerm);
        Thread.sleep(2000);
        // add to cart
        checkOut();
        // sign in
        driver.get("http://www.amazon.com");
        Thread.sleep(2000);
        signIn(email, password);
        // verify cart item
        SearchObjects searchObjs = new SearchObjects(driver);
        searchObjs.cart.click();
        assertTrue(searchObjs.itemInCart.isEnabled());

    }
}
