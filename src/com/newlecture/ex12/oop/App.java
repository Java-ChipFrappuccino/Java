package com.newlecture.ex12.oop;

public class App {
    public static void main(String[] args) {
        Board board = Board.make();
//        Omok[] omoks = makeOmokList();

        board.init();
        board.deco();
        board.print();
//        inputOmok(board, omoks);
        board.print();
    }
}
