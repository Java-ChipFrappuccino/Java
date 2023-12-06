package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class LateManager {
    public static void main(String[] args) {
//        뉴렉 학교는 전교생이 3명인 작은 학교에요
//
//        이 학교의 무서운 뉴렉쌤은 학생들의 지각을 체크하려고해요.  9시 30분부터 지각이에요.
//        학생의 이름과 도착 시간, 분을 입력받아 지각 여부를 출력하는 프로그램을 작성해주세요
//
//        입출력:
//        학생 이름을 입력하세요: tom
//
//        도착 시간을 입력하세요 (시간): 8
//
//        도착 시간을 입력하세요 (분): 59
//
//        tom은/는 잘 왔네요
//
//        학생 이름을 입력하세요: jerry
//
//        도착 시간을 입력하세요 (시간): 9
//
//        도착 시간을 입력하세요 (분): 29
//
//        jerry은/는 잘 왔네요
//
//        학생 이름을 입력하세요: json
//
//        도착 시간을 입력하세요 (시간): 9
//
//        도착 시간을 입력하세요 (분): 30
//
//        json은/는 지각이에요
        Scanner scanner = new Scanner(System.in);
        String name;
        int hour, minute;
        for (int i = 0; i < 3; i++) {
            System.out.print("학생 이름을 입력하세요: ");
            name = scanner.nextLine();
            System.out.print("\n도착 시간을 입력하세요 (시간): ");
            hour = scanner.nextInt();
            System.out.print("\n도착 시간을 입력하세요 (분): ");
            minute = scanner.nextInt();
            scanner.nextLine();
            if (hour >= 9 && minute >= 30) {
                System.out.println("\n" + name + "은/는 지각이에요");
            } else if (hour > 9) {
                System.out.println("\n" + name + "은/는 지각이에요");
            } else {
                System.out.println("\n" + name + "은/는 잘 왔네요\n");
            }
        }
    }
}
