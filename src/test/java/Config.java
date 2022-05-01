import java.util.*;  
import java.io.*;  
public class Config {
        
        String file_path;
        String email;
        String password ;
        String username;
        String full_name;
        
    public Config(String path){
        Properties prop = new Properties();
        String fileName = path;
        try (FileInputStream fis = new FileInputStream(fileName)) {
            prop.load(fis);
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
        String email = prop.getProperty("email");
        String password = prop.getProperty("password");
        String username = prop.getProperty("username");
        String full_name = prop.getProperty("full_name");
        this.email = email;
        this.password = password;
        this.username = username;
        this.full_name = full_name;
           
    }
}
    