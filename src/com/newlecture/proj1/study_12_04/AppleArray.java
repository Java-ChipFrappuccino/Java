package com.newlecture.proj1.study_12_04;

public class AppleArray {
    public static void main(String[] args) {
// 뉴렉이는 무거운 사과를 왼쪽으로 두고싶어요. 뉴렉이를 도와 사과의 위치를 변경해주세요
// 출력:
// 사과의 위치를 바꾸기 전:

// 10 34

// 사과의 위치를 바꾼 후:

// 34 10

int[] apples = {10,34};
        System.out.print("사과의 위치를 바꾸기 전: ");
        for (int apple : apples) { //for (int i = 0 //변수; i < 4 //조건식; i++ //증감식)
            System.out.printf("%d ", apple);
        }
        System.out.print("\n사과의 위치를 바꾼 후: ");

        for (int i = 0; i < apples.length; i++) {
            System.out.printf("%d ", apples[apples.length-i-1]);
        }
//        int change = 0;
//        change = apples[0];
//        apples[0] = apples[1];
//        apples[1] = change;
//        for (int apple : apples) { //for (int i = 0 //변수; i < 4 //조건식; i++ //증감식)
//            System.out.printf("%d ", apple);
//        }

//        System.out.print(apples[1]+ " ");
//        System.out.println(apples[0]);
//        int arr[] ={11,34,56,78,3,57,85,7};
//        for(int i= arr.length-1; i>=0; i--){
//            System.out.println(arr[i]);
//        }
//        tmp = apples[0];
//        apples[0]=apples[1];
//        apples[1]=tmp;
//        for (int apple : apples) {
//            System.out.printf("%d ", apple);
//        }
    }
}
