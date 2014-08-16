package actions;

import page_factory.SignInSignOutObjects;

import static actions.CheckSignedIn.checkSignedIn;
import static actions.SignIn.signIn;
import static common.CommonAPI.driver;

/**
 * Created by Maruf on 8/15/2014.
 */
public class SignOut {

    public static void signOut() {

        SignInSignOutObjects sinoutObjs = new SignInSignOutObjects(driver);
        sinoutObjs.helloMessage.click();
        sinoutObjs.signOutLink.click();

    }



}
