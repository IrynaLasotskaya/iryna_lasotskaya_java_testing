package com.epam.cdp.java_testng.iryna_lasotskaya;

/**
 * Created by Iryna Lasotskaya on 06.02.2017.
 */
public interface IOrder {


        void makeOrder(final int numOfRose) throws OrderFlowersException;
        void makeOrderChooseColor(final int chooseColor) throws OrderFlowersException;
        void chooseCountryManufacturer(final int country) throws OrderFlowersException;
    }



