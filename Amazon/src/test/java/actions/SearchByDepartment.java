package actions;

import common.CommonAPI;
import org.openqa.selenium.support.ui.Select;
import page_factory.SearchObjects;

/**
 * Created by Maruf on 8/15/2014.
 */
public class SearchByDepartment extends CommonAPI{
    public static void searchByDepartment(String departmentName) throws InterruptedException {

        SearchObjects searchObjects = new SearchObjects(driver);

        Select dropdownMenu = new Select(searchObjects.dropdownBox);

        dropdownMenu.selectByVisibleText(departmentName);

        searchObjects.searchField.sendKeys("selenium testing tools cookbook");
        searchObjects.searchField.submit();
    }


}
