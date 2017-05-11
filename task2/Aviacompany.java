package task2;

import java.util.Scanner;

/**
 * Created by Admin on 08.05.2017.
 */
public class Aviacompany {
    protected int quantityPeople;
    protected int quantityCargo;
    public int overallQuantity;
    protected int rangeOfFlight;
    String name;
    protected static int number;
    public Aviacompany(final int quantityCargo, final int quantityPeople, final String name, final int rangeOfFlight) {
        this.quantityCargo = quantityCargo;
        this.quantityPeople = quantityPeople;
        this.name = name;
        overallQuantity = quantityCargo + quantityPeople;
    }

    public int getQuantityCargo() {
        return quantityCargo;
    }

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }

    static int getOverallQuantity() {
        return getOverallQuantity();
    }

    public int getQuantityPeople() {
        return quantityPeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantityCargo(int quantityCargo) {
        this.quantityCargo = quantityCargo;
    }

    public void setQuantityPeople(int quantityPeople) {
        this.quantityPeople = quantityPeople;
    }


    public void setNumber(final int number) {
        this.number = number;
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

        public int getrangeOfFlight(final String msg) {
            printMessage("\n" + msg);
            return scanner.nextInt();
        }


        public void printMessage(final String msg) {
            System.out.println(msg);
        }

    }}




