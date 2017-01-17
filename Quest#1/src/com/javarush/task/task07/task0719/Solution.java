package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println(list.get(list.size() - 1 - i));
        }
    }
}