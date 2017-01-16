package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.DoubleSummaryStatistics;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double minutes = Double.parseDouble(bufferedReader.readLine());
        int number = (int) (minutes % 5);

        if (number >= 0 && number < 3)
            System.out.println("зелёный");
        else if (number == 3)
            System.out.println("желтый");
        else
            System.out.println("красный");
    }
}