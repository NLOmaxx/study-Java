package com.lessons.lesson09;

import java.util.*;
//collections
public class Main {
    public static void main(String[] args) {
        //int[] arr = new int[4];//array have fixed number of indexes
        //String[] arrstr = new String[7];
        //arrstr[0] = "str";

        //collections doesnt have any limit
        List<String> list = new ArrayList<>();//list save repeating obj
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("str6");
        list.add("str7");
        list.add("str8");
        //System.out.println(list);
        //if we delete <> we can use ant type of variables

        Set<Integer> set = new HashSet<>();//set doesnt save repeating obj
        set.add(12);
        set.add(21);
        set.add(12);
        set.add(43);
        set.add(12);
        System.out.println(set);

        Map<Integer, String> map = new HashMap<>();//map - key and value
        //(doesnt save repeating obj)
        map.put(1, "str1");
        map.put(2, "str2");
        map.put(3, "str3");
        map.put(4, "str3");
        map.put(5, "str5");
        System.out.println(map);

    }
}