package actions;

import common.CommonAPI;
import page_factory.SignInSignOutObjects;

/**
 * Created by Maruf on 8/15/2014.
 */
public class SignIn extends CommonAPI{
    public static void signIn(String email, String password) {

        SignInSignOutObjects objects = new SignInSignOutObjects(driver);

        objects.signInPageLink.click();

        objects.emailField1.sendKeys(email);
        objects.passwordField1.sendKeys(password);
        objects.signInBtn1.click();


    }
}
