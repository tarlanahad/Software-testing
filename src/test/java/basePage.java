import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.*;
import java.util.*;

import javax.xml.xpath.XPath;

public class basePage{
    protected WebDriver driver;
	protected WebDriverWait wait;
	protected Boolean isLogedIn;
    protected By logout_xpath_by ;
    protected String logout_xpath;
    protected String side_par;
    protected By locator;
    protected By side_ele;
    protected By token_element;
    public basePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        this.isLogedIn = false;
        
         this.locator = By.xpath("/html/body");
         
    }
    public basePage(WebDriver driver, Boolean isLogedIn){
        this.driver = driver;
        this.driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
        this.isLogedIn = isLogedIn; 
    }
    void go_back(){
        this.driver.navigate().back();
        
    }
    void go_forword(){
        this.driver.navigate().forward();
    }
    public Nonvoip Logout(){
        WebElement side_out_res = this.waitVisibiiltyAndFindElement(this.side_ele);
        side_out_res.click();
        WebElement log_out_res = this.waitVisibiiltyAndFindElement(this.logout_xpath_by);
        log_out_res.click();
		WebElement log_out_re1s = this.waitVisibiiltyAndFindElement( By.xpath("/html/body/div[1]/div/div/div/div[1]/button"));
        
        return new Nonvoip(this.driver);
	}
    Boolean isNull(){
		return this.driver == null;
	}
	void quit(){
		this.driver.quit();
	}
    String return_title(){
        return this.driver.getTitle();
    }
    public WebElement waitVisibiiltyAndFindElement(By locator) {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return this.driver.findElement(locator);
    }
    public WebElement waitVisibiiltyAndFindElement() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.locator));
        return this.driver.findElement(this.locator);
    }
}