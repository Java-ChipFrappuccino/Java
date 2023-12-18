package com.newlecture.proj1.study_12_18.ex2;

public class Calculator {
    public int x;
    public int y;
    int result;

//    public void add() {
//        result = x + y;
//    }
//
//    private void setX(int x) {
//        this.x = x;
//    }
//
//    private void setY(int y) {
//        this.y = y;
//    }
//
//    private void print() {
//        System.out.println(result);
//    }

    static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public static void main(String[] args) {
//        Calculator calc1 = new Calculator();
//        calc1.setX(3);
//        calc1.setY(4);
//        calc1.add();
//        calc1.print();
//        calc1.setX(5);
//        calc1.setY(6);

        int result;
        result = Calculator.add(3, 4);
        System.out.println(result);
        result = Calculator.add(5, 6);
        System.out.println(result);
        result = add(9,9);
        System.out.println(result);

    }
}