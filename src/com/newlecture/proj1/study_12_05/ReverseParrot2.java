package com.newlecture.proj1.study_12_05;

import java.util.Scanner;

public class ReverseParrot2 {
    public static void main(String[] args) {
// 뉴렉이네 앵무새는 문장을 말하면 거꾸로 말하는 독특한 앵무새에요.

// “안녕 앵무야?”라는 문장을 말하면, “앵무야? 안녕"이라 말하고,

// “막내야 오늘 점심이 뭐냐?”라는 문장을 말하면, “뭐냐? 점심이 오늘 막내야"라 말해요.

// String sentence = “안녕 앵무야?”

// 출력: 앵무야? 안녕

// String sentence = “막내야 오늘 점심이 뭐냐?”

// 출력: 뭐냐? 점심이 오늘 막내야
        Scanner scanner = new Scanner(System.in);
        String[] tokens;
        String type;

        System.out.print("입력: ");
        type = scanner.nextLine();

        tokens = type.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            System.out.print(tokens[tokens.length - (i + 1)] + " ");
        }
    }
}
