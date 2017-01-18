package com.javarush.task.task08.task0818;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: «фамилия» — «зарплата».
Удалить из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++)
            map.put("" + i, (int)(Math.random() * 1000));

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator it = map.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry<String, Integer> item = (Map.Entry<String, Integer>) it.next();
            if (item.getValue() < 500)
                it.remove();
        }
    }

    public static void main(String[] args) {

    }
}