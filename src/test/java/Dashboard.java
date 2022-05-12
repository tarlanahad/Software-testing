import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.*;
import java.util.*;
public class Dashboard extends Nonvoip{
    
    String url = "https://non-voip.com/product";
    String sidebar = "/html/body/div[1]/div/header/div[1]/button/i";
    By sidebar_el = By.xpath(sidebar);

    public Dashboard(WebDriver driver){
            super(driver);
            this.driver.get(this.url);
    }
    public ChargeWallet open_charge_wallet_page(){
		return new ChargeWallet(this.driver);
   }
   public ContactUS contact_us_page(){
        return new ContactUS(this.driver);
}


}
 