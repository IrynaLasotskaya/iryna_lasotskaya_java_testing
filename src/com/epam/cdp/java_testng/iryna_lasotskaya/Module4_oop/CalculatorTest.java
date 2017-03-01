package com.epam.cdp.java_testng.iryna_lasotskaya.Module4_oop;

import org.junit.Assert;
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


    private void checkTime() {
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }

    @Test
    public void testMinus() {
        final int expected = 3;
        final long actual = calc.mult(5, 2);
        Assert.assertEquals("Результат вычитания", expected, actual);
        checkTime();
    }

    @Test
    public void testDiv() {
        final int expected = 5;
        final long actual = calc.div(5, 1);
        Assert.assertEquals("Результат деления", expected, actual);
    }


    @Test
    public void testSqrt() {
        //Don't know what is expected
        final double actual = calc.sqrt(-1);
        Assert.assertEquals("Результат нахождения корня из отрицательного числа","",actual);
    }

    @Test
    public void testPositive() {
        //Don't know what is expected
        //final boolean actual=Exception;
        final boolean actual = calc.isPositive(-1);
        Assert.assertEquals("Результат определения отрицательного числа", "", "There should be mistake");
    }

    @Test
    public void findNegative() {
        //final boolean expected=Exception;
        final boolean actual = calc.isNegative(0);
        Assert.assertEquals("Результат определения позитивного числа", "", actual);
    }

    @Test
    public void testSin() {
        final double expected = 0.1;
        final double actual = calc.sin(30);
        Assert.assertEquals("Результат нахождения синуса 30 гр", expected, actual);
    }

    @Test
    public void testCtg() {
        //Don't know what is expected
        // final double expected=Exception
        final double actual = calc.ctg(180);
        Assert.assertEquals("Результат вычисления котангенса 180 гр", "", actual);
    }

    @Test
    public void testCos() {
        final double expected = -1;
        final double actual = calc.cos(180);
        Assert.assertEquals("Результат вычисления косинуса 180 гр", expected, actual);
    }

    @Test
    public void testTg() {
        //Don't know what is expected
        // final double expected=Exception
        final double actual = calc.tg(270);
        Assert.assertEquals("Результат вычисления тангенса 270 гр", "", actual);
    }

}


