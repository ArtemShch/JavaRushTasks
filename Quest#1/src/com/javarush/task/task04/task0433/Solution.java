package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int number = 10;

        while (number > 0)
        {
            int x = 10;
            while (x > 0)
            {
                System.out.print("S");
                x--;
            }
            number--;
            System.out.println("");
        }


    }
}
