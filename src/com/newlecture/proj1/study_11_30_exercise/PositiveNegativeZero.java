package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        //        콘솔로 숫자를 입력받아 양수인지, 음수인지, 0인지 출력하는 프로그램을 작성하세요.
//        만약, 입력된 값이 숫자가 아닐 경우  “유효하지 않은 값입니다"라는 메세지를 콘솔에 출력하세요.
//        입력 : 3
//        출력: 양수입니다
//        입력: -3
//        출력: 음수입니다
//        입력: 0
//        출력: 0입니다
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력: ");
        int number = scanner.nextInt();
        if (0 < number) {
            System.out.println("양수입니다");
        } else if (number < 0) {
            System.out.println("음수입니다");
        } else {
        	System.out.println("0 입니다");
        }
    }
}
