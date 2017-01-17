package com.javarush.task.task06.task0611;

/* 
Сделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку повторенную count раз.
String multiply(String s) – возвращает строку повторенную 5 раз.
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        StringBuilder stringBuilder = new StringBuilder();
        //напишите тут ваш код
        for (int i = 0; i < 5; i++)
            stringBuilder.append(s);
        result = String.valueOf(stringBuilder);
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //напишите тут ваш код
        StringBuilder stringBuilder = new StringBuilder();
        //напишите тут ваш код
        for (int i = 0; i < count; i++)
            stringBuilder.append(s);
        result = String.valueOf(stringBuilder);
        return result;
    }

    public static void main(String[] args) {

    }
}
