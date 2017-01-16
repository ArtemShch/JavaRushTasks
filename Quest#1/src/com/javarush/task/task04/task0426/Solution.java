package com.javarush.task.task04.task0426;

/* 
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» — если число отрицательное и четное,
«отрицательное нечетное число» — если число отрицательное и нечетное,
«ноль» — если число равно 0,
«положительное четное число» — если число положительное и четное,
«положительное нечетное число» — если число положительное и нечетное.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        if (number == 0)
            System.out.println("ноль");
        else
        {
            String str1 = number % 2 == 0 ? "четное число" : "нечетное число" ;
            String str2 = number > 0 ? "положительное" : "отрицательное";
            System.out.println(str2 + " " + str1);
        }



    }
}
