package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstName;
        private String lastName;
        private String city;
        private String country;
        private int age;
        private boolean sex;
        // напишите тут ваши переменные и конструкторы


        public Human(String firstName, boolean sex) {

            this.firstName = firstName;
            this.sex = sex;
        }

        public Human(String city, String country, int age, boolean sex) {

            this.city = city;
            this.country = country;
            this.age = age;
            this.sex = sex;
        }

        public Human(String country, int age, boolean sex) {

            this.country = country;
            this.age = age;
            this.sex = sex;
        }

        public Human(int age, boolean sex) {

            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, String country, int age, boolean sex) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.country = country;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, String city, String country, boolean sex) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.city = city;
            this.country = country;
            this.sex = sex;
        }

        public Human(String firstName, String lastName) {

            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName) {

            this.firstName = firstName;
        }

        public Human(String firstName, String lastName, String city, String country, int age, boolean sex) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.city = city;
            this.country = country;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
        }
    }
}
