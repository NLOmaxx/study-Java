package com.lessons.homework.hw6.Tools;

public class Woman {
    private String name;
    private int age;
    private String husband;


    public Woman() {

    }

    public Woman(String name, int age, String husband){
        this.name = name;
        this.age = age;
        this.husband = husband;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHusband() {
        return husband;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHusband(String husband) {
        this.husband = husband;
    }
}