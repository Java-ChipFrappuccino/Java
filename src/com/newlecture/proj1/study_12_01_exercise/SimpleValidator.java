package com.newlecture.proj1.study_12_01_exercise;

import java.util.Scanner;

public class SimpleValidator {
    public static void main(String[] args) {
//        do-while문을 이용하여 뉴렉이가 1을 입력할때까지 입력을 다시받는 유효성 검사 프로그램을 작성해주세요
//
//
//        입출력 예:
//
//        1을 입력해!
//
//                3
//
//        1을 입력해!
//
//                3
//
//        1을 입력해!
//
//                3
//
//        1을 입력해!
//
//                1
//
//        잘했어
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("1을 입력해!\n");
            num = scanner.nextInt();
            System.out.println();
            if (num == 1) {
                System.out.println("참 잘했어요");
            }

        } while (!(num == 1));
    }
}
