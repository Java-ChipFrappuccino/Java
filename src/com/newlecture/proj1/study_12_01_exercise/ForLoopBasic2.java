package com.newlecture.proj1.study_12_01_exercise;

public class ForLoopBasic2 {
    public static void main(String[] args) {
//        for문을 이용하여 1부터 10이하의 정수 중 짝수만 출력하는 프로그램을 작성하세요
//
//        출력:
//
//        2
//        4
//        6
//…
//        10
        for (int i = 0; i < 10; i++) {
            if ((i+1)%2 == 0) {
                System.out.println(i+1);
            }
        }
    }
}
