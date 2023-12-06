package com.newlecture.proj1.study_12_01_exercise;

public class ForLoopThink3 {
    public static void main(String[] args) {
//        다음 코드를 컴파일(or실행)하면 무슨 일이 일어날까요?
//
//        한번 생각해보고 생각과 일치하는지 결과를 확인해보세요
        int i = 5;
        for ( ; i < 10; i++) {
            break;
        }
        System.out.println(i);
        //i는 5가 됩니다,
        //반복조건은 충족하지만 실행블록에 break;가 있기 때문에 포문이 종료됩니다.
    }
}
