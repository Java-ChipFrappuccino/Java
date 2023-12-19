package com.newlecture.proj1.study_12_19.exercise;

import java.util.Scanner;

public class Menu {
    private int id;
    private String korName;
    private String engName;
    private String image;
    private int price;
    private int like;

    public void print() {
        System.out.printf("[%d] [%s] %s (%s) / %d원 / 좋아요(%d)\n\n",id,image,korName,engName,price,like);
    }

    public  void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[메뉴 입력]");
        System.out.print("id 입력: ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.print("image 경로: ");
        image = scanner.nextLine();
        System.out.print("korName 입력: ");
        korName = scanner.nextLine();
        System.out.print("engName 입력: ");
        engName = scanner.nextLine();
        System.out.print("가격 입력: ");
        price = Integer.parseInt(scanner.nextLine());
        System.out.print("좋아요 입력: ");
        like = Integer.parseInt(scanner.nextLine());
    }
}
