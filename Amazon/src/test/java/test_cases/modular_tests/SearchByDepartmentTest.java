package test_cases.modular_tests;

import common.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_factory.SearchObjects;

import static actions.SearchByDepartment.searchByDepartment;

public class SearchByDepartmentTest extends CommonAPI{
    String department = "Books";
    String searchTerm="";
    @Test
    public void testSearchByDepartment() throws Exception {
        searchByDepartment(department);
        SearchObjects deptObjs = new SearchObjects(driver);
        String actualDept= deptObjs.depNameBold.getText();
        Assert.assertEquals(actualDept, department);
    }
}