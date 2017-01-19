package com.javarush.task.task12.task1207;

/* 
print(int) и print(Integer)
*/

public class Solution {
    public static void main(String[] args) {
        Solution.print(1);
        Solution.print(new Integer(1));
    }
    public static void print(Integer a)
    {
        System.out.println(a);
    }
    public static void print(int a)
    {
        System.out.println(a);
    }

}
