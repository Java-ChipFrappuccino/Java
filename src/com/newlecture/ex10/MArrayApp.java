package com.newlecture.ex10;

public class MArrayApp {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8};

//        int[][] t1 = new int[3][2];
//        t1[0]= arr1;
//        t1[1]= arr2;
//        t1[2]= arr3;
//        System.out.println(t1[2][0]);  //왜 됨?

        int[][] t1 = new int[3][];
        t1[0]= arr1;
        t1[1]= arr2;
        t1[2]= arr3;
        System.out.println(t1[2][0]);
    }
}
