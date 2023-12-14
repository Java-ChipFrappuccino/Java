package com.newlecture.ex10;

import com.newlecture.proj1.study_12_12.Omok;

import java.util.Scanner;

public class BufApp {
    public static void main(String[] args) {
//        Omok[] omoks;
        char[] board;
        int count = 0;
// 오목 크기 입력
        final int WIDTH, HEIGHT;
        Scanner scan = new Scanner(System.in);
        {

            System.out.print("행의 개수를 입력하세요 : ");
            HEIGHT = Integer.parseInt(scan.nextLine());
            System.out.print("열의 개수를 입력하세요 : ");
            WIDTH = Integer.parseInt(scan.nextLine());

            board = new char[WIDTH * HEIGHT];
//            omoks = new Omok[WIDTH * HEIGHT];

            for (int y = 0; y < HEIGHT; y++) {
                for (int x = 0; x < WIDTH; x++) {
                    board[y * WIDTH + x] = '┼';
                }
            }
            // board 데코레이팅

            for (int x = 0; x < WIDTH; x++) {
                board[0 * WIDTH + x] = '┬';
                board[(HEIGHT - 1) * WIDTH + x] = '┴';
            }
            for (int y = 0; y < HEIGHT; y++) {
                board[y * WIDTH] = '├';
                board[y * WIDTH + (WIDTH - 1)] = '┤';
            }

            board[0 * WIDTH + 0] = '┌';
            board[(HEIGHT - 1) * WIDTH] = '└';
            board[0 * WIDTH + WIDTH - 1] = '┐';
            board[HEIGHT * WIDTH - 1] = '┘';

            for (int y = 0; y < HEIGHT; y++) {
                for (int x = 0; x < WIDTH; x++) {
                    System.out.printf("%c", board[y * WIDTH + x]);
                }
                System.out.println();
            }
        }

        // 사용자 입력
        {
            int x, y;
            System.out.print("x좌표: ");
            x = Integer.parseInt(scan.nextLine());
            System.out.print("y좌표: ");
            y = Integer.parseInt(scan.nextLine());
            board[y * WIDTH + x] = '○';
        }

        // 입력받은 값 오목판 출력
        {
            for (int y = 0; y < HEIGHT; y++) {
                for (int x = 0; x < WIDTH; x++) {
                    System.out.printf("%c", board[y * WIDTH + x]);
                }
                System.out.println();
            }
        }
    }
}
