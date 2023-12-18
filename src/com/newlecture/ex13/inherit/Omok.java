package com.newlecture.ex13.inherit;

import java.util.Scanner;

public class Omok {
    public int x;
    public int y;
    public int color;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X : ");
        this.x = Integer.parseInt(scanner.nextLine());
        System.out.print("Y : ");
        this.y = Integer.parseInt(scanner.nextLine());
    }
}
