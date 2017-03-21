package Pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Admin on 21.03.2017.
 */
public abstract class BasePage {
    private static final String FIRSTACCOUNT="webdriverlasotskaya@gmail.com";
    private static final String SECONDACCOUNT="webdriverlasotski@gmail.com";
    private static final String PASSWORD="WebDriver1";
    private static final String SUBJECT="Hi";
    private WebDriver driver;
    public BasePage(){ }
    protected void sendLetter (String username, String subject, String body){
}
    protected void verifyThatLetterInSpam(){
    }
    protected void signOut(){
    }
    protected Boolean isSpam() {return true;}
    protected void newLetter (){}
    protected void makeLetterSpam(){}
    protected void signInFirstUser(){}
    protected  void signIn(String username, String password){}
    protected  void signInWithoutSavingCookie(){}
    protected  void signInWithSavingCookie(){}
    protected  void postButton(){}
    protected  void openBrowser(){}
    public  void signInSecondUser(){}
    }
