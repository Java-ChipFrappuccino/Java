package com.newlecture.ex12.oop;

public class App {
    public static void main(String[] args) {
        Board board = Board.make();
//        Omok[] omoks = makeOmokList();

        board.init();
        board.print();
        board.deco();
//        inputOmok(board, omoks);
        board.print();
    }
}
