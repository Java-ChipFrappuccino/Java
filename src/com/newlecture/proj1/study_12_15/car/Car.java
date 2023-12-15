package com.newlecture.proj1.study_12_15.car;

public class Car {
    Engine engine = new Engine1();
    Wheel wheel = new Wheel();

    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }
//    public void engineOn() {
//        System.out.println("시동이 켜졌습니다");
//    }


}
