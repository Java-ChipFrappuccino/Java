package com.newlecture.ex11;

import java.util.Scanner;

public class App3 {
    //    static Omok[] omoks;
//    static char[][] board;
    static int count = 0;
//    static final int WIDTH = 20, HEIGHT = 7;

    static Board makeBoard() {
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

//    static Omok[] makeOmokList() {
//        Omok[] omoks = new Omok[WIDTH * HEIGHT];
//        return omoks;
//    }

    static void initBoard(Board board) {
        for (int y = 0; y < board.HEIGHT; y++)
            for (int x = 0; x < board.WIDTH; x++)
                board.buf[y][x] = '┼';
    }

    static void decoBoard(Board board) {
        for (int x = 0; x < board.WIDTH; x++) {
            board.buf[0][x] = '┬';
            board.buf[(board.HEIGHT - 1)][x] = '┴';
        }
        for (int y = 0; y < board.HEIGHT; y++) {
            board.buf[y][0] = '├';
            board.buf[y][board.WIDTH - 1] = '┤';
        }

        board.buf[0][0] = '┌';
        board.buf[(board.HEIGHT - 1)][0] = '└';
        board.buf[0][board.WIDTH - 1] = '┐';
        board.buf[board.HEIGHT - 1][board.WIDTH - 1] = '┘';
    }

    static void printBoard(Board board) {
        for (int y = 0; y < board.HEIGHT; y++) {
            for (int x = 0; x < board.WIDTH; x++)
                System.out.printf("%c", board.buf[y][x]);

            System.out.println();
        }
    }

    static void inputOmok(Board board, Omok[] omoks) {

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
        board.buf[y][x] = '○';
    }

    public static void main(String[] args) {
        Board board = makeBoard();
//        Omok[] omoks = makeOmokList();

        initBoard(board);
        decoBoard(board);
        printBoard(board);
//        inputOmok(board, omoks);
        printBoard(board);
    }
}