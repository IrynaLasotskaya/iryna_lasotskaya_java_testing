package com.epam.cdp.java_testng.iryna_lasotskaya.task1;

/**
 * Created by Iryna_Lasotskaya on 08.02.2017.
 */

public class Runner {

    private final int size = 20;
    private int[] array = new int[20];

    public Runner() {
    }

    public static void main(String[] args) {
        Runner run = new Runner();
        run.array();
    }

    public void print () {
        int[] var4 = this.array;
        int var3 = this.array.length;

        for (int var2 = 0; var2 < var3; ++var2) {
            int i = var4[var2];
            System.out.printf(" " + i, new Object[0]);
        }

    }

    public void array() {
        int maxPositiveValue;
        for (maxPositiveValue = 0; maxPositiveValue < this.array.length; ++maxPositiveValue) {
            this.array[maxPositiveValue] = (int) (Math.random() * 21.0D) - 10;
        }

        System.out.print("Original array:");
        this.print();
        maxPositiveValue = 10;
        int minNegativeValue = -10;
        int minPositiveIndex = 0;
        int maxNegativeIndex = 0;

        int vary;
        for (vary = 0; vary < this.array.length; ++vary) {
            if (this.array[vary] > 0 && this.array[vary] < maxPositiveValue) {
                maxPositiveValue = this.array[vary];
                minPositiveIndex = vary;
            }

            if (this.array[vary] < 0 && this.array[vary] > minNegativeValue) {
                minNegativeValue = this.array[vary];
                maxNegativeIndex = vary;
            }
        }

        vary = this.array[minPositiveIndex];
        this.array[minPositiveIndex] = this.array[maxNegativeIndex];
        this.array[maxNegativeIndex] = vary;
        System.out.print("\nModified array:");
        this.print();
    }
}

