package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class PasswordValidator {
	public static void main(String[] args) {
		// 뉴렉이는 뉴렉 카페 홈페이지의 회원가입 시스템을 만들고있어요
//        뉴렉 카페에 회원가입시 비밀번호가 필요한데, 비밀번호는 8 ~ 16자의 길이만 허용해요.
//                뉴렉이를 도와 비밀번호 유효성 검사 프로그램을 작성해주세요
//        비밀번호의 길이는 password.length()로 알 수 있다고해요
//
//        System.out.println("비밀번호를 입력하세요");
//        String password = //
		//
//
//
//                입력: 가나다라
//        출력: 비밀번호는 8 ~ 16자로 입력해주세요
//        입력: 가나다라12345
//        출력: 유효한 비밀번호입니다
		Scanner scanner = new Scanner(System.in);
		String password;
		do {
			System.out.println("비밀번호를 입력하세요");
			System.out.print("password: ");
			password = scanner.nextLine();
			if (!(8 <= password.length() && password.length() <= 16)) {
				System.out.println("비밀번호는 8 ~ 16자로 입력해주세요");
			}
		} while (!(8 <= password.length() && password.length() <= 16));
		System.out.println("유효한 비밀번호입니다");
	}
}
