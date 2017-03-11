/**
 * Created by Iryna Lasotskaya on 08.03.2017.
 */
import org.apache.http.impl.BHttpConnectionBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AppTest {
    private static final String FIRSTACCOUNT="webdriverlasotskaya@gmail.com";
    private static final String SECONDACCOUNT="webdriverlasotski@gmail.com";
    private static final String PASSWORD="WebDriver1";
    private static final String SUBJECT="Hi";
    WebDriver driver = new ChromeDriver();


    @Test
    public void signInFirstUser(){
        System.setProperty("webdriver.gecko.driver", new File("C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe").getAbsolutePath());
        AppSignIn appSignIn= new AppSignIn(driver);
        appSignIn.openBrowser();
        appSignIn.signIn(FIRSTACCOUNT,PASSWORD);
    }

    @Test
    public  void signInSecondUser(){
        System.setProperty("webdriver.gecko.driver", new File("C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe").getAbsolutePath());
        AppSignIn appSignIn= new AppSignIn(driver);
        appSignIn.openBrowser();
        appSignIn.signIn(SECONDACCOUNT,PASSWORD);}

    @Test
    public void makeLetterSpam(){
        signInSecondUser();
        WebElement findCheckbox=driver.findElement(By.xpath("//div[@class='T-Jo-auh']"));
        findCheckbox.click();
        WebElement checkAsSpam = driver.findElement(By.xpath("//div[@class='asl T-I-J3 J-J5-Ji']"));
        checkAsSpam.click();
    }

    @Test
    public void verifyThatLetterInSpam(){
        signInSecondUser();
       WebElement linkFindMoreOptions = driver.findElement(By.xpath("//span[text()='Больше ярлыков']"));
       linkFindMoreOptions.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement buttonSpam = driver.findElement(By.partialLinkText("Спам"));
        buttonSpam.click();
        WebElement findLetter = driver.findElement(By.name("Ira Ira"));
    }
    @Test//этот метод почему-то не работает,поэтому смотри точно такой же ниже signInFirstUserAndWriteLetter
    public void writeNewLetter(){
        signInFirstUser();
        WriteLetter writeLetter=new WriteLetter();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        writeLetter.writeAndSend(SECONDACCOUNT,SUBJECT,SUBJECT);
    }
     @Test
    public void signInFirstUserAndWriteLetter() {
        signInFirstUser();
        WebElement writeLetter= driver.findElement(By.xpath("//div[text()='НАПИСАТЬ']"));
        writeLetter.click();
        WebElement fieldWriteAddress= driver.findElement(By.name("to"));
        fieldWriteAddress.sendKeys(SECONDACCOUNT);
        WebElement fieldSubject= driver.findElement(By.name("subjectbox"));
        fieldSubject.sendKeys(SUBJECT);
        WebElement fieldBodyLetter= driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        fieldBodyLetter.sendKeys(SUBJECT);
        WebElement buttonSend= driver.findElement(By.xpath("//div[text()='Отправить']"));
        buttonSend.click();
    }}