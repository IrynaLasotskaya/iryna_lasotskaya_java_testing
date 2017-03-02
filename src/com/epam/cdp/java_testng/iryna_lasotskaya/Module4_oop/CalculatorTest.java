package com.epam.cdp.java_testng.iryna_lasotskaya.Module4_oop;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Iryna_Lasotskaya on 21.02.2017.
 */

public class CalculatorTest extends ConfigurationTest {

    @Test(groups = {"big"})
    public void testSum() {
        final int expected = 12;
        final long actual = calc.sum(5, 7);
        Assert.assertEquals(expected, actual, "Результат суммирования:");
    }

    @Test(groups = {"big"})
    public void testSumDouble() {
        final double expected = 4.9;
        final double actual = calc.sum(3.1, 1.8);
        Assert.assertEquals(expected, actual, 1, "Результат суммирования десятичных");
    }

    @Test(groups = {"big"})
    public void testMult() {
        final int expected = 10;
        final long actual = calc.mult(5, 2);
        Assert.assertEquals(expected, actual, "Результат умножения");
    }

    @Test(groups = {"big"})
    public void multTest() {
        final double expected = 7.84;
        final double actual = calc.mult(2.8, 2.8);
        Assert.assertEquals(expected, actual, 1, "Результат умножения десятичных");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testDiv() {
        final long actual = calc.div(5, 0);
    }


    @Test(groups = {"big"})
    public void testSqrt() {
        final double expected = 5;
        final double actual = calc.sqrt(25);
        Assert.assertEquals(expected, actual, 1, "Результат нахождения корня");
    }

    @Test(groups = {"big"})
    public void testPositive() {
        final boolean expected = false;
        final boolean actual = calc.isPositive(-1);
        Assert.assertTrue(expected, "Нахождение позитивного числа");
    }

    @Test(groups = {"big"})
    public void testNegative() {
        final boolean expected = false;
        final boolean actual = calc.isNegative(0);
        Assert.assertTrue(expected, "Нахождение негативного числа");
    }

    @Test(groups = {"big"})
    public void testSin() {
        final double expected = 0.1;
        final double actual = calc.sin(30);
        Assert.assertEquals(expected, actual, 1, "Результат нахождения синуса");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testCtg() {
        final double actual = calc.ctg(180);
    }

    @Test(groups = {"big"})
    public void testCos() {
        final double expected = -1;
        final double actual = calc.cos(180);
        Assert.assertEquals(expected, actual, 1, "Результат нахождения косинуса");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testTg() {
        final double actual = calc.tg(270);
    }

    @Test(dataProvider = "dataForSum")
    public void summ(long num1, long num2, long num3) {
        long sum = calc.sum(num1, num2);
        Assert.assertEquals(num1, num2, num3);
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
}


