package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Пять победителей
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Вывести пять наибольших чисел.
Каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] crunchifyArr) {
        int temp;
        for (int i = 0; i < crunchifyArr.length - 1; i++) {

            for (int j = 1; j < crunchifyArr.length - i; j++) {
                if (crunchifyArr[j - 1] < crunchifyArr[j]) {
                    temp = crunchifyArr[j - 1];
                    crunchifyArr[j - 1] = crunchifyArr[j];
                    crunchifyArr[j] = temp;
                }
            }
        }
    }
}