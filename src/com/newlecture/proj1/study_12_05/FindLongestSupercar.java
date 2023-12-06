package com.newlecture.proj1.study_12_05;

public class FindLongestSupercar {
    public static void main(String[] args) {
// 어느 날, 뉴렉이의 꿈속에서 한 신선이 나타났어요

// 신선이 말하길, 가장 긴 이름의 슈퍼카를 찾으면 그 슈퍼카를 주겠노라

// 출력: Lamborghini Sesto Elemento
        int longName = 0, index = 0;
        String[] superCars = {"Lamborghini Sesto Elemento" , "Mercedes-Benz SLR McLaren" , "ASTON MARTIN victor" , "Ferrari 360 Modena"};
        for (int i = 0; i < superCars.length; i++) {
            if (longName < superCars[i].length()) {
                longName = superCars[i].length();
                index = i;
            }
        }
        System.out.println("가장 긴 이름의 슈퍼카는 "+ superCars[index] + "입니다");
    }
}
