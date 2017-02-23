package com.company.Testng2;

import org.testng.ISuite;
import org.testng.ISuiteListener;

/**
 * Created by Admin on 23.02.2017.
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
