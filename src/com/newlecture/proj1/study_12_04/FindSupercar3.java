package com.newlecture.proj1.study_12_04;

public class FindSupercar3 {
    public static void main(String[] args) {
// 문득 뉴렉이는 슈퍼카들의 평균 속도와 평균 속도보다 빠른 차들이 몇개인지 궁금해졌어요.

// 뉴렉이를 도와서 슈퍼카들의 평균 속도와, 평균 속도보다 빠른 차들의 개수를 출력해주세요


// 출력:

// 평균 속도: 174.16666666666666 ( 또는 174로 출력해도 무관)

// 평균속도보다 빠른 차의 개수는 3개
        int[] superCars = {100, 320, 56, 220, 49, 300};
        int totalSpeed = 0, avg=0, moreSpeed = 0;

        for (int i = 0; i < superCars.length; i++) {
            totalSpeed += superCars[i];
            avg = totalSpeed / superCars.length;
        }

        for (int i = 0; i < superCars.length; i++) {
            if (avg < superCars[i]) {
                moreSpeed++;
            }
        }

        System.out.println("평균 속도: " + avg);
        System.out.println("\n평균속도보다 빠른 차의 개수는 " + moreSpeed + "개");
    }
}
