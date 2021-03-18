package com.lessons.homework.hw4.Main;
import com.lessons.homework.hw4.Tools.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Infinite {
    public static void main(String[] args) throws IOException {    
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        extracted(reader);   

        System.out.println();
        Tools.oneTen();

        System.out.println();
        Tools.tenOne();

        System.out.println();
        Tools.chet();

        System.out.println();
        System.out.println("Введите число");
        int count = Integer.parseInt(reader.readLine());
        System.out.println("Введите строку");
        String str = reader.readLine();       
        Tools.writer(count, str);

        System.out.println();
        System.out.println("Введите ширину");
        int width = Integer.parseInt(reader.readLine());
        System.out.println("Введите высоту");
        int height = Integer.parseInt(reader.readLine());
        Tools.sqr(width, height);

        System.out.println();
        Tools.square();

    }

    private static void extracted(BufferedReader reader) throws IOException {
    }
}
