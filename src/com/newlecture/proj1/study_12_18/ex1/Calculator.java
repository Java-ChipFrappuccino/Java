package com.newlecture.proj1.study_12_18.ex1;

public class Calculator {
    public int x;
    public int y;
    int result;

    public void add() {
        result = x + y;
    }

    private void setX(int x) {
        this.x = x;
    }

    private void setY(int y) {
        this.y = y;
    }

    private void print() {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        calc1.setX(3);
        calc1.setY(4);
        calc1.add();
        calc1.print();
        calc1.setX(5);
        calc1.setY(6);
        
    }
}