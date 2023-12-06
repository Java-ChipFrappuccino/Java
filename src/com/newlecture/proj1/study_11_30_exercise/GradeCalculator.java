package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        //        뉴렉이의 성적을 입력받아 성적을 출력해주는 프로그램을 작성해주세요
//        90점 이상이라면 A
//        80점 이상이라면 B
//        70점 이상이라면 C
//        60점 이상이라면 D
//        그 미만이라면 F에요
//
//        입력: 88
//        출력: B입니다
//        입력: 55
//        출력: F입니다
        Scanner scanner = new Scanner(System.in);
        System.out.println("성적을 입력해주세요");
        System.out.print("입력: ");
        int grade = scanner.nextInt();
        if (90 <= grade && grade <= 100) {
            System.out.println('A');
        } else if (80 <= grade && grade < 90) {
            System.out.println('B');
        } else if (70 <= grade && grade < 80) {
            System.out.println('C');
        } else if (60 <= grade && grade < 70) {
            System.out.println('D');
        } else if (0 <= grade && grade < 60) {
            System.out.println('F');
        } else if (!(0 <= grade && grade <= 100)) {
            System.out.println("잘못된 입력입니다");
        }
    }
}
