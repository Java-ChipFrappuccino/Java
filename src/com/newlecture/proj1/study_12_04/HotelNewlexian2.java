package com.newlecture.proj1.study_12_04;

import java.math.RoundingMode;
import java.util.Scanner;

public class HotelNewlexian2 {
    public static void main(String[] args) {
        // 호텔 뉴렉시안이 개발자 뉴렉이에게 추가적인 요구사항을 주었어요.

// 클라이언트의 요구사항을 보고 구현해주세요

// * 객실 예약 시스템이 필요해졌어요.

// * 객실 수를 입력하고, 객실 번호를 입력하면 예약 가능한지 확인하고,

//   예약을 진행하는 프로그램을 만들어주세요


//        입출력:
//        Newlexian Version: 0.0.2
//
//
//        객실 수를 입력해주세요 : 3
//
//
//
//        1: 예약 가능
//
//        2: 예약 가능
//        3: 예약 가능
//
//
//        몇번 방을 예약하시겠습니까? (0을 입력하면 종료됩니다) : 3
//        3번 방이 예약 되었습니다
//
//        1: 예약 가능
//        2: 예약 가능
//        3: 예약 불가
//
//
//        몇번 방을 예약하시겠습니까? (0을 입력하면 종료됩니다) : 3
//        3번 방은 예약이 불가능합니다. 다시 입력해주세요
//
//        몇번 방을 예약하시겠습니까? (0을 입력하면 종료됩니다) : 0
//
//        종료
        Scanner scanner = new Scanner(System.in);
        int[] roomNumber;
        int roomChoice;
        System.out.println("Newlexian Version: 0.0.2\n");
        System.out.print("객실 수를 입력해주세요 : ");
        roomNumber = new int[scanner.nextInt()];
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < roomNumber.length; i++) {
            System.out.println((i + 1) + ": 예약가능");
        }
        boolean onOff = true;
        while (onOff) {
            System.out.print("\n\n몇번 방을 예약하시겠습니까? (0을 입력하면 종료됩니다) : ");
            roomChoice = scanner.nextInt();
            scanner.nextLine();
            if (roomChoice == 0) {
                System.out.println("\n종료");
                onOff = false;
                break;
            }
            if (roomNumber[roomChoice - 1] == 8) {
                System.out.println(roomChoice + "번 방은 예약이 불가능합니다. 다시 입력해주세요");
                continue;
            }

//        roomNumber= [roomChoice - 1];
            roomNumber[roomChoice - 1] = 8;
            System.out.println(roomChoice + "번 방이 예약 되었습니다\n");

            for (int i = 0; i < roomNumber.length; i++) {
                if (roomNumber[i] == 0) {
                    System.out.println((i + 1) + ": 예약 가능");
                } else if (!(roomNumber[i] == 0)) {
                    System.out.println((i + 1) + ": 예약 불가");
                }
            }
        }
    }
}
