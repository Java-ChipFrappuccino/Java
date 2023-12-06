package com.newlecture.ex05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) throws IOException {
		// char ch = 'a';
		while (true) {
			int kor1 = 0, kor2 = 0, kor3 = 0;
			int menu;
			// -------------------------메뉴 선택-------------------------------------
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("┌─────────────────────────────────┐\n");
				System.out.print("│                                 │\n");
				System.out.print("│            메인 메뉴            │\n");
				System.out.print("│                                 │\n");
				System.out.print("└─────────────────────────────────┘\n");
				System.out.println("1.성적 입력");
				System.out.println("2.성적 출력");
				System.out.println("3.성적 읽어오기");
				System.out.println("4.성적 저장하기");
				System.out.println("5.프로그램 종료");
				System.out.print("선택 > ");
				menu = scanner.nextInt();
			}
			// -------------------------성적 입력-------------------------------------
			if ( menu == 1 )
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("┌─────────────────────────────────┐\n");
				System.out.print("│                                 │\n");
				System.out.print("│            성적 입력            │\n");
				System.out.print("│                                 │\n");
				System.out.print("└─────────────────────────────────┘\n");
				do {
					System.out.print(" 국어1 : ");
					kor1 = scanner.nextInt();
					if (!(0 <= kor1 && kor1 <= 100)) {
						System.out.println("성적의 범위를 초과하셨습니다.(범위 0~100)");

					}
				} while (!(0 <= kor1 && kor1 <= 100));
				do {
					System.out.print(" 국어2 : ");
					kor2 = scanner.nextInt();
					if (!(0 <= kor2 && kor2 <= 100)) {
						System.out.println("성적의 범위를 초과하셨습니다.(범위 0~100)");

					}
				} while (!(0 <= kor2 && kor2 <= 100));
				do {
					System.out.print(" 국어3 : ");
					kor3 = scanner.nextInt();
					if (!(0 <= kor3 && kor3 <= 100)) {
						System.out.println("성적의 범위를 초과하셨습니다.(범위 0~100)");

					}
				} while (!(0 <= kor3 && kor3 <= 100));
			}
			// -------------------------성적 읽어오기-------------------------------------
			if ( menu == 3 )
			{
				FileInputStream fis = new FileInputStream("res/ex01.txt");
				Scanner scanner = new Scanner(fis);
				kor1 = scanner.nextInt();
				kor2 = scanner.nextInt();
				kor3 = scanner.nextInt();
				scanner.close();
				fis.close();

				continue;
			}
			// {
			// int b = fis.read();
			// System.out.println(b);
			// }
			//
			// {
			// int b = fis.read();
			// System.out.println(b);
			// }
			//
			// {
			// int b = fis.read();
			// System.out.println(b);
			// }
			// fis.close();
			// -------------------------성적 출력-------------------------------------
			if ( menu == 2 )
			{
				int total = kor1 + kor2 + kor3;
				double avg = total / 3.0;

				System.out.print("┌─────────────────────────────────┐\n");
				System.out.print("│                                 │\n");
				System.out.print("│            성적 출력            │\n");
				System.out.print("│                                 │\n");
				System.out.print("└─────────────────────────────────┘\n");

				System.out.printf(" 국어1 : %d점\n", kor1);
				System.out.printf(" 국어2 : %d점\n", kor2);
				System.out.printf(" 국어3 : %d점\n\n", kor3);
				System.out.printf(" 총점 : %d점\n", total);
				System.out.printf(" 평균 : %5.2f점\n", avg);
				System.out.printf(" %d-%d-%d\n", 2023, 11, 28);

				System.out.println("--------------------------");
				System.out.println("메뉴로 돌아가려면 아무키나 누르세요. > ");
				System.in.read();
			}
//			{
//				 System.out.print(" 국어1 : ");
//				 kor1 = scanner.nextInt();
//			}
//			System.out.print(" 국어2 : ");
//			kor2 = scanner.nextInt();
//			System.out.print(" 국어3 : ");
//			kor3 = scanner.nextInt();
			// 시스템 콘솔 스캐너는 클로즈하면 콘솔 입력에 다시는 쓸수없음
			// scanner.close();
			// System.in.read();

			// System.out.printf(" 총점 : %d점\n",total);
			// System.out.printf(" 평균 : %5.2f점\n",avg);
			// System.out.printf(" %d-%d-%d\n",2023,11,28);

			// -------------------------성적 저장-------------------------------------
			if ( menu == 4 )
			{
				FileOutputStream fos = new FileOutputStream("res/ex01.txt");
				PrintStream ps = new PrintStream(fos);
				ps.printf("%d %d %d", kor1, kor2, kor3);
				System.out.print(" 작업완료");
			}
			if ( menu == 5 )
			{
				System.out.println("종료되었습니다.");
				break;
			}
			{
				System.out.println("해당 메뉴는 존재하지 않습니다.");
				System.out.println("메뉴로 돌아가시려면 아무키나 입력하세요> ");
				System.in.read();
			}

//			 fos.write(ch);
//			 fos.write(ch+1);
//			 fos.write(ch+2);
//			 fos.write(ch+3);
//			 fos.flush();
//			 fos.close();
		}
	}
}