import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.*;
import java.util.*;

public class Email extends basePage{
    private String url = "https://temp-mail.org/en/";
    String login_button = "/html/body/header/div/div/div/a[2]/font/font";
    String username_xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input";
    String password_xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input";
    String follow_button_xpath ="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span";
    
    String button_xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[3]";
    String home_page_test = "/html/body/app-root/app-dashboard/main/div/div[2]/div/section/article/div[1]/button/h1";
	String subject = "Confirm Registeration on Cooodes";
    public Email(WebDriver driver){
        super(driver);
        this.driver.get(this.url);
    }
  
    void click_log_in(){

        By login_button_element = By.xpath(login_button);
       WebElement usernameElement = waitVisibiiltyAndFindElement(login_button_element );
		
       //this.waitVisibiiltyAndFindElement(home_page_test_element);
		
    }
    void open_confirmation_email(){
        List<WebElement> email = this.driver.findElements(By.cssSelector("div.xT>div.y6>span>b"));

    for(WebElement emailsub : email){
        if(emailsub.getText().equals(subject) == true){

            emailsub.click();
            break;
            }

    }
    WebElement link = this.driver.findElement(By.linkText("https://www.cooodes.com"));
    link.click();
}
void login(String username,String password){
    //this.click_log_in();
    By username_xpath_element = By.xpath(username_xpath);
    By password_xpath_element = By.xpath(password_xpath);
    By button_xpath_element = By.xpath(button_xpath);
    By home_page_test_element = By.xpath(home_page_test);
    By follow_button_xpath_elemetn = By.xpath(follow_button_xpath);

    WebElement usernameElement = waitVisibiiltyAndFindElement(username_xpath_element);
    
    usernameElement.sendKeys(username);
    WebElement follow_button_elemetn =  waitVisibiiltyAndFindElement(follow_button_xpath_elemetn);
    follow_button_elemetn.click();
    
    WebElement passowrdElement = waitVisibiiltyAndFindElement(password_xpath_element);
    WebElement buttonElement = waitVisibiiltyAndFindElement(button_xpath_element);
    passowrdElement.sendKeys(password);
    
    buttonElement.click();

    
}

}