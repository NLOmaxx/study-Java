package com.lessons.lesson02;
import com.lessons.lesson01.*;
//через объекты нельзя вызывать статические методы, только через класс

public class ObjectsAndLinks {
    public static void main(String[] args) {
        int res = Summary.sum(4, 5);
        System.out.println(res);

        User user = new User();
        user.name = "Arkady";
        user.age = 13;
        

        User user1 = new User();
        user1.name = "Semen";
        user1.age = 15;
        user.talk("aaaaaaaaaaaa");
        

        System.out.println(user1.name +" " + user.name);
    }
  
}
