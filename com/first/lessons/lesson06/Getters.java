package com.lessons.lesson07;

public class Getters {
    public static void main(String[] args) {
        User user = new User(5, "Alex", 66);
        User user1 = new User(5, "Alex");

        System.out.println(user.getName()); //выводим имя первого выблядка
        user.setName("Suka blyat");//меняем имя первого уебана
        System.out.println(user.getName());//выводим измененное имя первого выблядка

        System.out.println(user1.getName());//выводим имя второго выблядка
        user1.setName("OOOOOO");//меняем имя второго уебана
        System.out.println(user1.getName());//выводим измененное имя второго выблядка
    }
    
    


}


