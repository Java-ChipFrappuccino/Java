package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class RecommendOutfit {
    public static void main(String[] args) {
        //        뉴렉이 방에 있는 옷장은 현재 날씨에 따라 옷차림을 추천해준다고해요.
//                현재 온도가 영하라면 패딩을,
//                0 ~ 9도라면 코트를,
//        10 ~ 19도라면 긴팔과 아우터를,
//                20도 이상이라면 반팔을 추천해준다고해요.
//        옷장 프로그램을 작성해주세요
//        입력: -3
//        출력: 패딩
//        입력: 33
//        출력: 반팔
//        입력: 11
//        출력: 긴팔과 아우터
        Scanner scanner = new Scanner(System.in);
        System.out.println("온도를 입력해주세요");
        System.out.print("입력: ");
        int temperature = scanner.nextInt();
        if (temperature <= -1) {
            System.out.println("패딩");
        } else if (0 <= temperature && temperature <= 9) {
            System.out.println("코트");
        } else if (10 <= temperature && temperature <= 19) {
            System.out.println("긴팔과 아우터");
        } else if (20 <= temperature) {
            System.out.println("반팔");
        }
    }
}
