package com.newlecture.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
//		char ch = 'a';
		int kor1 , 
			kor2 , 
			kor3 ; 
		{
			FileInputStream fis = new FileInputStream("res/ex01.txt");
			Scanner scanner = new Scanner(fis);
			kor1 = scanner.nextInt();
			kor2 = scanner.nextInt();
			kor3 = scanner.nextInt();
			scanner.close();
			fis.close();
		}
//		{
//		int b =	fis.read();
//		System.out.println(b);
//		}
//		
//		{
//		int b =	fis.read(); 
//		System.out.println(b);
//		}
//		
//		{
//		int b =	fis.read();
//		System.out.println(b);
//		}
//		fis.close();
		// -------------------------성적 출력-------------------------------------
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
		}
		// -------------------------성적 입력-------------------------------------
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("┌─────────────────────────────────┐\n");
			System.out.print("│                                 │\n");
			System.out.print("│            성적 입력            │\n");
			System.out.print("│                                 │\n");
			System.out.print("└─────────────────────────────────┘\n");

			System.out.print(" 국어1 : ");
			scanner.nextInt();
			System.out.print(" 국어2 : ");
			scanner.nextInt();
			System.out.print(" 국어3 : ");
			scanner.nextInt();
			//시스템 콘솔 스캐너는 클로즈하면 콘솔 입력에 다시는 쓸수없음
			//scanner.close();
			//System.in.read();
			
		}
//		System.out.printf(" 총점 : %d점\n",total);
//		System.out.printf(" 평균 : %5.2f점\n",avg);
//		System.out.printf(" %d-%d-%d\n",2023,11,28);
		
		// -------------------------성적 저장-------------------------------------
		{
			kor1 = 50;
			kor2 = 60;
			kor3 = 70;
			FileOutputStream fos = new FileOutputStream("res/ex01.txt");
			PrintStream ps = new PrintStream(fos);
			ps.printf("%d %d %d", kor1, kor2, kor3);
			System.out.print(" 작업완료");
		}

//		fos.write(ch);
//		fos.write(ch+1);
//		fos.write(ch+2);
//		fos.write(ch+3);
//		fos.flush();
//		fos.close();
	}
}