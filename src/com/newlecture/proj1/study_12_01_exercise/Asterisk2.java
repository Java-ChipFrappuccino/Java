package com.newlecture.proj1.study_12_01_exercise;

public class Asterisk2 {
    public static void main(String[] args) {
//        for문을 이용하여 높이가 5이며 좌우가 뒤집힌 별(*)
//        피라미드를 출력하는 프로그램을 작성하세요
//        출력:
//
//       *
//      **
//     ***
//    ****
//   *****
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
