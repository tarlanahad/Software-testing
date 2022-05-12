import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.*;
import java.util.*;
public class ContactUS extends basePage{
    private String url = "https://non-voip.com/support";
	String email_xpath = "/html/body/div[1]/div/div/div/div/form/div/div[1]/input";
    String subject_xpath = "/html/body/div[1]/div/div/div/div/form/div/div[1]/input";
    
    String body_xpath = "/html/body/div[1]/div/div/div/div/form/div/div[2]/textarea";
    String home_page_test = "/html/body/div[1]/div/div/div/div/form/h2";
    
	String button_elemet = "/html/body/div[1]/div/div/div/div/form/div/div[3]/button";

    public ContactUS(WebDriver driver){
        super(driver);
		this.driver.get(this.url);
    }
    void sendfeedback(String email,String subject,String budy){
	
		By email_xpath_element = By.xpath(email_xpath);
		By subject_xpath_element = By.xpath(subject_xpath);
		By body_elemet_el = By.xpath(body_xpath);
		By home_page_test_element = By.xpath(home_page_test);
		By button_elemet_el = By.xpath(button_elemet);
		
		WebElement usernameElement = waitVisibiiltyAndFindElement(email_xpath_element);
		WebElement passowrdElement = waitVisibiiltyAndFindElement(subject_xpath_element);
        WebElement body_elemet_elment = waitVisibiiltyAndFindElement(body_elemet_el);
        
		WebElement buttonElement = waitVisibiiltyAndFindElement(button_elemet_el);
		
		usernameElement.sendKeys(email);
		passowrdElement.sendKeys(subject);
        body_elemet_elment.sendKeys(budy);
        buttonElement.click();
        this.waitVisibiiltyAndFindElement(home_page_test_element);

    }

   
}