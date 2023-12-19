package com.newlecture.proj1.study_12_18.ex1;

public class App {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        calc1.setX(3);
        calc1.setY(4);
        calc1.add();
//        calc1.x = 1;
        calc1.print();
        calc1.setX(5);
        calc1.setY(6);
    }
}
