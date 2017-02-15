package com.epam.cdp.java_testng.iryna_lasotskaya.part2task1;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Iryna_Lasotskaya on 15.02.2017.
 */
public class FileWrite {
    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("C:\\Users\\user\\Documents\\new.txt", false))
        {
            // запись всей строки
            String text = "Мама мыла раму, раму мыла мама";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
