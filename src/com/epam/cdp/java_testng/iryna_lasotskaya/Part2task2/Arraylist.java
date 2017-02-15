package com.epam.cdp.java_testng.iryna_lasotskaya.Part2task2;

import java.util.ArrayList;
import java.util.Random;
public class Arraylist {
    /**
     * Created by Iryna_Lasotskaya on 08.02.2017.
     */


    public static ArrayList<Integer> getRandomArrayList() {
        // 1. объявила коллекцию
        ArrayList<Integer> numbersGenerated = new ArrayList<>();

        // 2. Создала объект для генерации рандомных чисел
        Random random = new Random();
        for (int i = 0; i < 7000; i++) {
            // 3.  заполнение коллекции
            numbersGenerated.add(random.nextInt());
        }

        return numbersGenerated;
    }

}
