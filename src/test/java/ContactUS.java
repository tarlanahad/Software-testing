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
    private String url = "https://cooodes.com/contact-us";
	
    public ContactUS(WebDriver driver){
        super(driver);
		this.driver.get(this.url);
    }
   
}