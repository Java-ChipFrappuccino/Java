package com.newlecture.proj1.study_11_30_exercise;

import java.util.Scanner;

public class SimpleCalculater {
    public static void main(String[] args) {
        //        뉴렉이는 사칙연산을 어려워하는 동생을 위해 사칙연산 프로그램을 만들어주고 싶어해요.
//                두 숫자를 입력받으면 모든 사칙연산을 계산하는 프로그램을 만들어주세요. (몸풀기 문제)
//        입력
//        첫번째 숫자를 입력해주세요 1
//        두번째 숫자를 입력해주세요 2
//        출력
//        1 + 2 = 3
//        1 - 2 = -1
//        1 * 2 = 2
//        1 / 2 = 0.5
        Scanner scanner = new Scanner(System.in);
        int firstNum;
        int secondNum;
        System.out.print("첫번째 숫자를 입력해주세요. > ");
        firstNum = scanner.nextInt();
        System.out.print("두번째 숫자를 입력해주세요. > ");
        secondNum = scanner.nextInt();

        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
        System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
        System.out.println(firstNum + " / " + secondNum + " = " + ((double) firstNum / secondNum));
    }
}
