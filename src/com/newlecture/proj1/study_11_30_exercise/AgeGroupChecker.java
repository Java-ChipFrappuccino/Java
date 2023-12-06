package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class AgeGroupChecker {
    public static void main(String[] args) {
        //        보건소에서 설문조사 알바를 하는 뉴렉이는 방문자의 연령에 따른 인구를 분류하는 일을 담당하고 있습니다.
//                방문자가 많아 정신이 없을 뉴렉이를 위해 나이를 입력받아 아이인지, 청소년인지, 성인인지,
//                노인인지 출력하는 프로그램을 작성해주세요.
//        13세 이하라면 아이, 13세~18세라면 청소년, 19세~64세라면 성인, 65세 이상이라면 노인이에요
//        입력: 1
//        출력: 아이입니다
//        입력: 33
//        출력: 성인입니다
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력해주세요");
        System.out.print("입력: ");
        int choice = scanner.nextInt();
        if (choice <= 13) {
            System.out.println("아이 입니다");
        } else if (14 <= choice && choice <= 18) {
            System.out.println("청소년 입니다");
        } else if (19 <= choice && choice <= 64) {
            System.out.println("성인 입니다");
        } else if (65 <= choice) {
            System.out.println("노인 입니다");
        }
    }
}
