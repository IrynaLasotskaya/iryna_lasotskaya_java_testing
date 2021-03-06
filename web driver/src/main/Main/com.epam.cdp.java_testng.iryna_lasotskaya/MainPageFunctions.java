
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 20.03.2017.
 */
public class MainPageFunctions {
    private static final String FIRSTACCOUNT="webdriverlasotskaya@gmail.com";
    private static final String SECONDACCOUNT="webdriverlasotski@gmail.com";
    private static final String PASSWORD="WebDriver1";
    private static final String SUBJECT="Hi";
    private WebDriver driver;
    public MainPageFunctions(WebDriver driver){this.driver=driver; }
    public  void signInSecondUser(){
        LoginPage appSignIn= new LoginPage(driver);
        appSignIn.signIn(SECONDACCOUNT,PASSWORD);
        appSignIn.signInWithSavingCookie();
    }


    public void newLetter (){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MainPage writeLetter=new MainPage(driver);
        writeLetter.sendLetter(SECONDACCOUNT,SUBJECT,"HI");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
    public void makeLetterSpam(){
        signInSecondUser();
        MainPage mainPage=new MainPage(driver);
        mainPage.makeLetterSpam();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    public void verifyThatLetterInSpam(){
        signInSecondUser();
        MainPage mainPage=new MainPage(driver);
        mainPage.verifyThatLetterInSpam();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void signInFirstUser(){
        LoginPage appSignIn= new LoginPage(driver);
        appSignIn.openBrowser();
        appSignIn.postButton();
        appSignIn.signIn(FIRSTACCOUNT,PASSWORD);
        appSignIn.signInWithoutSavingCookie();
    }
}
