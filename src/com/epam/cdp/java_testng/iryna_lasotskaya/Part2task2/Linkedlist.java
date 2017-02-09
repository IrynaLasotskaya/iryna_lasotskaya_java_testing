package com.epam.cdp.java_testng.iryna_lasotskaya.Part2task2;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
/**
 * Created by Iryna_Lasotskaya on 08.02.2017.
 */
public class Linkedlist {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        LinkedList linkedlist = getRandomLinkedList();
        ListIterator<Integer> iterator = linkedlist.listIterator();
        linkedlist.add(1, 333333333);
        linkedlist.add(1, 888888);
        linkedlist.add(5, 00000111);
        linkedlist.remove(3);
        linkedlist.get(91);

        Long end = System.currentTimeMillis();
        System.out.print("Time is:" + (end - start));

    }

    public static LinkedList<Integer> getRandomLinkedList() {
        // 1. Ты объявила коллекцию
        LinkedList<Integer> numbersGeneratedList = new LinkedList<>();

        // 2. Создала объект для генерации рандомных чисел
        Random random = new Random();
        for (int i = 0; i < 7000; i++) {
            // 3. делаешь заполнение коллекции
            numbersGeneratedList.add(random.nextInt());
        }
        // 4. Возвращаешь коллекцию из метода (уже заполненную) а имя твоей коллекции - numbersGenerated, значит это имя и возвращаем


        return numbersGeneratedList;

    }
}
