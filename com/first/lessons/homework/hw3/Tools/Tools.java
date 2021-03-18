package com.lessons.homework.hw3.Tools;

public class Tools {
    public static void compare(int a) {
        int res = a;
            if (res<5) {
                System.out.println("Число меньше 5");
            } else if (res>5) {
                System.out.println("Число больше 5");
            } else
                System.out.println("Число равно 5");


    }

    public static void checkInterval(int a) {
        int res = a;
        if (res >= 20 && res <= 50)
            System.out.println("Число " + res + " содержится в интервале.");
        else
        System.out.println("Число " + res + " не содержится в интервале.");
    }

    public static void check(int a) {
        int res = 0;
            if (a<0)
                res = a+10;
            else
                res = a*2;
        System.out.println(res);
    }

    public static double closeToFive(int a, int b) {
        double res = a;
        if (res == 5)
            return res;
        double temp1 =a/5;
        double temp2 =b/5;


        if (temp1 < temp2)
            res = a;
        else
            res = b;
        return res;
    }
}
