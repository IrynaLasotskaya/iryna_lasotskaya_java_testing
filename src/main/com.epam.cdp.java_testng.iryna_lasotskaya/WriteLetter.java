import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Iryna_Lasotskaya on 11.03.2017.
 */
public class WriteLetter {
    private final By inputSubmitWriteEmailLocator=By.xpath("//div[text()='НАПИСАТЬ']");
    private final By inputWriteAddressLocator=By.name("to");
    private final By inputWriteTitleLocator=By.name("subjectbox");
    private final By inputWriteBodyLocator=By.xpath("//div[@class='Am Al editable LW-avf']");
    private final By inputSubmitSend=By.xpath("//div[text()='Отправить']");
    private WebDriver driver;
    public void writeAndSend (String username, String subject, String body){
        driver.findElement(inputSubmitWriteEmailLocator).click();
        driver.findElement(inputWriteAddressLocator).sendKeys(username);
        driver.findElement(inputWriteTitleLocator).sendKeys(subject);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(inputWriteBodyLocator).sendKeys(body);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(inputSubmitSend).click();
    }
}
