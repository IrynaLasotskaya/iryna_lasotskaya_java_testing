package com.company.Testng2;
import com.epam.tat.module4.Calculator;
import org.testng.TestNG;
import junit.framework.TestCase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Admin on 21.02.2017.
 */

public class ConfigurationTest {

protected Calculator calc;

@BeforeClass(groups={"config"})
public void BeforeClass(){System.out.print("Before class is run");
    calc = new Calculator();
}

@AfterClass(groups={"config"})
    public void afterClass(){
                System.out.print("After class is run");
}

    /**
     * Created by Admin on 21.02.2017.
     */

}
