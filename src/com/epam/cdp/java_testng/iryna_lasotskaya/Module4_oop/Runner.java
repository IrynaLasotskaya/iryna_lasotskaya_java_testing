package com.epam.cdp.java_testng.iryna_lasotskaya.Module4_oop;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;

/**
 * Created by Iryna_Lasotskaya on 23.02.2017.
 */
public class Runner {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        testNG.addListener(new TestListenerAdapter());
        testNG.addListener(new MyCustomListener());
        XmlSuite xmlSuite = new XmlSuite();
        xmlSuite.setName("Calculator");
        xmlSuite.setSuiteFiles(new ArrayList<String>() {{
            add("src/Calculator.xml");
        }});
        testNG.setXmlSuites(new ArrayList<XmlSuite>() {{
            add(xmlSuite);
        }});
        testNG.run();







    }
}
