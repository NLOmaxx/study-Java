package com.lessons.calc.main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import com.lessons.calc.tools.*;


public class Calc {
    public static void main(String[] args) throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        extracted(reader);
        
        
        System.out.println("Добро пожаловать в Калькулятор");
        System.out.println(" ");
        System.out.println("Copyrited NightmareLab");
        System.out.println(" ");
        int num3 = 0;
        int num4 = 0;
        int num1 = 0;
        int num2 = 0;
        int op = 0;
        int res = 0;
        int temp = 0;

        System.out.println("Введите первое число");
        num1 = Integer.parseInt(reader.readLine());

        while (op!=8) {

            ChooseOp.chooseOp();
            op = Integer.parseInt(reader.readLine());

            if (op == 8) {
                break;
            }

            System.out.println("Введите второе число число");
            num2 = Integer.parseInt(reader.readLine());

            if (op == 1)
            res = Ariphm.sum(num1, num2);
            if (op == 2)
            res = Ariphm.minus(num1, num2);
            if (op == 3)
            res = Ariphm.mult(num1, num2);
            if (op == 4)
            res = Ariphm.div(num1, num2);
            if (op == 5)
            res = Minimalist.minTwo(num1, num2);
            if (op == 6) {
            System.out.println("Для продолжения операции, введите третье число");
            num3 = Integer.parseInt(reader.readLine());
            res = Minimalist.minThree(num1, num2, num3);
            }

            if (op==7) {
            System.out.println("Для продолжения операции, введите третье число");
            num4 = Integer.parseInt(reader.readLine());
            res = Minimalist.middle(num1, num2, num4);
            }
        temp = res;
        num1 = temp;
        System.out.println();
        System.out.println(res);
        
        }
    }

    private static void extracted(BufferedReader reader) throws IOException {
        
    }

}
