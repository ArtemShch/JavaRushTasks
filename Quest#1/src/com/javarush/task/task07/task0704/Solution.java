package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int[] arrReverse = new int[10];

        for (int i = 0; i < 10; i++)
            arr[i] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < 10; i++)
        {
            arrReverse[i] = arr[9 - i];
        }

        for (int x : arrReverse)
        System.out.println(x);
    }
}

