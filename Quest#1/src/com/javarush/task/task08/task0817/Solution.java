package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» — «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++)
        {
            map.put("" + i, " " + (int)(Math.random() * 10));
        }

        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        Iterator it = copy.entrySet().iterator();

        while (it.hasNext())
        {
            Map.Entry<String, String> item = (Map.Entry<String, String>) it.next();
            if (Collections.frequency(copy.values(), item.getValue()) > 1)
                removeItemFromMapByValue(map, item.getValue());
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
       /* HashMap<String, String> map = createMap();
        System.out.println(map);

        removeTheFirstNameDuplicates(map);
        System.out.println(map);*/

    }
}
