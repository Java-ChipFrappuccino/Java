package com.newlecture.proj1.study_12_19.exercise;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MenuList list = new MenuList();
        boolean run = true;
        while (run) {
            int menu = inputMenu();

            switch (menu) {
                case 1:
                    list.printAll();
                    break;
                case 2:
                    list.inputMenu();
                    break;
                case 3:
                    run = false;
                    break;
                default:
                    System.out.println("오류");
            }
        }

        System.out.println("Bye~");
    }
    private static int inputMenu() {
        System.out.println("[메뉴관리]");
        System.out.println("1.메뉴목록");
        System.out.println("2.메뉴추가");
        System.out.println("3.종료");
        System.out.print(">");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        return input;
    }
}
