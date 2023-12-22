package com.newlecture.entity;

public class Exam {
    private int kor;
    private int eng;
    private int math;

    public Exam() {
        kor = 10;
        eng = 20;
        math = 30;
    }

    public String toString() {
        String x = "[kor=" + this.kor + ",eng=" + this.eng + ",math=" + this.math + "]";
        return x;
    }
}
