package com.lessons.lesson07;

public class User {
    private int age;
    private String name;
    private int passport;

    public User(int age, String name, int passport) {
        this.age = age;
        this.name = name;
        this.passport = passport;
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getPassport() {
        return passport;
    }
    public void talk(String text) {
        System.out.println(text);
    }
}
