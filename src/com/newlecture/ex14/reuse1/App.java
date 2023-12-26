package com.newlecture.ex14.reuse1;

import com.newlecture.ex14.reuse1.Exam;

public class App {
    public static void main(String[] args) {
        Exam exam = new Exam();
        System.out.println(exam);
        System.out.println(exam.toString());
        System.out.println(exam.total());
        System.out.println(exam.avg());
        

    }
}
