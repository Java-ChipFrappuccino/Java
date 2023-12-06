package com.newlecture.proj1.study_12_05;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
// 문자열을 입력받아 영문 모음(a, e, i, o, u)의 개수를 출력하는 프로그램을 작성하세요

// 입력: programing

// 출력: 3

// 입력: abc

// 출력: 1
        Scanner scanner = new Scanner(System.in);
        String type;
        String[] find = {"a", "e", "i", "o", "u"};
        int count = 0;

        System.out.print("입력 : ");
        type = scanner.nextLine();

//        for (int i = 0; i < type.length(); i++) {
//            if (type.substring(i, i + 1).equals(find[0])) {
//                count++;
//            } else if (type.substring(i, i + 1).equals(find[1])) {
//                count++;
//            } else if (type.substring(i, i + 1).equals(find[2])) {
//                count++;
//            } else if (type.substring(i, i + 1).equals(find[3])) {
//                count++;
//            } else if (type.substring(i, i + 1).equals(find[4])) {
//                count++;
//            }
//        }
        for (int i = 0; i < type.length(); i++) {
            for (int j = 0; j < find.length; j++) {
                if (type.substring(i, i + 1).equals(find[j])) {
                    count++;
                }
            }
        }
        System.out.println("모음 갯수는 " + count + "개 입니다");
    }
}
