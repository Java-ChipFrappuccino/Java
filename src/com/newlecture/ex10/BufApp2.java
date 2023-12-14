package com.newlecture.ex10;

import java.util.Scanner;

public class BufApp2 {
    public static void main(String[] args) {
//        Omok[] omoks;
        char[][] board;
        int count = 0;
// 오목 크기 입력
        final int WIDTH = 20, HEIGHT = 7; //가로로 늘어나는 칸수(세로줄) / 세로로 늘어나는 칸수(가로줄)
        {
            Scanner scan = new Scanner(System.in);

//            System.out.print("행의 개수를 입력하세요 : ");
//            HEIGHT = Integer.parseInt(scan.nextLine());
//            System.out.print("열의 개수를 입력하세요 : ");
//            WIDTH = Integer.parseInt(scan.nextLine());

            board = new char[HEIGHT][WIDTH];
//            omoks = new Omok[WIDTH * HEIGHT];

            for (int y = 0; y < HEIGHT; y++) {
                for (int x = 0; x < WIDTH; x++) {
                    board[y][x] = '┼';
                }
            }
            // board 데코레이팅

            for (int x = 0; x < WIDTH; x++) {
                board[0][x] = '┬';
                board[(HEIGHT - 1)][x] = '┴';
            }
            for (int y = 0; y < HEIGHT; y++) {
                board[y][0] = '├';
                board[y][WIDTH - 1] = '┤';
            }

            board[0][0] = '┌';
            board[(HEIGHT - 1)][0] = '└';
            board[0][WIDTH - 1] = '┐';
            board[HEIGHT - 1][WIDTH - 1] = '┘';

            for (int y = 0; y < HEIGHT; y++) {
                for (int x = 0; x < WIDTH; x++) {
                    System.out.printf("%c", board[y][x]);
                }
                System.out.println();
            }
        }

        // 사용자 입력
        {
            int x, y;
//            System.out.print("x좌표: ");
//            x = Integer.parseInt(scan.nextLine());
//            System.out.print("y좌표: ");
//            y = Integer.parseInt(scan.nextLine());
//            board[y][x] = '○';
            board[1][1] = '○';
            board[2][1] = '●';
            board[1][2] = '○';
        }

        // 입력받은 값 오목판 출력
        {
            for (int y = 0; y < HEIGHT; y++) {
                for (int x = 0; x < WIDTH; x++) {
                    System.out.printf("%c", board[y][x]);
                }
                System.out.println();
            }
            System.out.println("====================");
        }
        // swap
        {
//        board[1] = new char[49];
        }
        // board 출력
        {
            for (int y = 0; y < HEIGHT; y++) {
                for (int x = 0; x < WIDTH; x++) {
                    System.out.printf("%c", board[y][x]);
                }
                System.out.println();
            }
        }

    }
}
