package com.lessons.homework.hw7.First;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import com.lessons.calc.tools.Minimalist;
import java.io.IOException;

public class Array {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        extracted(reader);
        initializeArray();






       /* for(int temp = 0; temp < 10; temp++) {
            System.out.println(" ");
            for (int i = 0; i < 10; i++) {
                if (i <= temp){
                    System.out.print("8");
                } 
                
            }*/








           /* for (int j = 0; j < 1; j++) {
                System.out.print("8");
            }
            System.out.println(" ");
            for (int k = 0; k < 2; k++) {
                System.out.print("8");
            }
            System.out.println(" ");
            for (int e = 0; e < 3; e++) {
                System.out.print("8");
            }
            System.out.println(" ");
            for (int r = 0; r < 4; r++) {
                System.out.print("8");
            }
            System.out.println(" ");
            for (int t = 0; t < 5; t++) {
                System.out.print("8");
            }
            System.out.println(" ");
            for (int y = 0; y < 6; y++) {
                System.out.print("8");
            }
            System.out.println(" ");
            for (int u = 0; u < 7; u++) {
                System.out.print("8");
            }
            System.out.println(" ");
            for (int o = 0; o < 8; o++) {
                System.out.print("8");
            }
            System.out.println(" ");
            for (int w = 0; w < 9; w++) {
                System.out.print("8");
            }
            System.out.println(" ");
            for (int q = 0; q < 10; q++) {
                System.out.print("8");
            }*/
        }






        /*int[] arr123 = new int[]{1, 2, 4, 3, 1, 8, 9, 11, 2, 7};
        int res = max(arr123);
        System.out.println(res);*/
    





    /*public static int max(int[] arr123) {
        int res = arr123[0];      
        for (int i = 0; i < arr123.length; i++){
            if (arr123[i] > res) {
                res = arr123[i];
            }
        }
        return res;
    }*/
   
        

        /*int[] arr1 = new int[]{232, 2414, 643, 123, 45};
        int res = Minimalist.minFive(arr1[0], arr1[1], arr1[2], arr1[3], arr1[4]);
        System.out.println(res);*/
        
        /*int res = arr1[0];
        for (int i=1; i < arr1.length; i++) {
            res = res + arr1[i];
        }
        System.out.println(res);*/

        


        //int[] arr = new int[5];
        //String[] array = new String[5];
        /*for(int i=0; i < array.length; i++) {
            array[i] = reader.readLine();            
        }
        for(int i=0; i < array.length; i++) {
           System.out.print(array[i] + " ");            
        }*/
        /*for(int i=0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());            
        }
        for(int i=0; i < arr.length; i++) {
        System.out.println(arr[i]);
        }*/
        /*for(int i=0; i < arr.length; i++) {
            arr[i] = i+1;
            System.out.println(arr[i]);
        }*/

        /*for(int i=0; i < arr.length; i++) {
            arr[i] = 10-i;
            System.out.println(arr[i]);
        }*/
        /*for(int i=0; i < arr.length; i++) {
            arr[i] = 10+i;
            System.out.println(arr[i]);
        }*/
        /*for(int i=0; i < arr.length; i++) {
            arr[i] = 29-i;
            System.out.println(arr[i]);
        }*/

    

    private static void extracted(BufferedReader reader) throws IOException {
    }

    public static void initializeArray() throws IOException {
        int[] arraylist = new int[10];
        arraylist = writer(arraylist);
        for (int i = 0; i < arraylist.length; i++){
            System.out.println(arraylist[i]);
        }
    } 

    public static int[] writer(int[] arr) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//дублируем хуесоса
        extracted(reader); //внедряем хуесоса читалку
        int[] res = new int[10]; //создаем массив, который будем выводить
        for (int j = 0; j < res.length; j++) { //пока длина массива не закончится, вводим с консоли
        res[j] = Integer.parseInt(reader.readLine()); //ввод с консоли
        }
    return res; //выкидываем хуесоса в то место, откуда призвали(а нахуя вообще тогда нам инициализатор?)
    //ладно, верхний метод нахуй не нужен, пора смириться с этим
    //но я не могу. Я привязался к нему как к родному
    //и так и не понял, что было не так с предыдущим
    }
}
