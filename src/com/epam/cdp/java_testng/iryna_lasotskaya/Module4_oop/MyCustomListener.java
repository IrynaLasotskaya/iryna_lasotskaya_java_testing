package com.epam.cdp.java_testng.iryna_lasotskaya.Module4_oop;

import org.testng.ISuite;
import org.testng.ISuiteListener;

/**
 * Created by Iryna_Lasotskaya on 23.02.2017.
 */
public class MyCustomListener implements ISuiteListener {
    @Override
    public void onStart(ISuite iSuite) {
        System.out.println("Suite started: " + iSuite.getName());
    }

    @Override
    public void onFinish(ISuite iSuite) {
    }
}
