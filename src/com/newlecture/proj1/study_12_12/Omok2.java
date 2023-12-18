package com.newlecture.proj1.study_12_12;

import java.util.Scanner;

public class Omok2 {
    public static void main(String[] args) {

        Omok[] omoks;
        int count = 0;

        char[] board;
// 오목 크기 입력
        final int WIDTH, HEIGHT;
        {
            Scanner scan = new Scanner(System.in);

            System.out.print("행의 개수를 입력하세요 : ");
            HEIGHT = Integer.parseInt(scan.nextLine());
            System.out.print("열의 개수를 입력하세요 : ");
            WIDTH = Integer.parseInt(scan.nextLine());

            board = new char[WIDTH * HEIGHT];
//            omoks = new Omok[HEIGHT * WIDTH];
        }

// board 초기화
//            board[0] = '┌';
//            board[1] = '┬';
//            board[2] = '┐';
//            board[3] = '├';
//            board[4] = '┼';
//            board[5] = '┤';
//            board[6] = '└';
//            board[7] = '┴';
//            board[8] = '┘';

        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                if (x == 0 && y == 0)
                    board[count++] = '┌';
                else if (x == WIDTH - 1 && y == 0)
                    board[count++] = '┐';
                else if (x == 0 && y == HEIGHT - 1)
                    board[count++] = '└';
                else if (x == WIDTH - 1 && y == HEIGHT - 1)
                    board[count++] = '┘';
                else if (y == 0)
                    board[count++] = '┬';
                else if (x == WIDTH - 1)
                    board[count++] = '┤';
                else if (x == 0)
                    board[count++] = '├';
                else if (y == HEIGHT - 1)
                    board[count++] = '┴';
                else
                    board[count++] = '┼';
            }
        }
//        System.out.println(board[2]);

// board 출력

//            for()
//                System.out.printf("%c%c%c",board[0],board[1],board[2]);

        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                System.out.printf("%c", board[y* WIDTH + x]); // width 한줄이 넘어갈때마다 한줄만큼 더해주고(*) 한칸만큼 +
            }
            System.out.println();
        }
    }
}
