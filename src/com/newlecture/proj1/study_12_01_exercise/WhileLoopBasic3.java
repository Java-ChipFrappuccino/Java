package com.newlecture.proj1.study_12_01_exercise;

public class WhileLoopBasic3 {
    public static void main(String[] args) {
//        do-while문을 이용하여 1부터 100중 홀수만 출력하는 프로그램을 작성하세요
        int i = 0;
        do {
            i++;
            if (!(i % 2 == 0))
                System.out.println(i);
        }
        while (i < 100);
    }
}
