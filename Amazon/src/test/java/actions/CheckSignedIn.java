package actions;

import common.CommonAPI;
import page_factory.SignInSignOutObjects;

/**
 * Created by Maruf on 8/15/2014.
 */
public class CheckSignedIn extends CommonAPI{
    public static String originalHelloMessage="Sign in";
    public static boolean checkSignedIn() {
        SignInSignOutObjects sinoutObjs = new SignInSignOutObjects(driver);
        String helloMessage = sinoutObjs.helloMessage.getText();
        if (helloMessage.endsWith(originalHelloMessage)) {

            return false;
        } else {
            System.out.println(helloMessage);
            return true;
        }
    }
}
