package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        //        뉴렉이는 행사중인 삼겹살집에 방문했어요
//        삼겹살을 5만원 이상 먹을경우 10%를 할인해주고
//        3만원 이상 먹을경우 5%를 할인해준데요. 아쉽게 3만원 미만은 할인이 없어요.
//        식당에서 먹은 가격을 입력받으면 최종 가격을 출력해주는 프로그램을 작성해주세요
//        입력: 50000
//        출력: 45000
//        입력: 30000
//        출력: 28500
//        입력: 9000
//        출력: 9000
        Scanner scanner = new Scanner(System.in);
        System.out.println("주문 금액을 입력해주세요");
        double price = scanner.nextInt();
        if (50000 <= price) {
            price = price - (price*0.1);
            System.out.println((int)price+"원");
        } else if (30000 <= price) {
            price = price - (price*0.05);
            System.out.println((int)price+"원");
        }

    }
}
