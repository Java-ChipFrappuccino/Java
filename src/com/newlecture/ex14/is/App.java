package com.newlecture.ex14.is;

import com.newlecture.ex14.reuse.Exam;

public class App {
    public static void main(String[] args) {
        Exam exam = new Exam();
        System.out.println(exam);
//        System.out.println(exam.toString());
        
        NewlecExam newlecExam = new NewlecExam();
        newlecExam.setKor(100);
        newlecExam.setCom(90);
        System.out.println(newlecExam.total());
        System.out.println(newlecExam.avg());
        
       PaintFrame win = new PaintFrame();
       win.setVisible(true);
    }
}