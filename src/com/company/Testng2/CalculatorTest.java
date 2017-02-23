package com.company.Testng2;

import org.junit.Assert;
import org.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

import java.util.Date;

/**
 * Created by Iryna_Lasotskaya on 21.02.2017.
 */

public class CalculatorTest extends ConfigurationTest {
    public static void main(String[] args) {
    }


        @Parameters({"two", "three", "expectedForSum"})
        @Test(groups = {"big"})
        public void twoPlusThree ( long two, long three, long expectedForSum){
            long sum = calc.sum(two, three);
            Assert.assertEquals(sum, expectedForSum);
            checkTime();
        }

    private void checkTime() {
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }

    @Test(priority = 0, groups = {"big"})
    public void fiveMultTwo(long expectedForMult) {
        long mult = calc.mult(5, 2);
        Assert.assertEquals(mult, expectedForMult);
        checkTime();
    }

    @Test
    public void fiveDelTwo(long expectedForDiv) {
        long div = calc.div(5, 1);
        Assert.assertEquals(5, 5);
    }

    @Test
    public void tenMinusNine(long expectedForMinus) {
        long sub = calc.sub(10, 9);
        Assert.assertEquals(1, 1);
    }



    @Test(dataProvider = "dataForSum")
    public void summ() {

        long sum = calc.sum(1, 2);
        Assert.assertEquals(3, 3);
    }


    @DataProvider(name = "dataForSum")
    public Object[][] dataForSum() {
        return new Object[][]{
                {1, 2, 3},
                {0, 0, 0},
                {-1, 1, 0},
                {1, -10, -9}
        };
    }

    @Test
    public void tenDelOne(long expectedForDel) {
        long div = calc.div(10, 1);
        Assert.assertEquals(10, 10);
    }
}


