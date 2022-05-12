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
    
    private String url = "https://non-voip.com/payment/top-up";
	
    String charge_wallet_xpath_dashboard;
    String charge_amount_xpath; 
    String charge_payment_xpath;
    String charge_button_xpath;
    String attachment;
    String tokens;
    By charge_wallet_xpath_dashboard_element; 
    By charge_amount_xpath_element;
    By charge_payment_xpath_element;    
    By charge_button_xpath_element;    
    By attachment_xpath_element;
    By token_element;
    
    public ChargeWallet(WebDriver driver){
        super(driver);
		this.driver.get(this.url);

         this.charge_amount_xpath = "/html/body/div[1]/div/div/div/div/div/div[2]/div[1]/div/form/div[2]/input";
		 this.charge_payment_xpath = "/html/body/div[1]/div/div/div/div/div/div[2]/div[1]/div/form/div[1]/div[1]/select";
		 this.charge_button_xpath = "/html/body/div[1]/div/div/div/div/div/div[2]/div[1]/div/form/div[6]/button[1]";
         this.logout_xpath = "/html/body/div[5]/div/div/div[3]/div/button[13]";
         this.side_par = "/html/body/div[1]/div/header/div[1]/button/i";
         this.attachment = "/html/body/div[1]/div/div/div/div/div/div[2]/div[1]/div/form/div[3]/input";
         this.tokens = "/html/body/div[1]/div/div/div/div/div/div[2]/div[1]/div/form/div[4]/textarea";
         this.token_element = By.xpath(this.tokens);
         this.logout_xpath_by = By.xpath(this.logout_xpath);
         this.charge_amount_xpath_element = By.xpath(this.charge_amount_xpath);
         this.charge_payment_xpath_element = By.xpath(this.charge_payment_xpath);
        this.charge_button_xpath_element = By.xpath(this.charge_button_xpath);
        this.attachment_xpath_element = By.xpath(this.attachment);
         this.side_ele = By.xpath(this.side_par);
    }
    void charge_wallet_request(String amount,String paymentmethod,String file_path){
		
		System.out.println("========= charge_wallet_request");
		WebElement chargeamountElement = waitVisibiiltyAndFindElement(this.charge_amount_xpath_element );
		System.out.println("========= chargeamountElement");
		
		//Select chargepaymentmethodElement = new Select(waitVisibiiltyAndFindElement(this.charge_payment_xpath_element ));
		WebElement chargebuttonElement = waitVisibiiltyAndFindElement(this.charge_button_xpath_element );
		System.out.println("========= chargebuttonElement");
		
        WebElement token_element_e = waitVisibiiltyAndFindElement(this.token_element );
		System.out.println("========= token_element_e");
		
		chargeamountElement.sendKeys(amount);
		System.out.println("========= chargeamountElement.sendKeys");
		WebElement attachment_xpath_element_1 = waitVisibiiltyAndFindElement(this.attachment_xpath_element );
        //chargepaymentmethodElement.selectByVisibleText(paymentmethod);
        token_element_e.sendKeys(paymentmethod);
		System.out.println("========= token_element_e.sendKeys");
		attachment_xpath_element_1.sendKeys(file_path);
        chargebuttonElement.click();
		System.out.println("========= chargebuttonElement.click");
		
	}
}