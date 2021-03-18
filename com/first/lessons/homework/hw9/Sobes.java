package com.lessons.homework.hw9;
import java.util.Arrays;

public class Sobes {
        public static void main(String[] args) {
            int[] exp = new int[4];//создаем массив в котором будет
            exp[0] = 1;//пропущено число
            exp[2] = 3;
            exp[3] = 2;

            Arrays.sort(exp); //сортируем массив по возрастанию, тем
            int[] temp = new int[exp.length];//самым мы получаем последовательность
            for(int t = 0; t < temp.length; t++) {//с двумя нулями в начале
                temp[t] = t;//здесь мы вводим значения в переменную темп
            }


            if (temp[0] == exp[0] & temp[1] == exp[1]){//сравниваем на тот случай
                System.out.println("Пропущенное число: " + "0");//если пропущенное
            } else {//число - 0
                for(int f = 0; f < temp.length; f++) {//сравниваем каждую ячейку                
                    if (temp[f] != exp[f]) {//с каждой и находим пропуск
                        System.out.println("Пропущенное число: " + f);
                    }
                }
            }

            


            for (int i = 0; i < exp.length; i++) {
                System.out.println(exp[i]);

            }
        }
    }