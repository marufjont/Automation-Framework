package actions;

import common.CommonAPI;
import page_factory.SearchObjects;

/**
 * Created by Maruf on 8/15/2014.
 */
public class CheckOut extends CommonAPI{
    public static  void checkOut() {
        SearchObjects searchObjs = new SearchObjects(driver);
        searchObjs.cookbook.click();
        searchObjs.addToCartBtn.click();
    }
}
