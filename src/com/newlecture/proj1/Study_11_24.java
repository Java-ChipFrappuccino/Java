package com.newlecture.proj1;

import java.util.Scanner;

public class Study_11_24 {

	public static void main(String[] args) {
		// 문제 : 만약 성적이 90 이상이라면 A, 80점 이상이라면 B, 70점 이상이라면 C, 그 외라면 F 출력하기

//		Scanner 입력도구 = new Scanner(System.in);
//
//		System.out.println("1부터 100사이의 성적을 입력해주세요");
//
//		int grade = 입력도구.nextInt();
//		
//		if (grade >= 90) {
//			System.out.println("당신의 성적은 " + grade + "점, \"A\" 입니다");
//		} else if (grade >= 80) {
//			System.out.println("당신의 성적은 " + grade + "점, \"B\" 입니다");
//		} else if (grade >= 70) {
//			System.out.println("당신의 성적은 " + grade + "점, \"C\" 입니다");
//		} else if (grade < 70) {
//			System.out.println("당신의 성적은 " + grade + "점, \"F\" 입니다");
//		}

		/*	나만의 시나리오를 만들어서 코딩해보기
			제어문과 친해져서 절차를 작성하고 흐름을 만들어 보기
			적절한 주석과 변수명으로 보기 쉬운 코드를 작성하도록 노력하기
		
			사용 가능한 녀석들
			변수
			형변환
			if, else, else if
			만약 반복되는 코드의 불편함을 느꼈다면 반복문을 찾아보고 사용해보기
			이외의 전면 금지
			1000줄 이상 금지
			기간 : 다음주 (금) 까지
		*/

		Scanner game = new Scanner(System.in);
		boolean onOff = true;

		System.out.println("    가위바위보 게임 시작");
		while (onOff) {
			int computer = (int) (Math.random() * 3) + 1;

			System.out.println("------------------------");
			System.out.println("1.가위 2.바위 3.보 4.게임종료");
			System.out.println("------------------------");
			System.out.print("선택: ");
			int hand = game.nextInt();
			System.out.println();

			if (hand == 1 && computer == 1) {
				System.out.println("나: 가위 , 컴퓨터: 가위\n비겼습니다!\n");
			} else if (hand == 1 && computer == 2) {		 
				System.out.println("나: 가위 , 컴퓨터: 바위\n졌습니다!\n");

			} else if (hand == 1 && computer == 3) {
				System.out.println("나: 가위 , 컴퓨터: 보\n이겼습니다!\n");

			} else if (hand == 2 && computer == 1) {
				System.out.println("나: 바위 , 컴퓨터: 가위\n이겼습니다!\n");

			} else if (hand == 2 && computer == 2) {
				System.out.println("나: 바위 , 컴퓨터: 바위\n비겼습니다!\n");

			} else if (hand == 2 && computer == 3) {
				System.out.println("나: 바위 , 컴퓨터: 보\n졌습니다!\n");

			} else if (hand == 3 && computer == 1) {
				System.out.println("나: 보 , 컴퓨터: 가위\n졌습니다!\n");

			} else if (hand == 3 && computer == 2) {
				System.out.println("나: 보 , 컴퓨터: 바위\n이겼습니다!\n");

			} else if (hand == 3 && computer == 3) {
				System.out.println("나: 보 , 컴퓨터: 보\n비겼습니다!\n");

			} else if (hand == 4) {
				System.out.println("게임을 종료합니다.");
				onOff = false;
			} else {
				System.out.println("잘못된 선택입니다.");
			}
//		if (computer-hand == 0) {
//			System.out.println("비겼습니다.");
//		} else if (computer-hand == 1 || computer-hand == -2) {
//			System.out.println("졌습니다.");
//		} else if (computer-hand == 2 || computer-hand == -1) {
//			System.out.println("이겼습니다.");
//		 if (computer-hand == 2 || computer-hand == -1) {
//			System.out.println("컴퓨터가 이겼습니다.");
//		} else if (hand-computer == 2 || hand-computer == -1) {
//			System.out.println("내가 이겼습니다.");
//		}
//		0비 1졋  2이
//		0비 1졋 -1이 
//		0비-2졋 -1이
		}
		
		

	}

}
