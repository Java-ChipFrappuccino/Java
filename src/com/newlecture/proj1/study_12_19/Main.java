package com.newlecture.proj1.study_12_19;

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class Main {
    public static void main(String[] args) {
        int x = 10;
        int[] y = {2, 3, 4};
        Cat cat1 = new Cat("고양이1");
        Cat cat2 = new Cat("고양이2");


        // 함수 실행
        foo(x, y, cat1, cat2);
//        10
//                3
//                        고양이1
//                                이름 바뀐 고양이2

        // 어떤 결과가 출력될 것 같은지 혹은 값이 어떻게 변할지 맞춰보세요
        System.out.println("x = " + x); // 1
        System.out.println("y = " + y[0]); // 2
        System.out.println("cat1.name = " + cat1.getName()); // 3
        System.out.println("cat2.name = " + cat2.getName()); // 4
    }


    public static void foo(int x, int[] y, Cat cat1, Cat cat2) {
        x++;
        y[0]++;
        cat1 = new Cat("이름 바뀐 고양이1");
        cat2.setName("이름 바뀐 고양이2");
    }
}