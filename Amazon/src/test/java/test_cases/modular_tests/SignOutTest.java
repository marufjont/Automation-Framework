package test_cases.modular_tests;

import common.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import static actions.CheckSignedIn.checkSignedIn;
import static actions.SignIn.signIn;
import static actions.SignOut.signOut;
import static common.CommonAPI.driver;
import static common.CommonAPI.getElement;

/**
 * Created by Maruf on 8/15/2014.
 */
public class SignOutTest extends CommonAPI {
    @Test
    public void signOutTest() {

        // work in progress

//        // check if signed in here
//        if (!checkSignedIn()) {
//            // if not signed in sign in first
//            signIn("yolki@list.ru", "user123");
//        }
//        // call sign out function
//        signOut();
//        // assertFalse signed in
//        Assert.assertFalse(checkSignedIn());
    }
}
