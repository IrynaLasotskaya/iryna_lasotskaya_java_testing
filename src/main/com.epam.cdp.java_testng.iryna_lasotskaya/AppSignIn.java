import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Iryna_Lasotskaya on 10.03.2017.
 */
public class AppSignIn {
    public final static String BASEURL="http://www.google.com/";
    private final By inputLoginLocator=By.name("Email");
    private final By inputPasswordLocator=By.id("Passwd");
    private final By inputSubmitLocator=By.id("signIn");
    private final By inputSubmitPost=By.className("gb_P");
    private final By inputSubmitNext=By.id("next");
    private static final String FIRSTACCOUNT="webdriverlasotskaya@gmail.com";
    private static final String SECONDACCOUNT="webdriverlasotski@gmail.com";
    private static final String PASSWORD="WebDriver1";
    private WebDriver driver;
    public AppSignIn(WebDriver driver){this.driver=driver; }
    public void openBrowser(){
driver.get(BASEURL);
    }

    public void signIn(String username, String password){
        driver.findElement(inputSubmitPost).click();
        driver.findElement(inputLoginLocator).sendKeys(username);
        driver.findElement(inputSubmitNext).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(inputPasswordLocator).sendKeys(password);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(inputSubmitLocator).click();
    }
}
