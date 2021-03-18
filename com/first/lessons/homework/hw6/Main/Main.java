package com.lessons.homework.hw6.Main;
import com.lessons.homework.hw6.Tools.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        extracted(reader);


        Woman ira = new Woman();
        Man sema = new Man();

        //Cat sandra = new Cat();
        //Cat sandra1 = new Cat();
        Fish bob = new Fish();
        //Dog pidrila = new Dog();
        System.out.println("Введите имя мужчины");
        sema.setName(reader.readLine());
        System.out.println("Введите имя женщины");
        ira.setName(reader.readLine());

        System.out.println("Введите имя котеньки");
        bob.setName(reader.readLine());
        bob.setOwner(sema.getName());
        System.out.println("Riba " +bob.getName()+" имеет владельца " + bob.getOwner());

        bob.setName(reader.readLine());
        bob.setOwner(ira.getName());
        System.out.println("Котька " +bob.getName()+" имеет владельца " + bob.getOwner());

       /*
        ira.setHusband(sema.getName());
        System.out.println();
        System.out.println("Муж " + ira.getName() +" - " + ira.getHusband());

        sema.setWife(ira.getName());
        System.out.println();
        System.out.println("Жена " + sema.getName() +" - " + sema.getWife());*/
    }

    private static void extracted(BufferedReader reader) throws IOException {

    }
}
