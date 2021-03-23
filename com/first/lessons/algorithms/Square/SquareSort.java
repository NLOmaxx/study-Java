package com.lessons.algorithms.Square;



public class SquareSort {
    public static void main(String[] args) {
        int[] array = new int[arrGenerator()];
        /*generate new array with ranom lenght*/
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.round(Math.random() * 1024);
            /*put random numbers in array*/  
        }

        System.out.println("До сортировки");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);//array without sort in console
        }

        System.out.println("После сортировки");

        array = ssort(array);//sorting algorithm

        /*Of course you can use Arrays.sort, but to understand how 
        bubble sorting algorithm*/


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);//array with sort in console
        }

        

    }
    
    public static int[] ssort(int[] arr) {
        int[] res = new int[arr.length];
        boolean sorted = false;
        int temp;//this used to save max from 2 ints

        res = arr; /*for (int i = 0; i < res.length; i++) {
            res[i] = arr[i];//I think res = arr will be equals, need to check
            yea, thats equals
        }*/
        

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < res.length-1; i++) {
                if (res[i] > res[i+1]) {
                    temp = res[i];
                    res[i] = res[i+1];
                    res[i+1] = temp;
                    sorted = false;
            
                }
            }
        }
        return res;
    }

    /*How bubble sort is working? We have boolean, that false, and
    because of this, cycle <while> will work for the first time
    after that <sorted> become true. We will need this in future.
    After that start <for> that check two neighbour numbers and if first
    number bigger than second, we save first num in <temp> and change
    first num to second, and after this second become first(thanks to <temp)
    and when <sorted> become false. Why we need to set false in <sorted>
    Because when first cycle will end, we will have some unsorted numbers
    and our algorithm won't sort them without false in <sorted>.
    After all, why we need to set <sorted> = true in <while>?
    Because, when the sorting will be end(in first or in second time(not third
    because, that will be end in second time)) we need to stop this. If we put
    <sorted> = true in while, that will be changed only if <if> will work.
    But, when sort will be end, <if> doesn't work, and thats means, that
    <sorted> will stay <true> and that means cycle is over.

    This algorithm is (O = n ^ 2) because in the worst way we need only
    two full iterations of cycle to sort numbers
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
