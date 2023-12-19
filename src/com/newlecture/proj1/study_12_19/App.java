package com.newlecture.proj1.study_12_19;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Menu 객체 menu를 생성하고
        Menu menu = new Menu();
        // menu 의 데이터를 사용자로부터 입력받고
        Scanner scanner = new Scanner(System.in);
        menu.input();
        // menu 의 데이터를 출력하시오.
        menu.print();

        MenuList menuList = new MenuList(3);
        System.out.println("Bye~");
    }
}
