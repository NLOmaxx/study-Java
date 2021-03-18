package com.lessons.calc.tools;

public class Minimalist {
    public static int minTwo(int a, int b) {
        int res = a;
        
        if (a < b)
        res = a;
            else if (b < a){
                res = b;
            }       
        return res;
                
    }

    public static int minThree(int a, int b, int c) {
        int res = a;
        if (a < b && a<c)
            res = a;
            else if (b < a && b < c) {
                res = b;
                }
                    else
                        res = c;
        return res;
        }
        public static int minFive(int a, int b, int c, int d, int e) {
            int res = a;
            int temp1 = minTwo(a, b);
            int temp2 = minThree(c, d, e);
            res = minTwo(temp1, temp2);
            return res;
        }


    public static int middle(int a, int b, int c) {
        int res = a;
        int temp = minThree(a, b, c);
        if (temp == a) {
            if (b < c)
                res = b;
            else
                res = c;
        }

        if (temp == b) {
            if (a < c)
                res = a;
            else
                res = c;
        }

        if (temp == c) {
            if (a < b)
                res = a;
            else
                res = b;
        }
        return res;
        
            
    }
}
