package com.newlecture.proj1.study_11_30_exercise;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
//        다음 코드를 참고하여 지문을 읽어주세요
//
//
//        변수 randomNumber은 정수 1부터 10을 랜덤하게 가집니다
//
//        위 코드를 이용하여 뉴렉이가 생각한 번호 맞추기 게임을 완성해주세요
//
//—
//
//        뉴렉이 : 내가 생각한 숫자를 맞춰보거라. 숫자는 1부터 10 사이야
//
//        입력 > 4
//        뉴렉이 : 그것보다는 크다
//
//        입력 > 7
//
//        뉴렉이 : 그것보다는 작다
//
//        입력 > 5
//
//        뉴렉이 : 정답!
//
//                종료
//
//—
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int number;
        int randomNumber;
        boolean onOff = true;
        randomNumber = rand.nextInt(10)+1;

        while (onOff) {
            System.out.println("뉴렉이 : 내가 생각한 숫자를 맞춰보거라. 숫자는 1부터 10 사이야");
            System.out.print("입력 > ");
            number = scanner.nextInt();

            if (number > randomNumber) {
                System.out.println("그것보다는 작다");
            } else if (number < randomNumber) {
                System.out.println("그것보다는 크다");
            } else if (number == randomNumber) {
                System.out.println("정답!");
                onOff = false;
            }
        }
    }
}
