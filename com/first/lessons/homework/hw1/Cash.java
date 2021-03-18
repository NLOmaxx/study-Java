package com.lessons.homework.hw1;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Cash {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        extracted(reader);
        int res = Integer.parseInt(reader.readLine());
        System.out.println("Я буду зарабатывать " + res + " в час");

    }

    private static void extracted(BufferedReader reader) throws IOException {
	}
}
