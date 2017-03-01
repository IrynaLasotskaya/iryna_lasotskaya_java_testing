package com.epam.cdp.java_testng.iryna_lasotskaya.Module2_oop;

import com.epam.cdp.java_testng.iryna_lasotskaya.Flowers;

import javax.swing.text.View;

public class Kaktus {
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
