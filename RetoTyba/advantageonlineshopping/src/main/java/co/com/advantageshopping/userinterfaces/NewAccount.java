package co.com.advantageshopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NewAccount {

    public static final Target BTN_NEW_ACCOUNT = Target.the("Icon to go to create new account").locatedBy("//a[contains(text(),'CREATE NEW ACCOUNT')]");
    public static final Target TXT_USERNAME_REGISTER = Target.the("Field to enter user name to register").locatedBy("//input[@name='usernameRegisterPage']");
    public static final Target TXT_EMAIL = Target.the("Field to enter email to register").locatedBy("//input[@name='emailRegisterPage']");
    public static final Target TXT_PASSWORD = Target.the("Field to enter password to register").locatedBy("//input[@name='passwordRegisterPage']");
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("Field to enter confirm password to register").locatedBy("//input[@name='confirm_passwordRegisterPage']");

    public static final Target BTN_REGISTER = Target.the("Registration button").located(By.id("register_btnundefined"));
    public static final Target CHK_AGREE = Target.the("Check to accept terms").locatedBy("//input[@name='i_agree']");

    public static final Target LBL_MY_ACCOUNT = Target.the("Menu where you see the logged in user name").locatedBy("//*[@id='menuUserLink' ]/span[contains (text (), '{0}')]");

    public static final Target LBL_PASSWORD_NOT_MATCH = Target.the("Label Passwords do not match").locatedBy("//label[contains (text (), 'Passwords do not match')]");

    public static final Target LBL_USER_EXISTS = Target.the("Label User name already exists").locatedBy("//label[contains (text (), 'User name already exists')]");

    public static final Target CLICK = Target.the("Click").locatedBy("//h3[@translate='PERSONAL_DETAILS']");

}
