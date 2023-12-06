package com.newlecture.ex07.arr;

public class App {
    public static void main(String[] args) {
        // int[] kors = new int[3]; 값이 정해지지 않았을때
        // int[] kors1 = new int[]{1, 2, 3}; 대입할 값을 정했을때, 오래된 환경
        // int[] kors2 = {1, 2, 3}; 대입할 값을 정했을때, 최신환경
        int[] kors2 = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            System.out.println(kors2[i]);
        }
    }
}
