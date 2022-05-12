import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.*;
import java.util.*;
public class NonvoipTest {

    private Nonvoip cooodes_driver;
    
    private WebDriver driver;
	private WebDriverWait wait;
	Config conf;
    String path;
        
    Vector<String> webistes = new Vector<String>();
  
    
    public void multiple_page_test(){
        this.webistes.forEach ((url) -> this.cooodes_driver.open(url)   );
    }
    public void home_page_test(){
        String home_page_test = "/html/body/div[1]/div/div/div/div[1]/button";
        By home_page_test_by = By.xpath(home_page_test);
        WebElement home_page_res = cooodes_driver.waitVisibiiltyAndFindElement(home_page_test_by);
		// Home Page Test
        Assert.assertTrue(home_page_res.getText().contains("REGISTER NOW"));
        
    }
    public void login_test(){
        String home_page_test = "/html/body/div[1]/div/div/div/div/div[2]/table/thead/tr/th[2]";
        By home_page_test_by = By.xpath(home_page_test);
        WebElement home_page_res = cooodes_driver.waitVisibiiltyAndFindElement(home_page_test_by);
		// Login Test
        Assert.assertTrue(home_page_res.getText().contains("NAME"));
    }
    public void logout_test(){
        
         
         String home_page_test = "/html/body/app-root/app-login/div/div/div/div/div/div/form/div[3]/div[2]/button";
        By home_page_test_by = By.xpath(home_page_test);
        WebElement home_page_res = cooodes_driver.waitVisibiiltyAndFindElement(home_page_test_by);
		// Login Test
        Assert.assertTrue(home_page_res.getText().contains("Sign In"));
    }

    public void page_title_test(String title){
        String returned_title = cooodes_driver.return_title();
        
        Assert.assertTrue(returned_title.equals(title));
        
    }

    @Before
    public void setup() {
       
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
        cooodes_driver = new Nonvoip(driver);
        path= "config";
        conf = new Config(path);
        System.out.print(conf.email);
        
    }


 

    @Test
    public void multiplicationTest() {

                this.home_page_test();
                this.page_title_test("Home | non-VoIP");
                Login login = cooodes_driver.load_login_page();
                String username =conf.email;// conf.email;
                String password = conf.password;//conf.password;
                
                Dashboard dashboard = login.login(username,password);
                
                this.login_test();
                
                ChargeWallet chargewallet= dashboard.open_charge_wallet_page();
                String amount = "200";
                String paymentmethod = "Cash";
                chargewallet.charge_wallet_request(amount,paymentmethod,"C:/Users/johns/OneDrive/Desktop/278587312_1983522358514879_753695079200638153_n.jpg");
                //System.out.println("----------------- charge_wallet_request Done ----------------");
                
                chargewallet.Logout();
                home_page_test();
                login = cooodes_driver.load_login_page();
                
                cooodes_driver = login.login(username,password);
                
                ContactUS contactus = dashboard.contact_us_page();

                contactus.sendfeedback(username,"Subject","Boday");
                //Signup signup_objected = cooodes_driver.load_register_page();
                //String email="fifeyiy374@topyte.com";
                //String username = "username";
                //String password = "ihave2prothers";
                //String full_name = "asdasd";
                
                //Email email_obj = signup_objected.singup(full_name,email,username,password);
                //email_obj.login(email,password);
                //email_obj.open_confirmation_email();
               
                
                login = cooodes_driver.load_login_page();
                Signup login1 = cooodes_driver.load_register_page();
                login1.go_back();
            
                this.webistes.add("https://non-voip.com/rentals");
                this.webistes.add("https://non-voip.com/product");
                this.webistes.add("https://non-voip.com/payment/top-up");
                
                this.multiple_page_test();
                
    }
    
    @After
    public void close() {
        if (!cooodes_driver.isNull()) {
            cooodes_driver.quit();
        }
    }
}
