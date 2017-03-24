package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Iryna_Lasotskaya on 10.03.2017.
 */
public class LoginPage extends BasePage {
    private static LoginPage uniqueInstance;
    public final static String BASEURL="http://www.google.com/";
    private final By inputLoginLocator=By.name("Email");
    private final By inputPasswordLocator=By.id("Passwd");
    private final By inputSubmitLocator=By.id("signIn");
    private final By inputSubmitPost=By.className("gb_P");
    private final By inputSubmitNext=By.id("next");
    private final By inputSubmitLeaveInSystem=By.name("PersistentCookie");
    private WebDriver driver;
    static String username;
    static String password;
    public LoginPage(WebDriver driver){
        this.driver=driver; }

   // private LoginPage() {
    //}

    public void openBrowser(){
driver.get(BASEURL);
    }

    public void postButton(){
        driver.findElement(inputSubmitPost).click();
    }

    private LoginPage(String username, String password){
        driver.findElement(inputLoginLocator).sendKeys(username);
        driver.findElement(inputSubmitNext).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(inputPasswordLocator).sendKeys(password);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public static LoginPage getInstance(String username, String password){
        if(uniqueInstance==null){
            uniqueInstance=new LoginPage(LoginPage.username, LoginPage.password);
        }
        return uniqueInstance;
    }

    public void signInWithoutSavingCookie(){
        driver.findElement(inputSubmitLeaveInSystem).click();
        driver.findElement(inputSubmitLocator).click();
    }
    public void signInWithSavingCookie(){
        driver.findElement(inputSubmitLocator).click();
    }
}
