package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.

Вывести на экран текст:
«Меня зовут name.
Я родился d.m.y»

Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String year = reader.readLine();
        String month = reader.readLine();
        String day = reader.readLine();

        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился "+day+"."+month+"."+year);
    }
}
