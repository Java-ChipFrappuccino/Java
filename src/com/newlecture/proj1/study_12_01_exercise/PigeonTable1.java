package com.newlecture.proj1.study_12_01_exercise;

import java.util.Scanner;

public class PigeonTable1 {
    public static void main(String[] args) {
//        for문을 이용하여 하나의 숫자를 입력받아
//        해당 숫자의 구구단을 출력하는 프로그램을 작성하세요
//
//        입력: 2
//        출력:
//        2 x 1 = 2
//        2 x 2 = 4
//        2 x 3 = 6
//        2 x 4 = 8
//…
//
//        2 x 9 = 18
        Scanner scanner = new Scanner(System.in);
        System.out.println("구구단을 외자");
        System.out.print("몇단을 외울까요? >");
        int num = scanner.nextInt();
        for (int i = 0; i < 9; i++) {
            System.out.println(num + " x " + (i + 1) + " = " + (num * (i + 1)));
        }
    }
}
