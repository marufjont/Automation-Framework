package test_cases.modular_tests;

import common.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import static actions.SignIn.signIn;
import static common.CommonAPI.driver;

public class SignInTest extends CommonAPI{
    String email = "yolki@list.ru";
    String password = "user123";
    String expectedMessage = "Hello, Test";

    @Test
    public void testSignIn() throws Exception {

        signIn(email, password);
        String actualMessage=getElement("nav-signin-title",SelectorType.ID).getText();
        System.out.println(actualMessage);
        Assert.assertTrue(expectedMessage.equalsIgnoreCase(actualMessage));


    }
}