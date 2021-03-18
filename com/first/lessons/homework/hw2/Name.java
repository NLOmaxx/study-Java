package com.lessons.homework.hw2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Name {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        extracted(reader);
        
        String name = reader.readLine();
        int cash = Integer.parseInt(reader.readLine());
        int age = Integer.parseInt(reader.readLine());

        System.out.println(name + " будет получать " + cash + " через " + age + " лет.");

    }

    private static void extracted(BufferedReader reader) throws IOException {
	}
}