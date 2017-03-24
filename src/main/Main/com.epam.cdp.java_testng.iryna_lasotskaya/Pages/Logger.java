package Pages;

/**
 * Created by Admin on 24.03.2017.
 */
public class Logger {
    private static Logger uniqueInstance;
    private Logger(){}

    public static Logger getInstance(){
        if(uniqueInstance==null){
            uniqueInstance=new Logger();
        }
        return uniqueInstance;
    }
    public void info(String message) {
        System.out.println(message);
    }
}
