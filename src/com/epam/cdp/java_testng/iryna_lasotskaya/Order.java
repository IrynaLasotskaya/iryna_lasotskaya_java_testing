package com.epam.cdp.java_testng.iryna_lasotskaya;

/**
 * Created by Iryna_Lasotskaya on 08.02.2017.
 */

class Order implements IOrder {

    private final Flowers flower;

    public Order(final Flowers flower) {
        this.flower = flower;
    }

    enum Currency {

        BYN,
        USD,
        RUR
    }

    @Override
    public void makeOrder(final int numOfFlowers) throws OrderFlowersException {
        final int actualNumberOfFlowers = this.flower.getNumber();
        final String flowerName = this.flower.getName();


        if (actualNumberOfFlowers < numOfFlowers) {
            throw new OrderFlowersException("В магазине нет такого количества цветов:" + numOfFlowers
                    + " " + flowerName);
        } else {
            this.flower.setNumber(actualNumberOfFlowers - numOfFlowers);
            System.out.printf("Заказ принят: %d %s, цена: %d %s\n", numOfFlowers, flowerName,
                    calculateOrder(numOfFlowers), Currency.BYN);
        }
    }

    private int calculateOrder(final int numOfRose) {
        return numOfRose * this.flower.getPrice();
    }

    @Override
    public void makeOrderChooseColor(final int colorName) throws OrderFlowersException {
        final String chooseColor = this.flower.getColor();
        if (colorName != 1) {
            throw new OrderFlowersException("В магазине нет такого цвета тюльпанов:" + colorName
                    + "" + chooseColor);
        } else {
            System.out.printf("Заказ принят:  цвет:%d ", colorName, chooseColor);

        }
    }

    @Override
    public void chooseCountryManufacturer(final int countryName) throws OrderFlowersException {
        final String chooseCountry = this.flower.getCountry();
        if (countryName != 2) {
            throw new OrderFlowersException("Нет такого производителя цветов:" + countryName
                    + "" + chooseCountry);
        }
    }
}
