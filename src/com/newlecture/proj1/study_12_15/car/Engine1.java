package com.newlecture.proj1.study_12_15.car;

public class Engine1 implements Engine{
    public void start() {
        System.out.println("시동이 켜졌습니다");
    }

    public void stop() {
        System.out.println("시동이 꺼졌습니다");
    }

    public void overHeat() {
        System.out.println("과열로 폭발");
    }
}
