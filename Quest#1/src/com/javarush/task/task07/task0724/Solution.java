package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grand1 = new Human("Gran1", true, 55);
        Human grand2 = new Human("Grand2", true, 55);

        Human baba1 = new Human("baba1", false, 55);
        Human baba2 = new Human("baba2", false, 55);

        Human father = new Human("father", true, 35,grand1, baba1);
        Human mother = new Human("mother", false, 35,grand2, baba2);

        Human baby1 = new Human("baby1", true, 5,father, mother);
        Human baby2 = new Human("baby2", true, 5,father, mother);
        Human baby3 = new Human("baby3", true, 5,father, mother);

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
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
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

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















