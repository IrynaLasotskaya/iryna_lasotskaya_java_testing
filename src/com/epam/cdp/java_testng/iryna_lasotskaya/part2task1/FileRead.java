package com.epam.cdp.java_testng.iryna_lasotskaya.part2task1;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Iryna_Lasotskaya on 15.02.2017.
 */
public class FileRead {
    public static void main(String[] args) {

        try(FileReader reader = new FileReader("C:\\Users\\user\\Documents\\new.txt"))
        {
            //  посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
