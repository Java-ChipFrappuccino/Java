package com.newlecture.proj1.study_12_01_exercise;

public class Asterisk3 {
    public static void main(String[] args) {
//        for문을 이용하여 높이가 5이인 크리스마스 트리를
//        출력하는 프로그램을 작성하세요
//        출력:
//
//       *
//      ***
//     *****
//    *******
//   *********
//        for (int i = 0; i < 9; i++) {
//            if (i == 4) {
//                System.out.print("*");
//            }
//            System.out.print(" ");
//        }
//        System.out.println();
//        for (int i = 0; i < 9; i++) {
//            if (5 >= i && i >= 3) {
//                System.out.print("*");
//                continue;
//            }
//            System.out.print(" ");
//        }
        for (int i = 0; i < 5; i++) {
            for (int m = 0; m + i < 4; m++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
