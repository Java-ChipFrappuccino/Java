package com.newlecture.ex12.oop;

import java.util.Scanner;

public class Board {
    char[][] buf;
    int WIDTH;
    int HEIGHT;

    static Board make () {
        Scanner scan = new Scanner(System.in);
//        System.out.print("행의 개수를 입력하세요 : ");
//        HEIGHT = Integer.parseInt(scan.nextLine());
//        System.out.print("열의 개수를 입력하세요 : ");
//        WIDTH = Integer.parseInt(scan.nextLine());

        Board board = new Board();
        board.HEIGHT = 10;
        board.WIDTH = 20;
        board.buf = new char[board.HEIGHT][board.WIDTH];
//        char[][] board = new char[HEIGHT][WIDTH];

        return board;
    }
    public void init() {
        for (int y = 0; y < this.HEIGHT; y++)
            for (int x = 0; x < this.WIDTH; x++)
                this.buf[y][x] = '┼';
    }

    public void deco() {
        for (int x = 0; x < this.WIDTH; x++) {
            this.buf[0][x] = '┬';
            this.buf[(this.HEIGHT - 1)][x] = '┴';
        }
        for (int y = 0; y < this.HEIGHT; y++) {
            this.buf[y][0] = '├';
            this.buf[y][this.WIDTH - 1] = '┤';
        }

        this.buf[0][0] = '┌';
        this.buf[(this.HEIGHT - 1)][0] = '└';
        this.buf[0][this.WIDTH - 1] = '┐';
        this.buf[this.HEIGHT - 1][this.WIDTH - 1] = '┘';

    }

    public void print() {
        for (int y = 0; y < this.HEIGHT; y++) {
            for (int x = 0; x < this.WIDTH; x++)
                System.out.printf("%c", this.buf[y][x]);

            System.out.println();
        }
    }
}
