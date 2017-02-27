package com.epam.cdp.java_testng.iryna_lasotskaya;

import java.util.Scanner;

/**
 * Created by Iryna_Lasotskaya on 08.02.2017.
 */
public class Flowers implements IFlowers {
    protected int price;
    protected String name;
    protected  int quantity;
    protected static int summ;
    protected static int number;
    private int order;
    protected String color;
    protected String country;



    public static int getSumm() {
        return 0;
    }

    public String getColor() {
        return this.color;
    }

    public String getCountry() {
        return this.country;
    }


    enum Currency {

        BYN,
        USD,
        RUR
    }




static class ConsoleView {

    private static final String PROGRAM_NAME = "==== Заказ цветов в интернет магазине ====";

    final Scanner scanner = new Scanner(System.in);

    public ConsoleView() {
        printMessage(PROGRAM_NAME);
    }

    public int getRequest(final String msg) {
        printMessage("\n" + msg);
        return scanner.nextInt();
    }
    public int getColor(final String msg){
        printMessage("\n" + msg);
        return scanner.nextInt();
    }
    public int getCountry(final String msg){
        printMessage("\n" + msg);
        return scanner.nextInt();
    }

    public void printMessage(final String msg) {
        System.out.println(msg);
    }

    public boolean repeatOrder() {
        return scanner.next().equals("да");
    }
}

    public int getOrder(){return order;}

    public Flowers(final int quantity, final int price, final String name, String color, String country) {
        this.number = number;
        this.price = price;
        this.name = name;
        this.color= color;
        this.quantity=quantity;
        this.country=country;
    }

    public int getNumber() {
        return this.number;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public void setNumber(final int number) {
        this.number = number;
    }



    @Override
    public String toString() {
        return String.format("В наличие есть %s '%s' штук по цене '%s' ", this.name, this.number, this.price, Currency.BYN);
    }



}


class OrderFlowersException extends Exception {
            OrderFlowersException(String message) {
                super(message);
            }
        }





