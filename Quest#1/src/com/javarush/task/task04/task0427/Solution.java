package com.javarush.task.task04.task0427;

/* 
Ввести с клавиатуры целое число в диапазоне 1 — 999. Вывести его строку-описание следующего вида:
«четное однозначное число» — если число четное и имеет одну цифру,
«нечетное однозначное число» — если число нечетное и имеет одну цифру,
«четное двузначное число» — если число четное и имеет две цифры,
«нечетное двузначное число» — если число нечетное и имеет две цифры,
«четное трехзначное число» — если число четное и имеет три цифры,
«нечетное трехзначное число» — если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 — 999, в таком случае ничего не выводить на экран.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        String str1;
        String str2;
        int length = String.valueOf(number).length();

        if (number >= 1 && number <= 999)
        {
            if (length == 1)
                str1 = "однозначное число";
            else if (length == 2)
                str1 = "двузначное число";
            else
                str1 = "трехзначное число";

            if (number % 2 == 0)
                str2 = "четное";
            else
                str2 = "нечетное";

            System.out.println(str2 + " " + str1);
        }



    }
}
