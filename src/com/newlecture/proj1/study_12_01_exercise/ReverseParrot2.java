package com.newlecture.proj1.study_12_01_exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ReverseParrot2 {
    public static void main(String[] args) throws IOException {
//        뉴렉이네 앵무새는 숫자를 말해주면 거꾸로 말하는 앵무새에요.
//
//                예를 들어 12345를 말하면 54321을 말해요. 뉴렉이네 앵무새를 구현해보세요
//
//
//        입력: 12345
//
//        출력: 54321
//
//        입력: 32456
//        출력: 65423
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("숫자를 입력하세요");
        System.out.print("입력: ");
        number = scanner.nextInt();
        System.out.print(number % 10);
        System.out.print(number / 10 % 10);
        System.out.print(number / 100 % 10);
        System.out.print(number / 1000 % 10);
        System.out.print(number / 10000 % 10);


//        while (number % 10) {
//
//        }
//        number%10


//        String number;
//        int length;
//
//        System.out.println("숫자를 입력하세요");
//        System.out.print("입력: ");
//
//        number = scanner.nextLine(); //문자열로 값 입력
//        length = number.length(); //입력된 값의 인덱스값 저장
//
//        // 인덱스값만큼 반복하면서 맨뒤 인덱스부터 맨앞 인덱스까지 한글자씩 잘라서 출력
//        for (int i = 0; i < length; i++) {
//            String reverse = number.substring(length-(i+1),length-i);
//            System.out.print(reverse);
//        }
    }
}