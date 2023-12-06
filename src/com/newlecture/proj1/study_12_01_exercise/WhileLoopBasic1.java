package com.newlecture.proj1.study_12_01_exercise;

public class WhileLoopBasic1 {
    public static void main(String[] args) {
//        while 문은 참/거짓 비교, 반복을 할꺼냐 안할꺼냐이고 for문은 반복을 할껀데 특정 조건을 만족할때까지만 반복해줘

//        while문을 이용하여 1부터 100까지의 합을 출력하는 프로그램을 작성하세요
//
//        출력: 5050
        int i = 0;
        int total = 0;
        while (i<100) {
            i++;
            total += i;
        }
        System.out.println("총합은 "+ total + "입니다");
    }
}
