package com.newlecture.proj1.study_12_13;

import com.newlecture.ex10.Omok;

import java.io.*;
import java.util.Scanner;

public class OmokExample {
    public static void main(String[] args) throws IOException {
        int height = 10, width = 10;
        String[][] board = new String[height][width];
        String[][] saveBoard;

        // 보드판 초기화
        {
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++)
                    board[y][x] = "┼";
            }
        }
        // 보드판 데코레이팅
        {
            for (int x = 0; x < width - 1; x++) {
                board[0][x + 1] = "" + (x + 1);
                board[1][x + 1] = "┬";
                board[height - 1][x + 1] = "┴";
            }
            for (int y = 0; y < height - 1; y++) {
                board[y + 1][0] = "" + (9 - y);
                board[y + 1][1] = "├";
                board[y + 1][width - 1] = "┤";
            }

            board[0][0] = " ";
            board[1][1] = "┌";
            board[1][width - 1] = "┐";
            board[height - 1][1] = "└";
            board[height - 1][width - 1] = "┘";
            // 보드판 배열순서 바꾸기
            String[] firstLine = board[0];
            for (int y = 0; y < height - 1; y++) {
                String[] copy;
                copy = board[y + 1];
                board[y] = board[y + 1];
                board[y + 1] = copy;
            }
            board[height - 1] = firstLine;

            saveBoard = board;
        }
        // 사용자 입력
        Scanner scanner = new Scanner(System.in);
        int turn = 0;
        omok:
        while (true) {
            System.out.println("1.게임시작");
            System.out.println("2.불러오기");
            System.out.println("3.종료");

            // 보드판 초기화
            {
                for (int y = 0; y < height; y++) {
                    for (int x = 0; x < width; x++)
                        board[y][x] = "┼";
                }
            }
            // 보드판 데코레이팅

            for (int x = 0; x < width - 1; x++) {
                board[0][x + 1] = "" + (x + 1);
                board[1][x + 1] = "┬";
                board[height - 1][x + 1] = "┴";
            }
            for (int y = 0; y < height - 1; y++) {
                board[y + 1][0] = "" + (9 - y);
                board[y + 1][1] = "├";
                board[y + 1][width - 1] = "┤";
            }

            board[0][0] = " ";
            board[1][1] = "┌";
            board[1][width - 1] = "┐";
            board[height - 1][1] = "└";
            board[height - 1][width - 1] = "┘";
            // 보드판 배열순서 바꾸기
            String[] firstLine = board[0];
            for (int y = 0; y < height - 1; y++) {
                String[] copy;
                copy = board[y + 1];
                board[y] = board[y + 1];
                board[y + 1] = copy;
            }
            board[height - 1] = firstLine;


            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    while (true) {
                        int x, y;
                        Omok omok = new Omok();

                        for (int y1 = 0; y1 < height; y1++) {
                            for (int x1 = 0; x1 < width; x1++)
                                System.out.printf("%s", board[y1][x1]);
                            System.out.println();
                        }
                        System.out.println();

                        String set;
                        if (turn % 5 == 0) {  // 5번째 차례마다 저장할건지 물어봄
                            System.out.println("메인메뉴로 나가려면 0\n저장하려면 save\n계속 진행하려면 아무키나 누르세요");
                            set = scanner.nextLine();
                            if (set.equals("0")) {
                                break;
                            } else if (set.equals("save")) {
                                System.out.println("저장을 시작합니다");
                                FileOutputStream fos = new FileOutputStream("res/omok.txt");
                                PrintStream ps = new PrintStream(fos);
                                for (int y1 = 0; y1 < height; y1++) {
                                    for (int x1 = 0; x1 < width; x1++)
                                        ps.printf("%s@", saveBoard[y1][x1]);
                                }
                                System.out.println("저장완료");
                                System.out.println("계속하려면 아무키나 누르세요.._");
                                System.in.read();
                                System.out.println();
                                // 저장후 현재상황 출력
                                for (int y1 = 0; y1 < height; y1++) {
                                    for (int x1 = 0; x1 < width; x1++)
                                        System.out.printf("%s", board[y1][x1]);
                                    System.out.println();
                                }
                                System.out.println();
                            }
                        }

                        do {
                            if (turn % 2 == 0) {
                                System.out.println("백돌 차례입니다");
                                System.out.print("x좌표 입력: ");
                                omok.x = Integer.parseInt(scanner.nextLine());
                                System.out.print("y좌표 입력: ");
                                omok.y = (height - 1) - Integer.parseInt(scanner.nextLine());
                                board[omok.y][omok.x] = "●";
                                turn++;
                                System.out.println();
                                if (board[omok.y][omok.x].equals("●") || board[omok.y][omok.x].equals("○"))
                                    System.out.println("중복된 자리입니다");

                            } else if (turn % 2 == 1){
                                System.out.println("흑돌 차례입니다");
                                System.out.print("x좌표 입력: ");
                                omok.x = Integer.parseInt(scanner.nextLine());
                                System.out.print("y좌표 입력: ");
                                omok.y = (height - 1) - Integer.parseInt(scanner.nextLine());
                                board[omok.y][omok.x] = "○";
                                turn++;
                                System.out.println();
                                if (board[omok.y][omok.x].equals("●") || board[omok.y][omok.x].equals("○"))
                                    System.out.println("중복된 자리입니다");

                            }
                        } while (board[omok.y][omok.x].equals("●") || board[omok.y][omok.x].equals("○"));


//                            if (turn % 2 == 0) {
//                                System.out.println("백돌 차례입니다");
//                                System.out.print("x좌표 입력: ");
//                                omok.x = Integer.parseInt(scanner.nextLine());
//                                System.out.print("y좌표 입력: ");
//                                omok.y = (height - 1) - Integer.parseInt(scanner.nextLine());
////                                if (board[omok.y][omok.x].equals("●") || board[omok.y][omok.x].equals("○"))
//
//                                board[omok.y][omok.x] = "●";
//                                turn++;
//                                System.out.println();
//                            } else {
//                                System.out.println("흑돌 차례입니다");
//                                System.out.print("x좌표 입력: ");
//                                omok.x = Integer.parseInt(scanner.nextLine());
//                                System.out.print("y좌표 입력: ");
//                                omok.y = (height - 1) - Integer.parseInt(scanner.nextLine());
//                                board[omok.y][omok.x] = "○";
//                                turn++;
//                                System.out.println();
//                            }
//                        }
                    }
                        break;
                        case 2:
                            System.out.println("마지막 저장파일을 불러옵니다");
                            FileInputStream fis = new FileInputStream("res/omok.txt");
                            Scanner scan = new Scanner(fis);
                            String line = scan.nextLine();
                            String[] tokens;
                            tokens = line.split("@");
                            for (int y1 = 0; y1 < height; y1++) {
                                for (int x1 = 0; x1 < width; x1++)
                                    saveBoard[y1][x1] = tokens[y1 * width + x1];
                            }
                            System.out.println("불러오기 완료");
                            System.out.println("=============");
                            System.out.println("아무키나 입력해주세요 >..._");
                            scanner.nextLine();

                            while (true) {
                                int x, y;
                                Omok omok = new Omok();

                                for (int y1 = 0; y1 < height; y1++) {
                                    for (int x1 = 0; x1 < width; x1++)
                                        System.out.printf("%s", saveBoard[y1][x1]);
                                    System.out.println();
                                }
                                System.out.println();

                                String set;
                                if (turn % 5 == 0) {
                                    System.out.println("메인메뉴로 나가려면 0\n저장하려면 save\n계속 진행하려면 아무키나 누르세요");
                                    set = scanner.nextLine();
                                    if (set.equals("0")) {
                                        break;
                                    } else if (set.equals("save")) {
                                        System.out.println("저장을 시작합니다");
                                        FileOutputStream fos = new FileOutputStream("res/omok.txt");
                                        PrintStream ps = new PrintStream(fos);
                                        for (int y1 = 0; y1 < height; y1++) {
                                            for (int x1 = 0; x1 < width; x1++)
                                                ps.printf("%s@", saveBoard[y1][x1]);
                                        }
                                        System.out.println("저장완료");
                                        System.out.println("계속하려면 아무키나 누르세요.._");
                                        scanner.nextLine();
                                        System.out.println();
                                        // 저장후 현재상황 출력
                                        for (int y1 = 0; y1 < height; y1++) {
                                            for (int x1 = 0; x1 < width; x1++)
                                                System.out.printf("%s", saveBoard[y1][x1]);
                                            System.out.println();
                                        }
                                        System.out.println();
                                    }
                                }

                                if (turn % 2 == 0) {
                                    System.out.println("백돌 차례입니다");
                                    System.out.print("x좌표 입력: ");
                                    omok.x = Integer.parseInt(scanner.nextLine());
                                    System.out.print("y좌표 입력: ");
                                    omok.y = (height - 1) - Integer.parseInt(scanner.nextLine());
                                    board[omok.y][omok.x] = "●";
                                    turn++;
                                    System.out.println();
                                } else {
                                    System.out.println("흑돌 차례입니다");
                                    System.out.print("x좌표 입력: ");
                                    omok.x = Integer.parseInt(scanner.nextLine());
                                    System.out.print("y좌표 입력: ");
                                    omok.y = (height - 1) - Integer.parseInt(scanner.nextLine());
                                    board[omok.y][omok.x] = "○";
                                    turn++;
                                    System.out.println();
                                }
                            }
                            break;

                        case 3:
                            System.out.println("안녕히 가세요");
                            break omok;
                    }
            }


        }
    }