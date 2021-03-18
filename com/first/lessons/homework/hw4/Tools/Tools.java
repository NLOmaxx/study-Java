package com.lessons.homework.hw4.Tools;


public class Tools {
    
    
    public static void oneTen() {
        int res = 1;
        while(res<=10) {
        System.out.println(res);
        res++;
        }
    }

    public static void tenOne() {
        int res = 10;
        while(res>=1) {
        System.out.println(res);
        res--;
        }
    }

    public static void chet() {
        for(int temp = 1; temp<=100; temp++) {
            if(temp%2 != 0)
                continue;
            System.out.println(temp);
        }
    }

    public static void writer(int a, String b) {
        int count = a;
        int temp = 1;
        String str = b;
        String str2 = str;
        while (temp<=count) {  
                      
            
            if(str2 == null ) {
                str2 = b;
                System.out.println(str2);
            } 
            else 
            System.out.println(str2);
            temp++;
        }
        
    }

    public static void sqr(int a, int b) {
        int w = a;
        int h = b;
        for(int temp1 = 0; temp1 < h; temp1++) {            
            for(int temp2 = 0; temp2 < w; temp2++) {
                System.out.print(8);
            }
            System.out.println();
            
        }
    }

    public static void square() {
        int temp1 = 0;
        int temp2 = 0;
        while(temp1 < 10){
            temp2 = 0;
            while(temp2 < 10){
                System.out.print("P");
                temp2++;
            }
        System.out.println();
        temp1++;
        }
        
    }
}

