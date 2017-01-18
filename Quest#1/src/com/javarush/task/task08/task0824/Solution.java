package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human baby1 = new Human("baby1", true, 5);
        Human baby2 = new Human("baby2", true, 5);
        Human baby3 = new Human("baby3", true, 5);

        ArrayList<Human> children = new ArrayList<>();
        children.add(baby1);
        children.add(baby2);
        children.add(baby3);

        Human father = new Human("father", true, 35, children);
        Human mother = new Human("mother", false, 35,children);

        ArrayList<Human> children2 = new ArrayList<>();
        children2.add(father);
        ArrayList<Human> children3 = new ArrayList<>();
        children3.add(mother);

        Human grand1 = new Human("Gran1", true, 55, children2);
        Human grand2 = new Human("Grand2", true, 55, children3);

        Human baba1 = new Human("baba1", false, 55, children2);
        Human baba2 = new Human("baba2", false, 55, children3);

        System.out.println(grand1);
        System.out.println(grand2);
        System.out.println(baba1);
        System.out.println(baba2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(baby1);
        System.out.println(baby2);
        System.out.println(baby3);

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
