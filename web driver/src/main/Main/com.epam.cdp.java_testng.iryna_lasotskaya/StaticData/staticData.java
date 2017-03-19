package StaticData;

import org.openqa.selenium.By;

/**
 * Created by Admin on 20.03.2017.
 */
public class staticData {
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
}
