package com.lessons.homework.hw10;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1,1,0,2,2,3,4,4,5,6};

        Map <Integer, Integer> checkList = new HashMap<>();
        
        for(int i = 0; i < array.length; i++) {
            checkList.put(i, array[i]);//only one repeat of EVERY number in array
        }

        for(int i = 0; i < checkList.size(); i++) {
            int count = 0;
            for (int t = 0; t < array.length; t++) {//equals map numbers to array numbers
                if (checkList.get(i) == array[t]) {//if they are the same add count
                    count++;//number of repeats of this number
                }
            }
            if (count == 1) {//check that number ist repeating
                System.out.println("Number " + checkList.get(i) + " doesnt repeat." );
            }
        }
        
    }
    
}
