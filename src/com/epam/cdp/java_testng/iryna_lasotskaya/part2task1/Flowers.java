package com.epam.cdp.java_testng.iryna_lasotskaya.part2task1;

import javax.swing.text.View;
import java.io.*;
import java.rmi.RemoteException;
/**
 * Created by Iryna_Lasotskaya on 08.02.2017.
 */
public class Flowers implements IFlowers {
    protected int price;
    String name;
    protected  int quantity;
    private static int summ;
    private static int number;

    //public int getPrice() {
    // return price;
    //}
    public static String getName() {
        return getName();
    }
    public static int getSumm() {
        return summ;
    }

    public static int getNumber() {
        return number;
    }

    public static class Iris extends Flowers {
        Iris(int price, String name, int quantity) throws RuntimeException, OutOfMemoryError {
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

    public static class Rose extends Flowers {
        Rose(int price, String name, int quantity) throws NullPointerException {
            try {
                this.price = price;
                this.name = name;
                this.quantity = quantity;
                summ += number;
                number = price * quantity;
            } catch (NullPointerException c) {
                //throw new NullPointerException();
            }
        }
    }

    public static class Mimosa extends Flowers {
        Mimosa(int price, String name, int quantity) {
            this.price=price;
            this.name=name;
            this.quantity=quantity;
            summ+=number;
            number=price*quantity;
        }
    }
    public static class Lavender extends Flowers {
        Lavender(int price, String name, int quantity) {
            this.price=price;
            this.name=name;
            this.quantity=quantity;
            summ+=number;
            number=price*quantity;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static class Kaktus {
        Flowers kaktus;

        public void onClick(View view) {
            if (kaktus == null) {
                try {
                    throw new NullPointerException("Кактус не инициализирован");
                } catch (NullPointerException e) {
                    System.out.println("catch '" + e + "'");
                } finally {
                    System.out.println("finally kaktus is not found");

                }
            }
        }
    }
}



