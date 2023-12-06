package com.newlecture.proj1.study_12_01_exercise;

public class ForLoopBasic3 {
    public static void main(String[] args) {
//        for문을 이용하여 1부터 10이하의  정수 중 짝수의 합을
//        출력하는 코드를 작성하세요
        int total = 0;
        for (int i = 0; i < 10; i++) {
            if ((i+1)%2 == 0) {
                total += (i+1);
            }
        }
        System.out.println("1부터 10이하의  정수 중 짝수의 합: " + total);
    }
}
