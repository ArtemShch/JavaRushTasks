package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(reader.readLine());
        arr[1] = Integer.parseInt(reader.readLine());
        arr[2] = Integer.parseInt(reader.readLine());

        if (arr[0] == arr[1] && arr[0] != arr[2])
            System.out.println(3);
        else if (arr[0] == arr[2] && arr[2] != arr[1])
            System.out.println(2);
        else if (arr[1] == arr[2] && arr[1] != arr[0])
            System.out.println(1);





    }
}
