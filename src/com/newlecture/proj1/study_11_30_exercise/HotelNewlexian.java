package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class HotelNewlexian {
    public static void main(String[] args) {
//        개발자 뉴렉이는 호텔 뉴렉시안에 객실 예약 상태를 관리해주는 솔루션을 제공해주러 왔어요
//
//        클라이언트 요구사항은 다음과 같아요
//
//
//        객실 번호와 예약 여부를 입력해서 각 룸 타입별로 예약된 객실 수와 예약되지 않은 객실 수를 알고싶어요
//
//        객실 번호가 짝수라면 스탠다드룸, 홀수라면 디럭스 룸으로 분류합니다
//
//        MVP를 최대한 빨리 확인하고 싶으니, 최대 3개의 객실만 관리하게 해주세요
//
//
//        뉴렉이는 클라이언트의 요구사항을 도출하여 다음과 같은 입출력이 나오는 프로그램을 작성하려해요. 이를 구현해주세요
//
//
//        입출력:
//        Newlexian Version: 0.0.1
//
//        현재 최대 3개의 객실만 관리할 수 있습니다.
//
//                객실 번호를 입력하세요: 3
//
//        예약 상태를 입력하세요 (Y/N): y
//
//        객실 번호를 입력하세요: 11
//
//        예약 상태를 입력하세요 (Y/N): N
//
//        객실 번호를 입력하세요: 8
//
//        예약 상태를 입력하세요 (Y/N): y
//
//
//        스탠다드 룸
//
//        예약된 객실 수: 1
//
//        예약되지 않은 객실 수: 0
//
//
//        디럭스룸
//
//        예약된 객실 수: 1
//
//        예약되지 않은 객실 수: 1
//
//
//        입출력:
//
//        Newlexian Version: 0.0.1
//
//        현재 최대 3개의 객실만 관리할 수 있습니다.
//
//                객실 번호를 입력하세요: 100
//
//        예약 상태를 입력하세요 (Y/N): y
//
//        객실 번호를 입력하세요: 101
//
//        예약 상태를 입력하세요 (Y/N): n
//
//        객실 번호를 입력하세요: 504
//
//        예약 상태를 입력하세요 (Y/N): Y
//
//
//        스탠다드 룸
//
//        예약된 객실 수: 2
//
//        예약되지 않은 객실 수: 0
//
//
//        디럭스룸
//
//        예약된 객실 수: 0
//
//        예약되지 않은 객실 수: 1
        Scanner scanner = new Scanner(System.in);
        String yesOrNo, upperCase;
        int roomNum, standardBooking = 0, standardNonBooking = 0, deluxeBooking = 0, deluxeNonBooking = 0;

        System.out.println("Newlexian Version: 0.0.1");
        System.out.println("\n현재 최대 3개의 객실만 관리할 수 있습니다.");
        for (int i = 0; i < 3; i++) {
            System.out.print("\n객실 번호를 입력하세요: ");
            roomNum = scanner.nextInt();
            scanner.nextLine();
            System.out.print("\n예약 상태를 입력하세요 (Y/N): ");
            yesOrNo = scanner.nextLine();
            upperCase = yesOrNo.toUpperCase();
            if (roomNum % 2 == 0 && upperCase.equals("Y")) {
                standardBooking++;
            } else if (roomNum % 2 == 0 && upperCase.equals("N")) {
                standardNonBooking++;
            } else if (roomNum % 2 == 1 && upperCase.equals("Y")) {
                deluxeBooking++;
            } else if (roomNum % 2 == 1 && upperCase.equals("N")) {
                deluxeNonBooking++;
            }
        }
        System.out.println("\n\n스탠다드 룸");
        System.out.println("\n예약된 객실 수: " + standardBooking);
        System.out.println("\n예약되지 않은 객실 수: " + standardNonBooking);
        System.out.println("\n\n디럭스룸");
        System.out.println("\n예약된 객실 수: " + deluxeBooking);
        System.out.println("\n예약되지 않은 객실 수: " + deluxeNonBooking);
    }
}
