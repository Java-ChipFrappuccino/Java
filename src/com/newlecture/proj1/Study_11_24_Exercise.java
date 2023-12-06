package com.newlecture.proj1;

import java.util.Scanner;

public class Study_11_24_Exercise {
	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);
		int count = 0;
		int com;

		while (count <= 30) {
			com = (int) (Math.random() * 3) + 1;

			System.out.println("현재 숫자: " + count);
			System.out.println("1. 1UP , 2. 2UP , 3. 3UP");
			System.out.print("선택: ");
			int test2 = test.nextInt();
			
			if (test2 == 1 && com == 1) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\"");
				count += 1;
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\"");
				count += com;
			} else if (test2 == 1 && com == 2) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\"");
				count += 1;
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
				count += com;
			} else if (test2 == 1 && com == 3) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\"");
				count += 1;
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\" " + "\"" + (count + 3) + "\"");
				count += com;
				
			} else if (test2 == 2 && com == 1) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
				count += 2;
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\"");
				count += com;

			} else if (test2 == 2 && com == 2) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
				count += 2;
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
				count += com;
			} else if (test2 == 2 && com == 3) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
				count += 2;
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\" " + "\"" + (count + 3) + "\"");
				count += com;

			} else if (test2 == 3 && com == 1) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\" " + "\"" + (count + 3) + "\"");
				count += 3;
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\"");
				count += com;
			} else if (test2 == 3 && com == 2) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\" " + "\"" + (count + 3) + "\"");
				count += 3;
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
				count += com;
			} else if (test2 == 3 && com == 3) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\" " + "\"" + (count + 3) + "\"");
				count += 3;
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\" " + "\"" + (count + 3) + "\"");
				count += com;
				}
			}
			
		System.out.println("게임종료");
		}
	}