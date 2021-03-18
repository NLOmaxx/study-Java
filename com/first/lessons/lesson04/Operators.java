package com.lessons.lesson04;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Operators {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        extracted(reader);

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        if (num1 < num2) {
            System.out.println(num1);
        } else if (num1 > num2) {
                System.out.println(num2);
            } else {
                System.out.println(num1 + " " + num2);
            }
            
        
        /*int a = 11;
        if(a > 10) {
            System.out.println("kk");
        }
        else
            if (a < 10) {
                System.out.println("kkkk");
            }*/
        
        
    }

    private static void extracted(BufferedReader reader) {
    }
}
