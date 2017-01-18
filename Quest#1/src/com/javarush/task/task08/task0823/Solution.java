package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] arr = s.split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        for (String anArr : arr) {
            if (anArr.length() != 0)
            stringBuilder.append((anArr.charAt(0) + "").toUpperCase()).append(anArr.substring(1)).append(" ");
        }

        System.out.println(stringBuilder.toString().trim());
        //напишите тут ваш код
    }
}
