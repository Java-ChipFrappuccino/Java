package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class SmarParrot {
    public static void main(String[] args) {
        //        뉴렉이네 앵무새는 시간에 대한 개념이 있는 똑똑한 앵무새에요
//        만약 현재시각이 오전이라면 “안녕 햇빛아!”를 말하고,
//        현재시각이 오후라면 “안녕 달아!”를 말해요.
//        현재 시각을 입력받아 뉴렉이네 앵무새가 무엇을 대답할지 출력하는 프로그램을 작성해주세요
//        (입력 값의 범위는 0000~2359로 제한됩니다)
//        입력: 0700
//        출력: 안녕 햇빛아!
//                입력: 1311
//        출력: 안녕 달아!
//                입력: 2359
//        출력: 안녕 달아!
//                입력: 0000
//        출력: 안녕 햇빛아!
        Scanner scanner = new Scanner(System.in);
        System.out.println("현재시각을 입력해주세요 (0000~2359)");
        System.out.print("입력: ");
        int time = scanner.nextInt();
        if (0000 <= time && time <= 1159) {
            System.out.println("안녕 햇빛아!");
        } else if (1200 <= time && time <= 2359) {
            System.out.println("안녕 달아!");
        } else if (!(0000 <= time && time <= 2359)) {
            System.out.println("잘못된 입력입니다");
        }

    }
}
