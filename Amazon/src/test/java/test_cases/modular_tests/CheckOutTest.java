package test_cases.modular_tests;

import common.CommonAPI;
import org.testng.annotations.Test;
import page_factory.SearchObjects;

import static actions.CheckOut.checkOut;
import static actions.Search.search;
import static org.testng.Assert.assertTrue;

/**
 * Created by Maruf on 8/15/2014.
 */
public class CheckOutTest extends CommonAPI{
    @Test
    public void checkOutItemTest() {
        String searchTerm = "Selenium cook book";
        // search
        search(searchTerm);
        // checkout item
        checkOut();
        // verify

        SearchObjects searchObjs = new SearchObjects(driver);
        searchObjs.cart.click();
        assertTrue(searchObjs.itemInCart.isEnabled());
    }
}
