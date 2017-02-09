package com.epam.cdp.java_testng.iryna_lasotskaya.Part2task2;

import java.util.ArrayList;
import java.util.Random;
public class Arraylist {
    /**
     * Created by Iryna_Lasotskaya on 08.02.2017.
     */
    public static void main(String[] args) {
        Long start=System.currentTimeMillis();
        ArrayList<Integer> list = getRandomArrayList();

        list.add(1,99999999);
        list.add(5, 000001);
        list.remove(3);
        list.get(89);

        Long end=System.currentTimeMillis();
        System.out.print("Time is:"+ (end - start));
    }

    public static ArrayList<Integer> getRandomArrayList() {
        // 1. объявила коллекцию
        ArrayList<Integer> numbersGenerated = new ArrayList<>();

        // 2. Создала объект для генерации рандомных чисел
        Random random = new Random();
        for (int i = 0; i < 7000; i++) {
            // 3.  заполнение коллекции
            numbersGenerated.add(random.nextInt());
        }
        // 4. Возвращаешь коллекцию из метода (уже заполненную) а имя твоей коллекции - numbersGenerated, значит это имя и возвращаем


        return numbersGenerated;
    }
}
