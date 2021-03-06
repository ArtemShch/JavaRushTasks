package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Введи с клавиатуры 5 слов в список строк. У
дали 3 — ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }

        reader.close();

        list.remove(2);

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(list.size() - 1 - i));
    }
}


