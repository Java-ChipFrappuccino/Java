package com.newlecture.proj1.study_12_07;

public class ArrListExam {
    public static void main(String[] args) {
//        int[] array1 = new int[3];
//        array1[0] = 5;
//        array1[1] = 3;
//        array1 = new int[3];
//        array1[2] = array1[0];

        int Ascending;
        int descending;

        int[] arr = {6, 3, 5, 2, 7, 4, 1, 8};
        //해당 배열을 오름차순으로 버블 정렬하세요
        for (int i = 0; i < arr.length - 1; i++) {          //순차적으로 정렬을 하는 포문
            for (int j = 0; j < arr.length - 1 - i; j++) {  //1등만을 찾는 포문
                if (arr[j] > arr[j + 1]) {
                    Ascending = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = Ascending;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        //내림차순으로 버블 정렬하세요
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    Ascending = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = Ascending;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        // 내림차순 정렬 시 바깥 for문의 i = 3, 안쪽 for문의 j = 3일 때
        // 배열의 4,5,6,7 인덱스(끝의 4개의 원소) 정렬 상태를 작성해주세요 (디버깅 금지)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {                    //63527418   origin
                                                              //6537428 1  0loof
                    Ascending = arr[j];                       //657438  2  1loof
                    arr[j] = arr[j + 1];                      //67548   3  2loof
                                                              //7658    4  3loof
                                                              //67548
                                                              //76 548      0
                    arr[j + 1] = Ascending;                   //7 65 48     1
                                                              //76 54 8     2
                                                              //765 84 321     3
                }
            }
        }
    }
}
