package com.epam.cdp.java_testng.iryna_lasotskaya.part2task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

import static com.company.Arraylist.getRandomArrayList;
import static com.company.Linkedlist.getRandomLinkedList;

/**
 * Created by user on 14.02.2017.
 */
public class Runner {
    public static void main(String[] args) {

        ArrayList<Integer> list = getRandomArrayList();
        Long start = System.currentTimeMillis();
        list.add(1, 99999999);
        Long end = System.currentTimeMillis();
        Long start1 = System.currentTimeMillis();
        list.add(5, 000001);
        Long end1 = System.currentTimeMillis();
        Long start2 = System.currentTimeMillis();
        list.remove(3);
        Long end2 = System.currentTimeMillis();
        Long start3 = System.currentTimeMillis();
        list.get(89);
        Long end3 = System.currentTimeMillis();


        System.out.print("Time for ArrayList is:" + (end - start) + (end1 - start1) + (end2 - start2) + (end3 - start3));


        LinkedList linkedlist = getRandomLinkedList();
        ListIterator<Integer> iterator = linkedlist.listIterator();
        Long start4 = System.currentTimeMillis();
        linkedlist.add(1, 333333333);
        Long end4 = System.currentTimeMillis();
        Long start5 = System.currentTimeMillis();
        linkedlist.add(1, 888888);
        Long end5 = System.currentTimeMillis();
        Long start6 = System.currentTimeMillis();
        linkedlist.add(5, 00000111);
        Long end6 = System.currentTimeMillis();
        Long start7 = System.currentTimeMillis();
        linkedlist.remove(3);
        Long end7 = System.currentTimeMillis();
        Long start8 = System.currentTimeMillis();
        linkedlist.get(91);
        Long end8 = System.currentTimeMillis();


        System.out.print("Time for LinkedList is:" + (end4 - start4)+(end5-start5)+(end6-start6)+(end7-start7)+(end8-start8));
    }
}