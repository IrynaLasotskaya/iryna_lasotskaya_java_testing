package com.epam.cdp.java_testng.iryna_lasotskaya.Module4_oop;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by Iryna_Lasotskaya on 21.02.2017.
 */

public class ConfigurationTest {

    protected Calculator calc;

    @BeforeClass
    public void BeforeClass() {
        System.out.print("Before class is run");
        calc = new Calculator();
    }

    @AfterClass
    public void afterClass() {
        System.out.print("After class is run");
    }

    /**
     * Created by Iryna_Lasotskaya on 21.02.2017.
     */

}
