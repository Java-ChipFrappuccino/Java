package com.newlecture.ex06.for_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) throws IOException {
		// char ch = 'a';
		boolean onOff = true;
		//라벨 남용은 코드흐름을 읽기 어렵게 한다
//		나가자:
		while (onOff) {
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
			switch (menu) {
				// -------------------------성적 입력-------------------------------------
				case 1 : {
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
					break;
				}
				// -------------------------성적 읽어오기-------------------------------------
				case 3 : {
					FileInputStream fis = new FileInputStream("res/ex01.txt");
					Scanner scanner = new Scanner(fis);
					kor1 = scanner.nextInt();
					kor2 = scanner.nextInt();
					kor3 = scanner.nextInt();
					scanner.close();
					fis.close();
					break;
				}
				// -------------------------성적 출력-------------------------------------
				case 2 : {
					int total = kor1 + kor2 + kor3;
					double avg = total / 3.0;

					System.out.print("┌─────────────────────────────────┐\n");
					System.out.print("│                                 │\n");
					System.out.print("│            성적 출력            │\n");
					System.out.print("│                                 │\n");
					System.out.print("└─────────────────────────────────┘\n");
					for ( int x = 0, y = 1; x<3; x++,y++) {
						System.out.printf(" 국어%d : %d점\n", y, kor1);
					}
//					System.out.printf(" 국어2 : %d점\n", kor2);
//					System.out.printf(" 국어3 : %d점\n\n", kor3);
//					System.out.printf(" 총점 : %d점\n", total);
//					System.out.printf(" 평균 : %5.2f점\n", avg);
//					System.out.printf(" %d-%d-%d\n", 2023, 11, 28);

					System.out.println("--------------------------");
					System.out.println("메뉴로 돌아가려면 아무키나 누르세요. > ");
					System.in.read();
					break;
				}
				// -------------------------성적 저장-------------------------------------
				case 4 : {
					FileOutputStream fos = new FileOutputStream("res/ex01.txt");
					PrintStream ps = new PrintStream(fos);
					ps.printf("%d %d %d", kor1, kor2, kor3);
					System.out.print(" 작업완료");
					break;
				}
				case 5 : {
					System.out.println("종료되었습니다.");
					onOff = false;
					break;
//					break 나가자;
				}
				default:
					System.out.println("해당 메뉴는 존재하지 않습니다.");
					System.out.println("메뉴로 돌아가시려면 아무키나 입력하세요> ");
					System.in.read();
				}
			}
		System.out.println("\n안녕~");
		}
	}
