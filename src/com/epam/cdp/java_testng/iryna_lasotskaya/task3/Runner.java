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
        Calculator calc1= new Calculator();
        switch (action) {
            case 1:

                System.out.println("Результат: " + a + " + " + b + " = " + calc1.sum(a,b));
                break;
            case 2:

                System.out.println("Результат: " + a + " - " + b + " = " + calc1.sub(a,b));
                break;
            case 3:
                if (b==0)
                    System.out.println("Делить на ноль нельзя!Пока!");
                else
                System.out.println("Результат: " + a + " / " + b + " = " + calc1.del(a,b));
                break;
            case 4:

                System.out.println("Результат: " + a + " * " + b + " = " + calc1.mult(a,b));
                break;
            default:
                System.out.println("Упс!Попробуйте еще раз");
                break;
        }
    }
}


