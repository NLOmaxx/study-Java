package com.lessons.homework.hw1;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 18;
        int c = 21;

        a = a^b;
        b = b^a;
        a = a^b;

        b = b^c;
        c = c^b;
        b = b^c;

        System.out.println(a + " " + b + " " + c);

        /*Swapper swap = new Swapper(a, b, c);

        a = swap.getNum2();
        b = swap.getNum3();
        c = swap.getNum1();

        System.out.println(a + " " + b + " " + c);*/
    }
}
