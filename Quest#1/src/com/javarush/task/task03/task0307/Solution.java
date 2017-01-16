package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
Создать 10 зергов, 5 протоссов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
       for (int i = 0; i < 10; i++)
       {
           Zerg zerg = new Zerg();
           zerg.name = "zerg" + i;
       }

        for (int j = 0; j < 5; j++)
        {
            Protoss protoss = new Protoss();
            protoss.name = "protoss" + j;
        }

        for (int k = 0; k < 12; k++)
        {
           Terran terran = new Terran();
           terran.name = "terran" + k;
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
