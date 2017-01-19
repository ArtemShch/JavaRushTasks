package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        reader.close();
        HashMap<String, Integer> map = new HashMap<>();
        Month[] months = Month.values();

        for (int i = 0; i < months.length; i++)
        {
            if (months[i].name().toLowerCase().equals(month.toLowerCase()))
            {
                System.out.println(month + " is " + months[i].getValue() + " month");
            }
        }
    }
}
