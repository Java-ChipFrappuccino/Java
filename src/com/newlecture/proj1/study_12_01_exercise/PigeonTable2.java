package com.newlecture.proj1.study_12_01_exercise;

import java.util.Scanner;

public class PigeonTable2 {
    public static void main(String[] args) {
//        for문을 이용하여 2부터 9까지의 구구단을 출력하는 프로그램을 작성하세요
//
//        출력:
//        2 x 1 = 2
//        2 x 2 = 4
//…
//        2 x 9 = 18
//        3 x 1 = 3
//        3 x 2 = 6
//…
//        9 x 8 = 72
//        9 x 9 = 81

//        for (int i = 0; i < 9; i++) {
//            System.out.println(num + " x " + (i + 1) + " = " + (num * (i + 1)));
//        }
        for (int i = 0; i < 8; i++) {
            System.out.println();
            for (int j = 0; j < 9; j++) {
                System.out.println((i + 2) + " x " + (j + 1) + " = " + ((i + 2) * (j + 1)));
            }
        }
    }
}
