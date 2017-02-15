package com.epam.cdp.java_testng.iryna_lasotskaya.task2;

import java.util.Scanner;

/**
 * Created by Iryna_Lasotskaya on 01.02.2017.
 */
public class Runner {


    public static void main(String[] args) {
        Integer maxLength;
        Integer minLength;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 1 строку: ");
        String a = in.nextLine();
        System.out.print("Введите 2 строку: ");
        String b = in.nextLine();
        maxLength = a.length();
        String theLongest = a;
        theLongest = b;
        minLength = a.length();
        String theShortest = a;
        minLength = b.length();
        theShortest = b;
        if (a.length() > b.length()) {
            maxLength = a.length();
            theLongest = a;

        }

        if (a.length() < b.length()) {
            minLength = a.length();
            theShortest = a;
        }

        System.out.println("Длинная строка: " + theLongest + "\nДлина равна: " + theLongest.length() + "\nКороткая строка: " + theShortest + "\nДлина равна: " + theShortest.length());
        in.close();
    }

}



