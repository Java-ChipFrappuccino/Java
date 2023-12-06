package com.newlecture.proj1.study_12_01_exercise;

public class ForLoopThink1 {
    public static void main(String[] args) {
//        다음 코드를 컴파일(or실행)하면 무슨 일이 일어날까요?
//
//        한번 생각해보고 생각과 일치하는지 결과를 확인해보세요
        for (int i = 0; i < 10; i++) {
        }
//        System.out.println(i);

        // 변수가 선언되어 있지 않기때문에 오류가 난다
        // (변수i는 포문안에서 선언된, 지역화 되어있는 변수이다)
        // 반복문 바깥에서 출력을 했기때문에 결과가 출력되지 않는다?
    }
}
