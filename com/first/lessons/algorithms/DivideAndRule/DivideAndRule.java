package com.lessons.algorithms.DivideAndRule;

public class DivideAndRule {
    public static void main(String[] args) {
        int[] array = new int[66];

        for (int i = 2; i < array.length + 2; i++) {
            array[i-2] = i;//array from 2 to 67(?)
            
        }

        System.out.println(" = " + sum(array, array.length));//result arithmetic progression
        
    }

    public static int sum(int[] array, int size) {
        //arithmetic progression
        int res = size; //first item
        
        size = size-1; //phantom array size(that for not creating new arrays 
        //again and again)

        if (size == -1 ) {//last iteration of method
            return res;
        }

        System.out.print(array[size]);
        if (size != 0) {//illustration of work of this method
        System.out.print(" + ");
    }
        res = array[size] + sum(array, size);//recursion

        return res;
    }

    /*How does this method works? He take <array.lenght> from
    original array and he take array ofc. After that, it dicrease lenght
    for 1 index(<size>) to count numbers that puts in index[size], and this works
    for us in second way.
    
    We need to go to basic - to the first number of array. Where is the first
    number? In zeri index ofc. How to find out is that a first index? Decrease <size>
    until <size>(or phantom array.lenght) == 1. Thats the basic option, that returns
    res=size(index[0])

    And after that starts stack work. This method return res to previous and again
    and again until we will have arithmetic progression result. 
    
    That strategy calls Divide and Rule, because we divide out difficult question
    to basic type and to way to basic type from less and less questions.
    */
    
}
