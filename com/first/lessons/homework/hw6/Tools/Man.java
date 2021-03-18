package com.lessons.homework.hw6.Tools;

public class Man {
    private String name;
    private int age;
    private String wife;

    public Man(){

    }

    public Man(String name, int age, String wife){
        this.name = name;
        this.age = age;
        this.wife = wife;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWife() {
        return wife;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }
}

