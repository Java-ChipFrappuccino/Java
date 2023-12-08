package com.newlecture.ex09.code01;

public class TestApp {
    public static void main(String[] args) {
        Exam exams = new Exam();
        Cat cat1 = new Cat(); // cat1 변수에 Cat객체 참조시킴**

        cat1.age = 1; // 참조하고있는 객체의 age값에 1을 대입함**

        Cat cat2 = new Cat(); // cat2 변수에 Cat객체 참조시킴**

        cat2.age = 3; // 참조하고있는 객체의 age값에 3을 대입함**

        Cat cat3 = null; // cat3 변수에 아무것도 참조시키지않음 (이름만 생성) ? null을 참조?**
        System.out.println(cat3);

        Cat cat4;
        System.out.println(cat2);
        cat2 = cat3; // 참조하는 객체가 다르다**
        System.out.println(cat2);

        if (cat1 != null) { // cat1이 무언가를 참조하고 있다면**

            System.out.println(cat1.age); // 참조하고있는 객체의 age값을 출력 . 1**

            if (cat2 != null) { // cat2가 무언가를 참조하고 있다면**

                System.out.println(cat2.age); // 참조하고있는 객체의 age값을 출력 . 3**
            }
        }
    }
}
