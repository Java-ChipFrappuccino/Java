package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class NumberComparison1 {
    public static void main(String[] args) {
        //        뉴렉이는 손으로 과일의 무게를 가늠할 수있는 신기한 능력이 있어요.
//                과일가게에 온 뉴렉이는 더 무거운 사과를 고르려고해요. 뉴렉이가 과일을 고르는 프로그램을 작성해주세요.
//                입력:
//        왼손에는
//        4
//        오른손에는
//        11
//        출력:
//        오른쪽 사과를 사야겠다
//        입력:
//        왼손에는
//        100
//        오른손에는
//        33
//        출력:
//        왼쪽 사과를 사야겠다
        Scanner scanner = new Scanner(System.in);
        int leftHand, rightHand;
        System.out.println("양손에 있는 사과의 무게를 가늠해보세요");
        System.out.print("왼손에는? _> ");
        leftHand = scanner.nextInt();
        System.out.print("오른손에는? _> ");
        rightHand = scanner.nextInt();
        if (leftHand == rightHand) {
            System.out.println("둘다 사야겠다");
        } else if (leftHand < rightHand) {
            System.out.println("오른쪽 사과를 사야겠다");
        } else if (rightHand < leftHand) {
            System.out.println("왼쪽 사과를 사야겠다");
        }
    }
}
