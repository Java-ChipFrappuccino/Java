package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class LeapYearChecker {
	public static void main(String[] args) {
		// 뉴렉이는 윤년 계산기를 만들어서 사용하려해요.
//                어떤 연도가 윤년인지 확인하는 방법은 다음과 같아요.
//
//        연도가 4로 나누어 떨어지면 윤년이에요
//        그 중에서 100으로 나누어 떨어지면 윤년이 아니에요
//        하지만 400으로 나누어 떨어지면 윤년이에요
//
//        예를 들어 1996년과 2000년은 윤년이지만, 1900년은 윤년이 아니에요
//
//        입력: 2000
//        출력: 윤년
//        입력: 1900
//        출력: 윤년이 아니에요
		Scanner scan = new Scanner(System.in);
		System.out.println("연도를 입력해주세요");
		System.out.print("입력: ");
		int number = scan.nextInt();

		if (number % 4 == 0 && !(number % 100 == 0) || (number % 400 == 0)) {
			System.out.println("윤년이에요");
		} else {
			System.out.println("윤년이 아니에요");
		}
	}
}