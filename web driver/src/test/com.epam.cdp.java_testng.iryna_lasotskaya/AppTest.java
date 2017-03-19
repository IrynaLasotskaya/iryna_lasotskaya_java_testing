/**
 * Created by Iryna Lasotskaya on 08.03.2017.
 */

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import java.io.File;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class AppTest {
    private static final String FIRSTACCOUNT="webdriverlasotskaya@gmail.com";
    private static final String SECONDACCOUNT="webdriverlasotski@gmail.com";
    private static final String PASSWORD="WebDriver1";
    private static final String SUBJECT="Hi";
    WebDriver driver = new ChromeDriver();
    private final Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);

    @Test
    public void googleLettersTest(){
        System.setProperty("webdriver.gecko.driver", new File("C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe").getAbsolutePath());
        MainPageFunctions pageFunctions=new MainPageFunctions(driver);
        pageFunctions.signInFirstUser();
        log.println("First user is signed-in");
        pageFunctions.newLetter();
        log.println("Letter is written and sent");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='vh']"))));
        MainPage mainPage= new MainPage(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.signOut();
        pageFunctions.makeLetterSpam();
        log.println("Second user is signed-in and made letter spam");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='vh']"))));
        mainPage.signOut();
        LoginPage appSignIn= new LoginPage(driver);
        appSignIn.signIn(FIRSTACCOUNT,PASSWORD);
        appSignIn.signInWithSavingCookie();
        log.println("First user is signed-in");
        pageFunctions.newLetter();
        log.println("Letter is written and sent");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='vh']"))));
        mainPage.signOut();
        pageFunctions.verifyThatLetterInSpam();
        log.println("Second user is signed-in and verified that letter is in spam");
        Assert.assertTrue(mainPage.isSpam());
    }
}