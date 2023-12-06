package com.newlecture.proj1.study_12_04;

public class FindSupercar2 {
    public static void main(String[] args) {
// 뉴렉이는 최고 속도가 가장 빠른 스포츠카를 구매하려 매장에 왔어요
//
//// 1 .뉴렉이를 도와 for문을 이용해 가장 빠른 속도를 가진 차가 몇번째 차인지 찾아주세요
//// 2. 속도가 56인 클래식 슈퍼카의 위치(인덱스)를 찾아 출력해주세요
//
//
//// 출력:
//// 가장 빠른 차는 2번째
/// 클래식 슈퍼카의 인덱스는 2
        int classicCarIndex = 0;
        int highestCarNum = 0;
        int bestCar = 0;
        int[] superCars = {100, 320, 56, 220, 49, 300};
        for (int i = 0; i < superCars.length; i++) {
            if (bestCar < superCars[i]) {
                bestCar = superCars[i];
                highestCarNum = i;
            }
            if (superCars[i] == 56) {
                classicCarIndex = i;
            }
        }
        System.out.println("가장 빠른 차는 " + (highestCarNum + 1) + "번째");
        System.out.println("클래식 슈퍼카의 인덱스는 " + classicCarIndex);
    }
}


