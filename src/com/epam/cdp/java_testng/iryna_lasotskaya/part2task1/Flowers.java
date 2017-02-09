package com.epam.cdp.java_testng.iryna_lasotskaya.part2task1;

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
        Iris(int price, String name, int quantity) {
            this.price=price;
            this.name=name;
            this.quantity=quantity;
            summ+=number;
            number=price*quantity;
        }

    }

    public static class Rose extends Flowers {
        Rose(int price, String name, int quantity) {
            this.price=price;
            this.name=name;
            this.quantity=quantity;
            summ+=number;
            number=price*quantity;
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
}



