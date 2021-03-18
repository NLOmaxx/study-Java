package com.lessons.homework.hw3.Compare;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.lessons.homework.hw3.Tools.*;

public class Compare {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        extracted(reader);  
        
        int num1 = Integer.parseInt(reader.readLine());
        
        Tools.compare(num1); //сравнение с числом 5
        Tools.check(num1); //проверка модуля
        Tools.checkInterval(num1); //входит ли число в интервал
        
        int num2 = Integer.parseInt(reader.readLine());
        double res = Tools.closeToFive(num1, num2);
        System.out.println(res);


    }

    private static void extracted(BufferedReader reader) throws IOException {
    }
}
