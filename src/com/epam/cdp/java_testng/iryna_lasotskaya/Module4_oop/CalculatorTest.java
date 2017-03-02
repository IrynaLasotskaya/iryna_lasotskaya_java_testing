package com.epam.cdp.java_testng.iryna_lasotskaya.Module4_oop;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * Created by Iryna_Lasotskaya on 21.02.2017.
 */

public class CalculatorTest extends ConfigurationTest {

    @Test
    public void testSum() {
        final int expected = 12;
        final long actual = calc.sum(5, 7);
        Assert.assertEquals("Результат суммирования: ", expected, actual);
        checkTime();
    }

    @Test
    public void testSumDouble() {
        final double expected = 4.9;
        final double actual = calc.sum(3.1, 1.8);
        Assert.assertEquals("Результат суммирования: ", expected, actual);
        checkTime();
    }

    @Test
    public void testMult() {
        final int expected = 10;
        final long actual = calc.mult(5, 2);
        Assert.assertEquals("Результат вычитания", expected, actual);
        checkTime();
    }

    @Test
    public void multTest() {
        final double expected = 7.84;
        final double actual = calc.mult(2.8, 2.8);
        Assert.assertEquals("Результат вычитания", expected, actual);
        checkTime();
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testDiv() {
        final long actual = calc.div(5, 0);
    }


    @Test()
    public void testSqrt() {
        final double expected = 5;
        final double actual = calc.sqrt(25);
        Assert.assertEquals("Результат определения корня", expected, actual,1);
        double a= actual;
        System.out.println(a);
    }

    @Test()
    public void testPositive() {
        final boolean expected = false;
        final boolean actual = calc.isPositive(-1);
        Assert.assertEquals("Результат определения негативного числа", expected, actual);
    }

    @Test()
    public void findNegative() {
        final boolean expected = false;
        final boolean actual = calc.isNegative(0);
        Assert.assertEquals("Результат определения позитивного числа", expected, actual);
    }

    @Test
    public void testSin() {
        final double expected = 0.1;
        final double actual = calc.sin(30);
        Assert.assertEquals("Результат нахождения синуса 30 гр", expected, actual);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testCtg() {
        final double actual = calc.ctg(180);
    }

    @Test
    public void testCos() {
        final double expected = -1;
        final double actual = calc.cos(180);
        Assert.assertEquals("Результат вычисления косинуса 180 гр", expected, actual);
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

    private void checkTime() {
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }
}


