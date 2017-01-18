package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» — «Имя».
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++)
        {
            map.put("" + Math.random() * 2, "" + Math.random() * 2);
        }

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;

        for (Map.Entry<String, String> pair : map.entrySet())
            if (pair.getValue().equals(name)) count++;

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код

        int count = 0;

        for (Map.Entry<String, String> pair : map.entrySet())
            if (pair.getKey().equals(lastName)) count++;

        return count;

    }

    public static void main(String[] args) {

    }
}
