import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.*;
import java.util.*;
public class Nonvoip extends basePage{
	private String url = "https://non-voip.com";
	
	
	public Nonvoip(WebDriver driver){
		super(driver);
		this.driver.get(this.url);
	}
	public Nonvoip(WebDriver driver,Boolean isLogedIn){
		super(driver,isLogedIn);
		this.driver.get(this.url);
	}
	
	void open(String url){
		 this.driver.get(url);
	}
	void open_home_page(){
		this.driver.get(this.url);
   }
   
   Login load_login_page(){
		 return new Login(this.driver);
	}
	Signup load_register_page(){
		return new Signup(this.driver);
	}
	
	ContactUS load_contact_us_page(){
		return new ContactUS(this.driver);
		
	}
	
	
	
}