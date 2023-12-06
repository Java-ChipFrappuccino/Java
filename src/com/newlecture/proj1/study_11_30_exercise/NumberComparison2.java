package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class NumberComparison2 {
    public static void main(String[] args) {
        //        이 문제는 NumberComparison1과 이어집니다
//        뉴렉이가 이번엔 옆집 과일 가게를 방문했어요.
//        이번엔 반드시 삼항 연산자를 이용하여 프로그램을 작성해주세요
//        입력:
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
        int heavyApple = (leftHand < rightHand) ? rightHand : leftHand;
        if (leftHand == rightHand) {
            System.out.println("둘다 사야겠다");
        } else if (heavyApple == rightHand) {
            System.out.println("오른쪽 사과를 사야겠다");
        } else if (heavyApple == leftHand) {
            System.out.println("왼쪽 사과를 사야겠다");
        }
    }
}
