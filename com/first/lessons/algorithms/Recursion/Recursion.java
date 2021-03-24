package com.lessons.algorithms.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        extracted(reader);

        int n = Integer.parseInt(reader.readLine());
        System.out.println(" = " + recursionFactorial(n) + "!");
        

    }

    private static void extracted(BufferedReader reader) throws IOException {

    }

    public static int recursionFactorial(int n) {
        int res = 1;
        
        if (n==0) {
            return res;
        }

        if (n<0) {
            n = -1;
            System.out.println("You can't find n! of negative number");
            return res;
        }

        System.out.print(n);
        if (n != 1) {
            System.out.print(" * ");
        }

        res = n * recursionFactorial(n-1);
        return res;
        /*This is correct recursion method. How does this work?
        When we call this method witn <int> n, programm will check
        if n < 0 or n ==0 method won't work, but most interesting is
        when we call method with positive number
        
        For example, we will call method with <n> = 5
        When it starts to work at first time, method will ignore first to <if>
        Third <if> is working for beauty, it set * after <n>

        The most amazing starts next. 
        res = n * recursionFactorial(n-1);
        in this line we say, 
        that result will be n(our number) * our method(n-1)
        That means, that somewhere in memory starts to work second method
        (but first will wait until it stops). Second method will work in same way
        It will call third method and will wait until it stops his work > and
        again > and again, until our method is ignoring first <if>. But
        when we call out method(0) method will return result without next recursion
        The result will be the number in line <recursionFactorial(n-1);> and after
        that, that line can be closed(n*result of last method) > AND AGAIN > AND AGAIN
        until out first method will take result from second and close the line.

        The algorithms like that are (O = !n) (! - factorial). They are the
        slowest algorithms, but thats the only algorithm can solve <traveling salesman>
        question. 
        
        They are(recursion methods) slow and cost much memory,
        but its really easy to write them

        We can say that recursion methods are using stack.
        What does stack means? Stack its some kind of list, where we
        can put new items and remove old items.
        When we call recusion method for the first time we create first step
        of stack, after that put second-third e.t.c and then, last step will wait
        for final result, previous step will wait for result of last e.t.c(if you
        don't understand - put your eyes(in the asshole) closer and higher in the
        text.)
        */
        
    }
    /*public static void recursionFucn() {
        System.out.println("Привет, JavaRush!");
        recursionFucn();
    }
    
    In recursion methods we need to set two cases
    basic and recursion. Basic - it is what programm
    should do to end cycle. Recursion - it's what programm
    should do and after that call this.method(basic recursion method)

    This code have only recursion part, and because of that, programm
    don't know what to do to stop this endless cycle of pain.

    Why we need to use recursion methods? Answer is easy, because they are
    very easy to code and quite small. But they have one negative aspect. 
    Usually, they are really slower, then basic cycle.
    */
}
