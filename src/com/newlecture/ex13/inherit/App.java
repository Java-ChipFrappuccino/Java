package com.newlecture.ex13.inherit;


public class App {
    public static void main(String[] args) {
        Board board = new Board();

        board.print();
        board.deco();
        board.print();
        // 오목을 입력(input) 받고
        Omok omok = new Omok();
        omok.input();

        // 오목을 보드에 두고 (put)
        board.put(omok);

        // 보드판을 출력
        board.print();
    }
}
