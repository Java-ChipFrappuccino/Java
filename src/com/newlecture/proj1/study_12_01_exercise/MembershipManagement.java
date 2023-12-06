package com.newlecture.proj1.study_12_01_exercise;

import java.io.IOException;
import java.util.Scanner;

public class MembershipManagement {
    public static void main(String[] args) throws IOException {
//        뉴렉이네 온라인 쇼핑몰에 회원 등급제가 추가되었어요
//
//        회원 등급은 ‘bronze’ ‘silver’ ‘gold’ 3가지로 이루어져 있습니다
//
//        bronze는 2%의 할인을, silver는 3%의 할인을, gold는 5%의 할인률을 혜택으로 가집니다
//
//        회원 등급과 상품의 가격을 입력받고, 할인된 가격을 출력하는 프로그램을 작성해주세요
//
//
//        - 입출력:
//        회원 등급을 입력하세요 (bronze, silver, gold): silver
//
//        상품의 가격을 입력하세요: 10000
//
//        할인된 가격은 9700.00원 입니다.
//
//
//        - 입출력:
//        회원 등급을 입력하세요 (bronze, silver, gold): gold
//
//        상품의 가격을 입력하세요: 85800
//
//        할인된 가격은 81510.00원 입니다
        Scanner scanner = new Scanner(System.in);
        String memberGrade;
        double price;
        System.out.println("회원 등급을 입력하세요 (bronze, silver, gold)");
        System.out.print("입력: ");
        memberGrade = scanner.nextLine();
        System.out.println("상품의 가격을 입력하세요");
        System.out.print("입력: ");
        price = scanner.nextDouble();

        switch (memberGrade) {
            case "bronze" :
                System.out.println("할인된 가격은 "+ (price * 0.98) +"원 입니다.");
                break;
            case "silver" :
                System.out.println("할인된 가격은 원 입니다.");
                System.out.println("할인된 가격은 "+ (price * 0.97) +"원 입니다.");
                break;
            case "gold" :
                System.out.println("할인된 가격은 원 입니다.");
                System.out.println("할인된 가격은 "+ (price * 0.95) +"원 입니다.");
                break;

        }
    }
}
