package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class OrderManagement2 {
    public static void main(String[] args) {
//        뉴렉이네 옷 쇼핑몰은 블랙프라이데이를 맞아 행사를 진행하려해요
//
//        구매자들이 30000원 이상 구매하면 자동으로 10% 할인이 적용되는 파격적인 행사에요
//
//        상품의 가격과 수량을 입력받아 총액을 계산하는 프로그램을 작성해주세요.
//
//        프로그램은 0을 입력하면 종료돼요!
//
//                입출력 :
//
//        상품 가격을 입력하세요. 0을 입력하면 종료됩니다 :10000
//
//        개수를 입력하세요: 1
//
//        현재 총액: 10000.0
//
//        상품 가격을 입력하세요. 0을 입력하면 종료됩니다 :0
//
//        총액은 : 10000.0
//
//        입출력 :
//        상품 가격을 입력하세요. 0을 입력하면 종료됩니다 :50000
//
//        개수를 입력하세요: 1
//
//        현재 총액: 50000.0
//
//        상품 가격을 입력하세요. 0을 입력하면 종료됩니다 :0
//
//        (할인)총액은 : 45000.0
//
//        입출력 :
//        상품 가격을 입력하세요. 0을 입력하면 종료됩니다 :12000
//
//        개수를 입력하세요: 3
//
//        현재 총액: 36000.0
//
//        상품 가격을 입력하세요. 0을 입력하면 종료됩니다 :0
//
//        (할인)총액은 : 32400.0
        Scanner scanner = new Scanner(System.in);
        int price, totalPrice = 0;
        int clothesCount;
        boolean onOff = true;

        while (onOff) {
            System.out.println("상품 가격을 입력하세요. 0을 입력하면 종료됩니다 : ");
            System.out.print("입력: ");
            price = scanner.nextInt();
            if (price == 0) {
                if (totalPrice >= 30000) {
                    System.out.println("(할인)총액은 " + (totalPrice * 0.9) + "원 입니다");
                    onOff = false;
                    break; // break하면 상위조건문까지 전부 종료?
                }
                System.out.println("총액은 " + totalPrice + "원 입니다");
                onOff = false;
                break;
            }
            System.out.println("개수를 입력하세요: ");
            System.out.print("입력: ");
            clothesCount = scanner.nextInt();
            totalPrice += (price * clothesCount);
            System.out.println("현재 총액 " + totalPrice);

        }
    }
}
