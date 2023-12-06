package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class WeekdayOrWeekend {
    public static void main(String[] args) {
        //        뉴렉이는 매일 아침 일어났을때 오늘이 주중인지 주말인지 확인하려해요.
//        뉴렉이를 도와주는 프로그램을 작성해주세요.
//        1 - 월, 2 - 화, 3 - 수, 4 - 목, 5 - 금, 6 - 토, 7 - 일
//        입력: 1
//        출력: 주중이다
//        입력: 6
//        출력: 주말이다!
        Scanner scanner = new Scanner(System.in);
        System.out.println("오늘은 무슨요일인가요?");
        System.out.println("1 - 월, 2 - 화, 3 - 수, 4 - 목, 5 - 금, 6 - 토, 7 - 일");
        System.out.print("입력: ");
        int day = scanner.nextInt();
        if (1 <= day && day <= 5) {
            System.out.println("주중이다");
        } else if (6 <= day && day <= 7) {
            System.out.println("주말이다!");
        }else if (!(1 <= day && day <= 7)) {
			System.out.println("잘못된 입력입니다");
		}
    }
}
