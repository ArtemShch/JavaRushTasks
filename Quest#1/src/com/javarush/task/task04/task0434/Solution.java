package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int number = 1;
        while (number <= 10)
        {
            int x = 1;
            while (x <= 10)
                System.out.print(number * x++ + " ");
            number++;
            System.out.println("");
        }
    }
}
