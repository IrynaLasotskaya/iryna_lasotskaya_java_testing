package com.epam.cdp.java_testng.iryna_lasotskaya;

import com.epam.cdp.java_testng.iryna_lasotskaya.Module2_oop.*;


/**
 * Created by Iryna_Lasotskaya on 08.02.2017.
 */
public class Runner {
    public static void main(String[] args) {
        // ListFlowers listFlowers=new ListFlowers();
        int summ = 0;
        final Flowers.ConsoleView consoleView = new Flowers.ConsoleView();
        Rose rose = new Rose(6, "Rose", 8, "red", "Holland");
        Iris iris = new Iris(4, "Iris", 8, "DarkBlue", "Holland");
        Lavender lavender = new Lavender(2, "Lavender", 3, "Blue", "Holland");
        Kaktus kaktus = new Kaktus();
        Tulpin tulpin = new Tulpin(2, 3, "Tulpin", "red", "Holland");
        IOrder order = new Order(tulpin);
        //System.out.println("Your bouquet costs " + Flowers.getSumm() + " rub");


        try {
            final int color = consoleView.getColor("Выберите цвет тюльпанов, если красные нажмите 1: ");
            order.makeOrderChooseColor(color);
        } catch (final OrderFlowersException ex) {
            ex.printStackTrace();
        }
        consoleView.printMessage("Продолжим оформление заказа");

        try {
            final int country = consoleView.getCountry("Выберите страну производителя, если Голландия нажмите 2: ");
            order.chooseCountryManufacturer(country);
        } catch (final OrderFlowersException ex) {
            ex.printStackTrace();
        }
        consoleView.printMessage("Продолжим оформление заказа");

        do {
            consoleView.printMessage(tulpin.toString());

            try {
                final int number = consoleView.getRequest("Введите количество цветов в заказе: ");
                order.makeOrder(number);
            } catch (final OrderFlowersException ex) {
                ex.printStackTrace();

            }

            consoleView.printMessage("Продолжим оформлени заказа? да/нет");
        } while (consoleView.repeatOrder());


        FileWrite fileWrite = new FileWrite();
        FileRead fileRead = new FileRead();

        System.out.print(fileRead);
    }
}