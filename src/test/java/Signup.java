import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.*;
import java.util.*;

public class Signup extends basePage{
    

    private String url = "https://cooodes.com/register";
    String full_name_xpath = "/html/body/app-root/app-register/div/div/div/div/div/div/form/div[1]/input";
    String email_xpath ="/html/body/app-root/app-register/div/div/div/div/div/div/form/div[2]/input";
	String username_xpath = "/html/body/app-root/app-register/div/div/div/div/div/div/form/div[3]/input";
    String password_xpath = "/html/body/app-root/app-register/div/div/div/div/div/div/form/div[4]/input";
    String button_xpath = "/html/body/app-root/app-register/div/div/div/div/div/div/form/div[5]/button";
    String home_page_test = "/html/body/app-root/app-register/div/div/div/div/div/div/div/div/div";
		
    public Signup(WebDriver driver){
        super(driver);
		this.driver.get(this.url);
    }
    Email singup(String full_name,String email,String username,String password){
		
		By full_name_xpath_element = By.xpath(full_name_xpath);
		By email_xpath_element = By.xpath(email_xpath);
		
        By username_xpath_element = By.xpath(username_xpath);
		By password_xpath_element = By.xpath(password_xpath);
		By button_xpath_element = By.xpath(button_xpath);
		By home_page_test_element = By.xpath(home_page_test);
		
		
		WebElement usernameElement = waitVisibiiltyAndFindElement(username_xpath_element );
		WebElement passowrdElement = waitVisibiiltyAndFindElement(password_xpath_element );
        WebElement fullnameelement = waitVisibiiltyAndFindElement(full_name_xpath_element );
        WebElement emailelement = waitVisibiiltyAndFindElement(email_xpath_element );
		WebElement buttonElement = waitVisibiiltyAndFindElement(button_xpath_element );
		
		fullnameelement.sendKeys(full_name);
		emailelement.sendKeys(email);
        usernameElement.sendKeys(username);
		passowrdElement.sendKeys(password);
		buttonElement.click();
        this.waitVisibiiltyAndFindElement(home_page_test_element);
		return new Email(this.driver);
	}
   
}


