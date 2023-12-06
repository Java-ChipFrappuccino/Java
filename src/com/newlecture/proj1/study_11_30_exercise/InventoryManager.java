package com.newlecture.proj1.study_11_30_exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InventoryManager {
    public static void main(String[] args) {
//        뉴렉 쇼핑몰이 너무 성장해서 재고 관리 시스템이 필요해졌어요
//
//        뉴렉이의 요구사항은 다음과 같아요
//
//
//        우리 쇼핑몰에서 판매하는 ‘상품 종류의 개수’와 ‘재고 부족 기준 수량'을 입력해야돼.
//
//        그 후 각 상품별로 ‘상품 이름'과 ‘현재 재고 수량'을 입력하면, 자동으로 발주를 해야지
//
//
//        뉴렉이는 위 내용으로 다음 입출력 결과를 구현해냈어요. 뉴렉이의 프로그램을 만들어보세요
//
//
//        입출력:
//
//        상품 종류의 총 개수를 입력하세요: 2
//
//        재고 부족 기준 수량을 입력하세요: 5
//
//
//        상품 이름을 입력하세요: shirts
//
//        현재 상품 수량을 입력하세요: 8
//
//        shirts 상품은 재고의 여유가 충분합니다
//
//
//        상품 이름을 입력하세요: jeans
//
//        현재 상품 수량을 입력하세요: 3
//
//        jeans 상품을 발주했습니다
//
//
//        재고 관리를 종료합니다
//
//
//        입출력:
//        상품 종류의 총 개수를 입력하세요: 1
//
//        재고 부족 기준 수량을 입력하세요: 100
//
//
//        상품 이름을 입력하세요:  jordan
//
//        현재 상품 수량을 입력하세요: 99
//
//        jordan 상품을 발주했습니다
//
//
//        재고 관리를 종료합니다
        Scanner scanner = new Scanner(System.in);
        int totalProductTypes, currentInventory, minimumInventory;
        String productName;

        System.out.print("상품 종류의 총 개수를 입력하세요: ");
        totalProductTypes = scanner.nextInt();
        System.out.print("\n재고 부족 기준 수량을 입력하세요: ");
        minimumInventory = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < totalProductTypes; i++) {
            System.out.print("\n상품 이름을 입력하세요: ");
            productName = scanner.nextLine();
            System.out.print("\n현재 상품 수량을 입력하세요: ");
            currentInventory = scanner.nextInt();
            scanner.nextLine();
            if (currentInventory <= minimumInventory) {
                System.out.println("\n" + productName + " 상품을 발주했습니다\n");
            } else {
                System.out.println("\n" + productName + " 상품은 재고의 여유가 충분합니다\n");
            }
        }
        System.out.println();
        System.out.println("재고 관리를 종료합니다");
    }
}
