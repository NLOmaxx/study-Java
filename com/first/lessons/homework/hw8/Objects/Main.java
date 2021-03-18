package com.lessons.homework.hw8.Objects;
import com.lessons.homework.hw8.Tools.*;

public class Main {
    public static void main(String[] args) {
        Human hum1 = new Human();
        Human hum2 = new Human();

        Human grmother1 = new Human("Klava", 96, hum1, hum2);   
        Human grmother2 = new Human("Natasha", 78, hum1, hum2);
        Human grfather1 = new Human("Denis", 91, hum1, hum2);
        Human grfather2 = new Human("Pidor", 100, hum1, hum2);

        Human father = new Human("Gay", 50, grfather1, grmother1);
        Human mother = new Human("Tetrarx", 48, grfather2, grmother2);

        Human daughter = new Human("Dusya", 2, father, mother);
        Human son = new Human("Hueputalo", 30, father, mother);
        

        System.out.println(grmother1.toString());
        System.out.println(grmother2.toString());
        System.out.println(grfather1.toString());
        System.out.println(grfather2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(daughter.toString());
        System.out.println(son.toString());
    }
}
