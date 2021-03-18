package com.lessons.homework.hw8.Tools;

public class Human {
    private String name;
    //private boolean sex;
    private int age;
    private Human father;
    private Human mother;

    public Human() {

    }

    public Human(String name, int age, Human father, Human mother) {
        this.name = name;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

   

    public int getAge() {
        return age;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }


    @Override
    public String toString() {
        return ("Имя: " + this.getName() + " Возраст: " + 
        this.getAge() + " Отец: " + this.father.getName() 
        + " Мать: " + this.mother.getName());
    }

    
}
