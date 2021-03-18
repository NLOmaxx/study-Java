package com.lessons.lesson08;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 7, 8, 9 , 99};
        
        //массив - это объект, и пытаясь вызвать список, вызовется тустринг
       /* arr[0] = 55;
        arr[7] = 623645;
        System.out.println(arr[0]);/*

      /* for (int i=0; i < arr.length; i++) {
            arr[i] = 9-i;
        }*/
        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]); //если массив закончился - начинает воспроизводить сначала,
            //пока цикл не кончится
        }

       /* int array[][] = new int[2][5]; //двумерный массив(первая - кол-во массивов, кол-во элементов)*/
       /* for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].lenght; j++){
                
                System.out.println(array[i][j]);
            }
        }*/
       Arrays.sort(arr); //сортирует по возрастанию
       for (int i=0; i < arr.length; i++) {
        System.out.println(arr[i]); 
    }
    }
}
