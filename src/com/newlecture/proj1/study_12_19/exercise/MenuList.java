package com.newlecture.proj1.study_12_19.exercise;

import java.util.Scanner;

public class MenuList {
    Scanner scanner = new Scanner(System.in);

    MenuList() {
        this.count = 3;
        this.menus = new Menu[this.count];
    }

    private Menu[] menus;
    private int count;
    private int addCount = 0;

    public void printAll() {
        if (addCount == 0) {
            System.out.println("\n등록된 메뉴가 없습니다\n");
        } else {
            for (int i = 0; i < addCount; i++) {
                menus[i].print();
            }
        }
        System.out.println("아무키나 누르면 메인메뉴로 돌아갑니다");
        scanner.nextLine();
    }

    public void inputMenu() {
        for (int i = 0; i < count; i++) {
            if (addCount == count) {
                System.out.println("\n더이상 추가할수 없습니다");
                System.out.println("아무키나 누르면 메인메뉴로 돌아갑니다");
                scanner.nextLine();
                break;
            }
            menus[addCount] = new Menu();
            menus[addCount++].input();
            if (addCount < count) {
                System.out.print("\ncontinue(yes/no): ");

                if (scanner.nextLine().equals("yes")) {
                    System.out.println();
                    continue;
                }
            } else {
                System.out.println("\n더이상 추가할수 없습니다");
                System.out.println("아무키나 누르면 메인메뉴로 돌아갑니다");
                scanner.nextLine();
            }
            break;
        }
    }
}

