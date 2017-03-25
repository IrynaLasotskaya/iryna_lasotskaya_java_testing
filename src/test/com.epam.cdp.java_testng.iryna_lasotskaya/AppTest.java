/**
 * Created by Iryna Lasotskaya on 08.03.2017.
 */

import Pages.LoginPage;
import Pages.MainPage;
import Pages.MainPageFunctions;
import Pages.TestProperties;
import Pages.Logger;
import model.Mail;
import model.MailBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.io.File;

public class AppTest {
    private static final String FIRSTACCOUNT = "webdriverlasotskaya@gmail.com";
    private static final String SECONDACCOUNT = "webdriverlasotski@gmail.com";
    private static final String PASSWORD = "WebDriver1";
    private static final String SUBJECT = "Hi";
    private WebDriver webdriver;
    private Logger log;
    WebDriver driver =  getDriver("chrome");
    private final Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
    private Mail mail;

    @Before
    public void setup() {
        mail = new MailBuilder().username("webdriverlasotski@gmail.com").subject("Hi").body("Hi").build();
        this.log = Logger.getInstance();
    }
    @Test
    public void googleLettersTest() {
        MainPageFunctions pageFunctions = new MainPageFunctions(driver);
        pageFunctions.signInFirstUser();
        log.info("First user is signed-in");
        MainPage mainPage = new MainPage(driver);
        mainPage.sendLetter(mail);
       log.info ("Letter is written and sent");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='vh']"))));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.signOut();
        pageFunctions.makeLetterSpam();
        log.info("Second user is signed-in and made letter spam");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='vh']"))));
        mainPage.signOut();
        LoginPage appSignIn = new LoginPage(driver);
        appSignIn.signIn(FIRSTACCOUNT, PASSWORD);
        appSignIn.signInWithSavingCookie();
        log.info("First user is signed-in");
        mainPage.sendLetter(mail);
        log.info("Letter is written and sent");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='vh']"))));
        mainPage.signOut();
        pageFunctions.verifyThatLetterInSpam();
        log.info("Second user is signed-in and verified that letter is in spam");
        Assert.assertTrue(mainPage.isSpam());
    }

    public WebDriver getDriver(final String browserName) {
        if (browserName.equals("ie")) {
            return new InternetExplorerDriver();
        } else if (browserName.equals("chrome")) {
            System.setProperty("webdriver.gecko.driver", new File("C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe").getAbsolutePath());
            return new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            return new FirefoxDriver();

    }
        return null;
    }
}