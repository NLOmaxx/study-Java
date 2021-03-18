package com.lessons.homework.hw8.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Maain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        extracted(reader);

        int[] bigboy = new int[10];
        int[] smallboy1 = new int[5];
        int[] smallboy2 = new int[5];

        for (int i = 0; i < bigboy.length; i++) {
            System.out.println("Введите число");
            bigboy[i] = Integer.parseInt(reader.readLine());
        }
        smallboy1 = convertor1(bigboy, smallboy1);
        smallboy2 = convertor2(bigboy, smallboy2);

        
        for (int i = 0; i < smallboy2.length; i++) {
            System.out.println(smallboy2[i]);
        }



    }


        public static int[] convertor1 (int[] big, int[] small1) throws IOException {
            for (int i = 0; i < small1.length; i++) {
                small1[i] = big[i];
            }

                return small1;
            }
        

        public static int[] convertor2 (int[] big, int[] small2) throws IOException {
            
            for (int i = 0; i < big.length - 5; i++) {
                small2[i] = big[i+5];
                
            }
            return small2;
        }


        /*String[] arrstr = new String[5];
        int[] arrint = new int[5];

        for (int i = 0; i < arrstr.length; i++) {
            System.out.println("Введите строку");
            arrstr[i] = reader.readLine();
        }

        for (int i = 0; i < arrint.length; i++) {
            arrint[i] = arrstr[i].length();
            System.out.println("Количество символов в " + i + " ячейке " + arrint[i]);
        }*/

        

    

    private static void extracted(BufferedReader reader) throws IOException {
    }
}
