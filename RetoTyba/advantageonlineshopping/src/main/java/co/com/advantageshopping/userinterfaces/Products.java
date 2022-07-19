package co.com.advantageshopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Products {

    public static final Target LNK_POPULAR_ITEMS = Target.the("").locatedBy("//a[contains(text(),'POPULAR ITEMS')]");
    public static final Target LNK_PRODUCT_DIEZ = Target.the("").located(By.id("details_10"));
    public static final Target TXT_QUANTITY = Target.the("").locatedBy("//div[@class='plus']");
    public static final Target BTN_ADD_TO_CART= Target.the("").locatedBy("//button[@name='save_to_cart']");
    public static final Target BTN_CHECKOUT = Target.the("").located(By.id("checkOutPopUp"));
    public static final Target BTN_NEXT = Target.the("").located(By.id("next_btn"));
    public static final Target TXT_SAFEPAY_NAME = Target.the("").locatedBy("//input[@name='safepay_username']");
    public static final Target TXT_SAFEPAY_PASSWORD = Target.the("").locatedBy("//input[@name='safepay_password']");
    public static final Target BTN_PAY_NOW = Target.the("").located(By.id("pay_now_btn_SAFEPAY"));

    public static final Target LBL_ORDER = Target.the("").locatedBy("//span[@class='roboto-regular ng-scope']");

    public static final Target LNK_PRODUCT = Target.the("").located(By.id("details_21"));

    public static final Target LNK_COLOR = Target.the("").locatedBy("//span[@class='bunny productColor ng-scope PURPLE']");

    public static final Target RDB_MASTERCARD = Target.the("").locatedBy("//input[@name='masterCredit']");

    public static final Target TXT_CARD_NUMBER = Target.the("").located(By.id("creditCard"));

    public static final Target TXT_CVV = Target.the("").locatedBy("//input[@name='cvv_number']");

    public static final Target LST_MM= Target.the("").locatedBy("//select[@name='mmListbox']");

    public static final Target SELECT_MM = Target.the("").locatedBy("//option[contains (text (), '{0}')]");

    public static final Target LST_YYYY= Target.the("").locatedBy("//select[@name='yyyyListbox']");

    public static final Target SELECT_YYYY = Target.the("").locatedBy("//option[contains (text (), '{0}')]");

    public static final Target TXT_CARDHOLDER = Target.the("").locatedBy("//input[@name='cardholder_name']");

    public static final Target BTN_PAY_NOW_MANUAL = Target.the("").located(By.id("pay_now_btn_ManualPayment"));








}
