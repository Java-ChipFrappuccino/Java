package com.newlecture.proj1.study_12_01_exercise;

public class WhileLoopBasic4 {
    public static void main(String[] args) {
//        while문을 이용하여 1부터 100까지 짝수의 합을 출력하는 프로그램을 작성하세요
        int i = 0;
        int total = 0;
        while (i < 100) {
            i++;
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println("1부터 100까지 짝수의 합: " + total);
    }
}
