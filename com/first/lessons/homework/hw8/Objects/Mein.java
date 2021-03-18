package com.lessons.homework.hw8.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Mein {
    public static void main(String[] args) throws IOException {
        String[] arr1 = initilizeArray();
        for (int i = 8; i >= 0; i--) {
            System.out.println(arr1[i]);
        }

        
    }


    public static String[] initilizeArray() throws IOException {
        String[] res = new String[10];
        for(int temp = 0; temp < res.length - 2; temp++) {
            res[temp] = inputArray(res);
        }
        return res;
    }

    public static String inputArray(String[] array) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        extracted(reader);
        System.out.println("Введите строку");
        String res = reader.readLine();
        return res;
    }

    private static void extracted(BufferedReader reader) {
    }

}
