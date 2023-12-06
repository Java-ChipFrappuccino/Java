package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class RecommendMenu {
	public static void main(String[] args) {
//        점심 메뉴를 고르기 어려워하는 뉴렉이를 위해 1부터 5 사이의 숫자를 입력하면 점심 메뉴를 추천하는 프로그램을 만들어주세요.
//        1이면 “떡볶이", 2이면 “어묵", 3이면 “순대”, 4이면 “튀김”, 5이면 “핫도그”를 출력하고 만일 1과 5 사이의 숫자가 아닐 경우
//        “유효한 숫자의 범위가 아닙니다"라는 메시지를 출력하는 코드를 작성하세요.
//        입력: 2
//        어묵
//        입력: 7
//        유효한 숫자의 범위가 아닙니다
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 ~ 5중에 한가지를 입력해주세요");
		System.out.print("입력: ");
		int choice = scanner.nextInt();
		if (choice == 1) {
			System.out.println("떡볶이");
		} else if (choice == 2) {
			System.out.println("어묵");
		} else if (choice == 3) {
			System.out.println("순대");
		} else if (choice == 4) {
			System.out.println("튀김");
		} else if (choice == 5) {
			System.out.println("핫도그");
		} else if (!(1 <= choice && choice <= 5)) {
			System.out.println("유효한 숫자의 범위가 아닙니다");
		}
	}
}
