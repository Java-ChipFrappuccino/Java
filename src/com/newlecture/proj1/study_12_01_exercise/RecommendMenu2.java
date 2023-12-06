package com.newlecture.proj1.study_12_01_exercise;

import java.io.IOException;
import java.util.Scanner;

public class RecommendMenu2 {
    public static void main(String[] args) throws IOException {
//        뉴렉이의 메뉴 추천을 위해 만든 프로그램을 사용한 뉴렉이는 매우 만족했어요.
//
//        그런데 모든 메뉴가 궁금했던 뉴렉이는 모든 메뉴를 확인하기 위해 계속 프로그램을 재실행해야만 했어요.
//
//                뉴렉이가 힘들지않게 계속해서 입력할 수 있는 프로그램을 만들어주세요.
//
//        1이면 “떡볶이", 2이면 “어묵", 3이면 “순대”, 4이면 “튀김”, 5이면 “핫도그”를 출력하고 6이면 프로그램이 종료되도록 해주세요.
//
//        입력: 1
//
//        떡볶이
//
//        입력: 3
//
//        순대
//
//        입력: 6
//
//        메뉴 추천 프로그램이 종료되었습니다.
        Scanner scanner = new Scanner(System.in);
        boolean onOff = true;

        while (onOff) {
            System.out.println("메뉴추천은 1 ~ 5중에 한가지를 입력해주세요");
            System.out.println("프로그램을 종료하려면 6을 입력해주세요");
            System.out.print("입력: ");
            int choice = scanner.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("떡볶이\n");
                    System.out.println("메인화면으로 돌아가시려면 아무키나 눌러주세요 >_");
                    System.in.read();
                    break;
                case 2:
                    System.out.println("어묵\n");
                    System.out.println("메인화면으로 돌아가시려면 아무키나 눌러주세요 >_");
                    System.in.read();
                    break;
                case 3:
                    System.out.println("순대\n");
                    System.out.println("메인화면으로 돌아가시려면 아무키나 눌러주세요 >_");
                    System.in.read();
                    break;
                case 4:
                    System.out.println("튀김\n");
                    System.out.println("메인화면으로 돌아가시려면 아무키나 눌러주세요 >_");
                    System.in.read();
                    break;
                case 5:
                    System.out.println("핫도그\n");
                    System.out.println("메인화면으로 돌아가시려면 아무키나 눌러주세요 >_");
                    System.in.read();
                    break;
                case 6:
                    System.out.println("프로그램 종료");
                    onOff = false;
                    break;
                default:
                    System.out.println("유효한 숫자의 범위가 아닙니다\n");
                    System.out.println("메인화면으로 돌아가시려면 아무키나 눌러주세요 >_");
                    System.in.read();
                    break;
            }
        }
        System.out.println("종료되었습니다");
    }
}
