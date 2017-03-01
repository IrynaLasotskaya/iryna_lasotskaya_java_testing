package com.epam.cdp.java_testng.iryna_lasotskaya.Module2_oop;

import com.epam.cdp.java_testng.iryna_lasotskaya.Flowers;

public class Iris extends Flowers {
    public Iris(int price, String name, int quantity, String color, String country) throws RuntimeException, OutOfMemoryError {
        super(price, quantity, name, color, country);
        try {
            this.price = price;
            this.name = name;
            this.quantity = quantity;
            summ += number;
            number = price * quantity;
        } catch (RuntimeException e) {
        }
    }
}
