package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];

        for (int i = 0; i < 20; i++)
            arr[i] = Integer.parseInt(reader.readLine());

        int maximum = arr[0];
        int minimum = arr[0];

        for (int i = 0; i < 20; i++)
        {
            maximum = Math.max(maximum, arr[i]);
            minimum = Math.min(minimum, arr[i]);
        }
        //напишите тут ваш код

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
