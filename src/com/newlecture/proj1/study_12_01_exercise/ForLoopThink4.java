package com.newlecture.proj1.study_12_01_exercise;

public class ForLoopThink4 {
    public static void main(String[] args) {
//        다음 코드를 컴파일(or실행)하면 무슨 일이 일어날까요?
//
//        한번 생각해보고 생각과 일치하는지 결과를 확인해보세요
        int i = 0;
        for (i = 0; i < 3; i++) {
            System.out.println(i);

            if (i == 2) {
                i += 4;
                continue;
            }
            
        }
        System.out.println(i);
        /*
        continue를 쓰면 continue 밑의 실행블록들은 실행하지 않지만
        해당 회차?반복을 완주했다고 판단한다음
        포문 처음으로 돌아가므로 i++이 적용이 되어진다
        대신 break;를 쓰면 포문 자체를 바로 종료시켜버리므로 i가 6이 된다
         */
    }
}
