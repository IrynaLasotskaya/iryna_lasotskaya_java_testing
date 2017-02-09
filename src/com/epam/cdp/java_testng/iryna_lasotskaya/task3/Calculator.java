package com.epam.cdp.java_testng.iryna_lasotskaya.task3;

/**
 * Created by Iryna_Lasotskaya on 01.02.2017.
 */

public class Calculator {


    public Calculator() {

    }

    public int sum(int a, int b) {
        return a+b;
    }


    public float del (int c, int d) {
        float a = (float) c;
        float b = (float) d;
        return a / b;
    }
    public int mult(int a, int b){
        return a*b;
    }

    public int sub(int a, int b){
        return a-b;
    }
}
