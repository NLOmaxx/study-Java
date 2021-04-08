package com.lessons.algorithms.Qsort;

public class Qsort {
    public static void main(String[] args) {
        int[] array = new int[arrGenerator()];//randomize array.lenght
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.round(Math.random() * 1024);
            /*put random numbers in array*/  
        }


        array = qSort(array, 0, array.length -1);//sorting algorithm
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);//toString of our array
        }
        


    }


   public static int[] qSort(int[] array, int low, int high) {
        if (array.length == 0) {
            return array; //if we have array without anything - algorithm will stop
                            //and return
        }

        if (low >= high) {
            return array; //end of recursion part
        }

        int middle = low + (high-low)/2;//middle of our array
        int opora = array[middle];

        int leftMark = low, rightMark = high;
        while (leftMark <= rightMark) {
            while(array[leftMark] < opora) {
                leftMark++;
            }

            while (array[rightMark] > opora) {
                rightMark--;
            }

            if (leftMark <= rightMark) {
                int temp = array[leftMark];
                array[leftMark] = array[rightMark];
                array[rightMark] = temp;
                leftMark++;
                rightMark--;
            }

        if (low < rightMark) {
            qSort(array, low, rightMark);
        }

        if (high > leftMark) {
            qSort(array, leftMark, high);
        }

        }

        return array;
    }

    /*It's quete difficult to explain, but I will try
    1)While number in index[left] is smaller than middle point
    nothing will happends, and our leftMarker will stand righter and righter

    Our mission to let <leftMark> go to the end (<high>) and <rightMark>
    go to the beggining(<low>).

    2)Our algorithm will check if this numbers are bigger or smaller than middle,
    and this check will stop, when [leftMark] > middle and [rightMark] < middle.

    If this happends, we will swap numbers of this indexes and call recursion.

    3)First call - is checking numbers from zero index to <rightMark
    (I will remember you, that our mission will end when <rightMark> 
    will at start, and <leftMark> in the end. 
    
    It checks numbers the same way as I write in step-1
    
    4)Second call - is checking numbers from leftMark to end. Same as step-1

    5)After that this method return our array sorted. It calls (O = n^2)algorithm,
    but 
    thats in the worst way. Usually it works (O = n*log n)
    its slower than (O = log n), but quicker than (O = n^2).
    */

    public static int arrGenerator() {
        /*this method create random arraySize from 5 to 127*/
        double temp = Math.random() * 128;
        float temp2 = Math.round(temp);
        int arrSize = (int)temp2;
        if (arrSize <= 2) {
            arrSize = arrSize + 5;
        }
        System.out.println("Размер массива: " + arrSize);
        return arrSize;
    }
}
