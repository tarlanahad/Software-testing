import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.*;
import java.util.*;
public class Login extends basePage{
    private String url = "https://non-voip.com/auth/login";
	String username_xpath = "/html/body/div[1]/div/div/div/div/form/div[2]/div[1]/input";
    String password_xpath = "/html/body/div[1]/div/div/div/div/form/div[2]/div[2]/div/input";
    String button_xpath = "/html/body/div[1]/div/div/div/div/form/div[2]/div[3]/button";
    String home_page_test = "/html/body/div[1]/div/div/div/div/input";
		
    public Login(WebDriver driver){
        super(driver);
		this.driver.get(this.url);
    }
    Dashboard login(String username,String password){
		
		
		By username_xpath_element = By.xpath(username_xpath);
		By password_xpath_element = By.xpath(password_xpath);
		By button_xpath_element = By.xpath(button_xpath);
		By home_page_test_element = By.xpath(home_page_test);
		
		
		WebElement usernameElement = waitVisibiiltyAndFindElement(username_xpath_element );
		WebElement passowrdElement = waitVisibiiltyAndFindElement(password_xpath_element );
		WebElement buttonElement = waitVisibiiltyAndFindElement(button_xpath_element );
		
		usernameElement.sendKeys(username);
		passowrdElement.sendKeys(password);
		buttonElement.click();
        this.waitVisibiiltyAndFindElement(home_page_test_element);
		return new Dashboard(this.driver);
	}
   
}