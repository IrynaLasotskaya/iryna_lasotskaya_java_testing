package com.epam.cdp.java_testng.iryna_lasotskaya.task3;

import java.util.Scanner;

/**
 * Created by Iryna_Lasotskaya on 01.02.2017.
 */
public class Runner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите 2 числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Выберите операцию:\n1) + \n2) - \n3) / \n4) * \n");

        int action = in.nextInt();
        switch (action) {
            case 1:

                Calculator calc1= new Calculator();
                System.out.println("Результат: " + a + " + " + b + " = " + calc1.sum(a,b));
                break;
            case 2:

                Calculator calc2 = new Calculator();
                System.out.println("Результат: " + a + " - " + b + " = " + calc2.sub(a,b));
                break;
            case 3:

                Calculator calc3 = new Calculator();
                System.out.println("Результат: " + a + " / " + b + " = " + calc3.del(a,b));
                break;
            case 4:

                Calculator calc4 = new Calculator();
                System.out.println("Результат: " + a + " * " + b + " = " + calc4.mult(a,b));
                break;
            default:
                System.out.println("Упс!Попробуйте еще раз");
                break;
        }
    }
}


