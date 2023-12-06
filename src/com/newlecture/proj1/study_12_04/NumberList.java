package com.newlecture.proj1.study_12_04;

public class NumberList {
    public static void main(String[] args) {
        //배열이란?
        //여러개의 값을 가질수있는 변수

        //배열을 사용해야 하는 이유에 대해서 설명하세요.
        //반복되거나 여러 변수에 값을 넣어야할때 한개의 변수명으로 여러값을 담을수 있다


        // 길이가 10인 int형 배열 numberList를 생성후, 3번째 숫자를 출력해보세요.
        // 3번째라는건 [3]이 아니에요~ 출력: 0

//        int[] numberList = new int[10];
//        for (int i = 0; i < 10; i++) {
//            numberList[i] = i + 1;
//            if (numberList[i] % 2 == 0) {
//                System.out.println(numberList[i]);
//            }
//        }

//        int[] nums = {2, 3, 42, 4, 5, 56, 5, 32, 100, 96};
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[nums.length - 1 - i]);
//        }

//        int[] nums = {2, 3, 42, 4, 5, 56, 5, 32, 100, 96};
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i] * 2);
//        }

//        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140};
//
//        // for 문을 이용해서 nums 배열의 인덱스가 짝수인 곳에만 1을 대입하는 코드를 작성하시오. 단 if 문은 사용하지 말 것.
//
//        for (int i = 0; i < nums.length / 2 ; i++) {
//            nums[(i*2)] = 1; // 30 50 70 90 110 130 / 2 4 6 8 10 12
//        }
//      //  0 2 4 6 8 10 12
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//
//        }

        // 여기 한 줄의 코드를 작성하시오.

//        int[] nums = new int[10];

        // 10번 반복하는 for문을 이용해서 위의 nums 배열에 20~2 까지 역순으로 숫자를 담는 코드를 작성하시오.

//        int[] nums = new int[10];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = 20-(2*i);
//            System.out.println(nums[i]);
//        }

//        (문제 5 - 인덱스 규칙)
        int[] nums = {10,20,30,40,50,60,70,80,90,100,110,120,130,140};
//        위의 nums 배열에서 인덱스가 2,5,8,11 인 값만 출력하는 코드를 작성하시오. 단 for 문을 이용할 것
                                    //0 3 6 9 인덱스는 0부터 시작하니까 -2를 해보면 규칙이 보임
        for(int i=0; i<4; i++){
            System.out.println(nums[3*i+2]);
            // int math = 2(초회차) + (N-1) * 3(등차값)

//            nums[2]
//            nums[5]
//            nums[8]
//            nums[11] 3 3 3 3
        }
        // 여기에 한 줄의 코드를 작성하시오.
    }

}
