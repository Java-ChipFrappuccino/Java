package com.newlecture.proj1.study_12_01_exercise;

import java.util.Scanner;

public class OrderManagement {
    public static void main(String[] args) {
//        뉴렉이는 온라인 쇼핑몰을 운영하고있습니다
//
//        뉴렉이는 주문 상태 코드를 입력하면 주문 상태를 관리해주는 프로그램이 필요해요
//
//        주문 상태는 ‘주문 접수', ‘결제 완료', ‘배송 중', ‘배송 완료', ‘주문 취소'의 상태로 구분됩니다
//
//        뉴렉이가 1부터 5를 입력하면 해당 주문 상태를 출력하는 프로그램을 작성해주세요
//
//        입력: 3
//        출력: 배송 중
//
//
//        입력: 4
//        출력: 배송 완료
//
//
//        입력 1
//        출력: 주문 접수
//
//
//        입력: 2
//        출력: 결제 완료
//
//
//        입력: 5
//        출력: 주문 취소
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~5 중에 하나를 입력해주세요");
        System.out.print("입력: ");
        int select = scanner.nextInt();
        switch (select) {
            case 1:
                System.out.println("주문 접수");
                break;
            case 2:
                System.out.println("결제 완료");
                break;
            case 3:
                System.out.println("배송 중");
                break;
            case 4:
                System.out.println("배송 완료");
                break;
            case 5:
                System.out.println("주문 취소");
                break;
        }

    }
}
