package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class FindSupercar {
	public static void main(String[] args) {
		// 뉴렉이는 최대 속도가 가장 빠른 스포츠카를 구매하려해요
//        세 개의 스포츠카 최대속도를 입력받아 가장 빠른 스포츠카를 출력하는 프로그램을 작성해주세요
//        입력:
//        240
//        100
//        150
//        출력: 240
//        입력:
//        80
//        188
//        300
//        출력: 300
		Scanner scanner = new Scanner(System.in);
		int car1, car2, car3;
		int highSpeed = 0;
		System.out.print("첫번째 스포츠카 속도 입력: ");
		car1 = scanner.nextInt();
		if (car1 > highSpeed) {
			highSpeed = car1;
		}
		System.out.print("두번째 스포츠카 속도 입력: ");
		car2 = scanner.nextInt();
		if (car2 > highSpeed) {
			highSpeed = car2;
		}
		System.out.print("세번째 스포츠카 속도 입력: ");
		car3 = scanner.nextInt();
		if (car3 > highSpeed) {
			highSpeed = car3;
		}
		System.out.println("HighSpeed = " + highSpeed);
	}
}
