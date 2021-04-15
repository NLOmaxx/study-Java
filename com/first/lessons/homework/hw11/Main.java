package com.lessons.homework.hw11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        extracted(reader);


        int[] arr1 = new int[5];

        for(int i = 0; i <arr1.length; i++) {
            System.out.println("Print number");
            arr1[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println(arr1.toString());

        Arrays.sort(arr1);
       
        System.out.println(arr1.toString());

        int min = arr1[0];
        int max = arr1[arr1.length - 1];
        System.out.println("Min: " + min + " Max: " + max);

    }

    private static void extracted(BufferedReader reader) {
    }
}