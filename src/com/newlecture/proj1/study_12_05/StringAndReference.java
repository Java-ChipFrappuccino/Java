package com.newlecture.proj1.study_12_05;

public class StringAndReference {
    public static void main(String[] args) {
        String name1 = "Tom";
        String name2 = "Tom";
        String name3 = new String("Tom");

        System.out.println("name1 vs name2");
        System.out.println(name1 == name2);             //같다
        System.out.println(name1.equals(name2));        //같다
        System.out.println(name1 == "Tom");             //같다

        System.out.println("name1 vs name3");
        System.out.println(name1 == name3);             //다르다
        System.out.println(name1.equals(name3));        //같다
        System.out.println(name3 == "Tom");             //다르다

    }
}
