package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        //        심심한 뉴렉이는 홀짝 게임을 하려고해요. 숫자를 입력하면 짝수인지,
        //        홀수인지 출력해주는 출력하는 프로그램을 만들어 뉴렉이를 심심하지 않게 해주세요.
//        입력: 3
//        출력: 홀수입니다
//        입력: 10
//        출력: 짝수입니다
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력: ");
        int num = scanner.nextInt();
        if (num % 2 == 1) {
            System.out.println("홀수입니다");
        } else if (num % 2 == 0) {
            System.out.println("짝수입니다");
        }
    }
}
