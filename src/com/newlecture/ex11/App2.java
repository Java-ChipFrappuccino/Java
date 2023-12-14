package com.newlecture.ex11;

import java.util.Scanner;

public class App2 {
    //    static Omok[] omoks;
//    static char[][] board;
    static int count = 0;
    static final int WIDTH = 20, HEIGHT = 7;

    static char[][] makeBoard() {
        Scanner scan = new Scanner(System.in);
//        System.out.print("행의 개수를 입력하세요 : ");
//        HEIGHT = Integer.parseInt(scan.nextLine());
//        System.out.print("열의 개수를 입력하세요 : ");
//        WIDTH = Integer.parseInt(scan.nextLine());
        char[][] board = new char[HEIGHT][WIDTH];

        return board;
    }

    static Omok[] makeOmokList() {
        Omok[] omoks = new Omok[WIDTH * HEIGHT];
        return omoks;
    }

    static void initBoard(char[][] board) {
        for (int y = 0; y < HEIGHT; y++)
            for (int x = 0; x < WIDTH; x++)
                board[y][x] = '┼';
    }

    static void decoBoard(char[][] board) {
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
    }

    static void printBoard(char[][] board) {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++)
                System.out.printf("%c", board[y][x]);

            System.out.println();
        }
    }

    static void inputOmok(char[][] board, Omok[] omoks) {

        int x, y;
        Scanner scan = new Scanner(System.in);
        System.out.print("오목 x좌표:");
        x = Integer.parseInt(scan.nextLine());
        System.out.print("오목 y좌표:");
        y = Integer.parseInt(scan.nextLine());
        Omok omok = new Omok();
        omok.x = x;
        omok.y = y;
        omoks[count++] = omok;
        board[y][x] = '○';
    }

    public static void main(String[] args) {
        char[][] board = makeBoard();
        Omok[] omoks = makeOmokList();

        initBoard(board);
        decoBoard(board);
        printBoard(board);
        inputOmok(board, omoks);
        printBoard(board);
    }
}