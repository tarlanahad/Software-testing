import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.*;
import java.util.*;
public class Code extends basePage{
    private String url = "https://cooodes.com/codes";
	private String add_bulk_codes_button_xpath = "/html/body/app-root/app-code/main/div/div/div/div/div/div[1]/div[2]/a";
    private String choose_file_xpath = "/html/body/app-root/app-add-code-bulk/main/div/div/div/div/div/div[2]/div[2]/div/div/input";
    private String upload_excel_xpath = "/html/body/app-root/app-add-code-bulk/main/div/div/div/div/div/div[1]/div[2]/button[2]";
    public Code(WebDriver driver){
        super(driver);
		this.driver.get(this.url);
    }
    void click_add_bulk_code(){
        By add_bulk_codes_button_xpath_element = By.xpath(add_bulk_codes_button_xpath);

		
		
		WebElement usernameElement = waitVisibiiltyAndFindElement(add_bulk_codes_button_xpath_element);
        usernameElement.click();
		
    }
    void upload_file(String file_path){

        file_path = "C:/Users/johns/OneDrive/Desktop/empty.xlsx";
        By choose_file_xpath_element = By.xpath(choose_file_xpath);
		WebElement upload_file_element = waitVisibiiltyAndFindElement(choose_file_xpath_element);
        upload_file_element.sendKeys(file_path);
        By upload_excel_xpath_element = By.xpath(upload_excel_xpath);
        WebElement upload_excel_xpath_element_element = waitVisibiiltyAndFindElement(upload_excel_xpath_element);
        upload_excel_xpath_element_element.click();
        
    }
   
}