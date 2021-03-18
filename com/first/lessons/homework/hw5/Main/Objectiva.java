package com.lessons.homework.hw5.Main;
import com.lessons.homework.hw5.Objects.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Objectiva {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        extracted(reader);

        Robot robot1 = new Robot();
        Robot robot2 = new Robot("LEHA", 12, 9001);

        System.out.println("Введите имя первому роботу");
        robot1.setName(reader.readLine());
        System.out.println("Введите возраст первого робота");
        robot1.setAge(Integer.parseInt(reader.readLine()));
        System.out.println("Введите мощность первого робота");
        robot1.setPower(Integer.parseInt(reader.readLine()));

        

        int a = robot1.getPower();
        int b = robot2.getPower();
        robot1.fight(a, b);
    }

    private static void extracted(BufferedReader reader) throws IOException {

    }
}
