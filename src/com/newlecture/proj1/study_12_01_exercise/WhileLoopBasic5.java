package com.newlecture.proj1.study_12_01_exercise;

public class WhileLoopBasic5 {
    public static void main(String[] args) {
//        while문을 이용하여 1부터 100까지의 수 중 3의 배수 또는 5의 배수를 출력하는 프로그램을 작성하세요
        int i = 0;
        while (i < 100) {
            i++;
            if (i % 3 == 0) {
                System.out.println("3의 배수: " + i);
            } else if (i % 5 == 0) {
                System.out.println("\t\t\t\t5의 배수: " + i);
            }
        }
    }
}