package com.epam.cdp.java_testng.iryna_lasotskaya.part2task1;
/**
 * Created by Iryna_Lasotskaya on 08.02.2017.
 */
public class Runner {
    public static void main(String[] args) {
        // ListFlowers listFlowers=new ListFlowers();
        int summ = 0;
        Flowers.Rose rose = new Flowers.Rose(6, "Rose", 8);
        Flowers.Iris iris = new Flowers.Iris(4, "Iris", 8);
        Flowers.Mimosa mimosa = new Flowers.Mimosa(3, "Mimosa", 3);
        Flowers.Lavender lavender = new Flowers.Lavender(2, "Lavender", 3);
        Flowers.Kaktus kaktus = new Flowers.Kaktus();
        System.out.println("Your bouquet costs " + Flowers.getSumm() + " rub");

        FileWrite fileWrite=new FileWrite();
        FileRead fileRead=new FileRead();

        System.out.print(fileRead);

    }
}