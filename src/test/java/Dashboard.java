import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.*;
import java.util.*;
public class Dashboard extends cooodes{
    
    String url = "https://cooodes.com/dashboard";
    public Dashboard(WebDriver driver){
            super(driver);
            this.driver.get(this.url);
    }
    ChargeWallet open_charge_wallet_page(){
		return new ChargeWallet(this.driver);
   }
   Code open_codespage(){
        return new Code(this.driver);
}
}
