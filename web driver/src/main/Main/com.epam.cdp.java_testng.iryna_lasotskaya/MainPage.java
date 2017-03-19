import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import StaticData.staticData;
import java.util.concurrent.TimeUnit;


/**
 * Created by Iryna_Lasotskaya on 11.03.2017.
 */
public class MainPage {
    public final static String BASEURL="http://www.google.com/";
    private final By inputLoginLocator=By.name("Email");
    private final By inputPasswordLocator=By.id("Passwd");
    private final By inputSubmitLocator=By.id("signIn");
    private final By inputSubmitPost=By.className("gb_P");
    private final By inputSubmitNext=By.id("next");
    private final By inputSubmitLeaveInSystem=By.name("PersistentCookie");
    private final By inputSubmitWriteEmailLocator=By.xpath("//div[text()='НАПИСАТЬ']");
    private final By inputWriteAddressLocator=By.name("to");
    private final By inputWriteTitleLocator=By.name("subjectbox");
    private final By inputWriteBodyLocator=By.xpath("//div[@class='Am Al editable LW-avf']");
    private final By inputSubmitSend=By.xpath("//div[text()='Отправить']");
    private final  By inputAuthor=By.xpath("//div[@class='T-Jo-auh']");
    private final By inputCheckboxSpam=By.xpath("//div[@class='asl T-I-J3 J-J5-Ji']");
    private final By inputMoreButtons=By.xpath("//span[text()='Больше ярлыков']");
    private final By inputSpamButton=By.partialLinkText("Спам");
    private final By inputLetterName=By.name("Ira Ira");
    private final By inputSubmitButtonToSignOut=By.cssSelector(".gb_9a");
    private final By inputSubmitButtonSignOut=By.id("gb_71");
    private  final By verifyMailIsSend=By.xpath("//div[@class='vh']");
    private final By verifyEmailInSpam=By.xpath("//span[]");
    private static final String FIRSTACCOUNT="webdriverlasotskaya@gmail.com";
    private static final String SECONDACCOUNT="webdriverlasotski@gmail.com";
    private static final String PASSWORD="WebDriver1";
    private static final String SUBJECT="Hi";
    private WebDriver driver;
    public MainPage(WebDriver driver){this.driver=driver; }
    public void sendLetter (String username, String subject, String body){
        driver.findElement(inputSubmitWriteEmailLocator).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(inputWriteAddressLocator).sendKeys(username);
        driver.findElement(inputWriteTitleLocator).sendKeys(subject);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(inputWriteBodyLocator).sendKeys(body);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(inputSubmitSend).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(verifyMailIsSend);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
    public void makeLetterSpam(){
        driver.findElement(inputAuthor).click();
        driver.findElement(inputCheckboxSpam).click();
    }
    public void verifyThatLetterInSpam(){
        driver.findElement(inputMoreButtons).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(inputSpamButton).click();
        driver.findElement(inputLetterName);
    }
    public void signOut(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(inputSubmitButtonToSignOut).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(inputSubmitButtonSignOut).click();

    }
    public Boolean isSpam() {
        return true;
    }

}
