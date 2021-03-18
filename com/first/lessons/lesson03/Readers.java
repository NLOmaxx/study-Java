package com.lessons.lesson03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Readers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        extracted(reader);
        String str = reader.readLine();
        int num = Integer.parseInt(str);
        System.out.println(num*2);

        


    }

    private static void extracted(BufferedReader reader) throws IOException {
        

    }
}
