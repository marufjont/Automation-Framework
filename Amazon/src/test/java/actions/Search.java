package actions;

import common.CommonAPI;
import page_factory.SearchObjects;

/**
 * Created by Maruf on 8/15/2014.
 */
public class Search extends CommonAPI {
	public static void search(String searchTerm) {

		SearchObjects searchObjects = new SearchObjects(driver);
		searchObjects.searchField.sendKeys(searchTerm);
		searchObjects.searchField.submit();
	}
}
