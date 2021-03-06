package com.javarush.task.task08.task0814;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++)
            set.add(i);

        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Iterator<Integer> iter = set.iterator();

        while (iter.hasNext()) {
            int x = iter.next();

            if (x > 10)
                iter.remove();
        }

        return set;
    }

    public static void main(String[] args) {

    }
}
