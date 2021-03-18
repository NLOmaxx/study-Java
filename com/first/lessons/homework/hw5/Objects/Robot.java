package com.lessons.homework.hw5.Objects;

public class Robot {
    private String name;
    private int age;
    private int power;

    public Robot() {

    }

    public void fight(int power1, int power2) {
        if(power1 > power2)
            System.out.println("Победил первый робот");
            else if (power2 > power1)
            System.out.println("Победил второй робот");
            else
            System.out.println("Ничья");
    }

    public Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }


    public int getAge() {
        return age;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }



}