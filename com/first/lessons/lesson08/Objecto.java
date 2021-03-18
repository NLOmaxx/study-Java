package com.lessons.lesson09;

public class Objecto {
    public static void main(String[] args) { 
        User user = new User(); //extends Object
        System.out.println(user.toString()); //строчное представление объекта. 
        //Хеш-код - ячейка памяти, где хранится объект
        User user1 = new User();
        System.out.println(user1.toString());
        System.out.println(user.equals(user1));
        user1 = user;
        System.out.println(user.equals(user1));
        System.out.println(user.toString());
        System.out.println(user1.toString());
    }
}
