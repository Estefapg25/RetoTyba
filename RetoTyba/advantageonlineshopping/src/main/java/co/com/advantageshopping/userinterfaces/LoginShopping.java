package co.com.advantageshopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginShopping {

    public static final Target BTN_USER = Target.the("Icon to go to login").locatedBy("//*[@id='menuUser']");
    public static final Target TXT_NAME_USER = Target.the("field to enter user name").locatedBy("//*[@name='username']");
    public static final Target TXT_PASSWORD_USER = Target.the("field to enter password").locatedBy("//*[@name='password']");
    public static final Target BTN_SIGN_IN = Target.the("Icon to go to login").located(By.id("sign_in_btnundefined"));

}
