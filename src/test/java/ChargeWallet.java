import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.*;
import java.util.*;
public class ChargeWallet extends basePage{
    
    private String url = "https://cooodes.com/wallet-charge";
	
    String charge_wallet_xpath_dashboard;
    String charge_amount_xpath; 
    String charge_payment_xpath;
    String charge_button_xpath;
    
    By charge_wallet_xpath_dashboard_element; 
    By charge_amount_xpath_element;
    By charge_payment_xpath_element;    
    By charge_button_xpath_element;    
    
    public ChargeWallet(WebDriver driver){
        super(driver);
		this.driver.get(this.url);

         this.charge_amount_xpath = "/html/body/app-root/app-wallet-charge/main/div/div/div/div/div/div[2]/form/div[1]/div/div/input";
		 this.charge_payment_xpath = "/html/body/app-root/app-wallet-charge/main/div/div/div/div/div/div[2]/form/div[2]/div/div/select";
		 this.charge_button_xpath = "/html/body/app-root/app-wallet-charge/main/div/div/div/div/div/div[2]/form/div[3]/div/div/button";
         this.logout_xpath = "/html/body/app-root/app-wallet-charge/app-sidebar-nav/div/nav/ul/li[11]/a";
         this.logout_xpath_by = By.xpath(this.logout_xpath);
         this.charge_amount_xpath_element = By.xpath(this.charge_amount_xpath);
         this.charge_payment_xpath_element = By.xpath(this.charge_payment_xpath);
        this.charge_button_xpath_element = By.xpath(this.charge_button_xpath);
         
    }
    void charge_wallet_request(String amount,String paymentmethod){
		
		
		WebElement chargeamountElement = waitVisibiiltyAndFindElement(this.charge_amount_xpath_element );
		
		Select chargepaymentmethodElement = new Select(waitVisibiiltyAndFindElement(this.charge_payment_xpath_element ));
		WebElement chargebuttonElement = waitVisibiiltyAndFindElement(this.charge_button_xpath_element );
		
		chargeamountElement.sendKeys(amount);
		chargepaymentmethodElement.selectByVisibleText(paymentmethod);
		chargebuttonElement.click();
		
	}
}