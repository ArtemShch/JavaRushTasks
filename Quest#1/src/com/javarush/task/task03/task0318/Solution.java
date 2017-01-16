package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int date = Integer.parseInt(bufferedReader.readLine());
        String name = bufferedReader.readLine();

        bufferedReader.close();

        System.out.println(name + " захватит мир через " + date + " лет. Му-ха-ха!");
    }
}
