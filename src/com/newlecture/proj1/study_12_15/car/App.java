package com.newlecture.proj1.study_12_15.car;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Engine engine = new Engine1();
        Wheel wheel = new Wheel();
        Car car = new Car(engine, wheel);
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        if (test.equals("시동")) {
            car.engine.aOn();
        } else if (test.equals("앞으로")) {
            car.wheel.wheelGo();
        }
    }
}
