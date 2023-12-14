package com.newlecture.ex10;

import javax.management.openmbean.CompositeType;
import java.util.Scanner;

public class MultipleArray {
    public static void main(String[] args) {
        final int WIDTH = 20, HEIGHT = 10;
        Omok[] omoks = new Omok[HEIGHT*WIDTH];
        int count = 0;
        {
            Scanner scan = new Scanner(System.in);

//            System.out.print("행의 개수를 입력하세요 : ");
//            HEIGHT = scan.nextInt();
//            System.out.print("열의 개수를 입력하세요 : ");
//            WIDTH = scan.nextInt();
            for (int y = 0; y < HEIGHT; y++) {
                for (int x = 0; x < WIDTH; x++) {
                    if (x == 0 && y == 0)
                        System.out.print("┌");
                    else if (x == WIDTH - 1 && y == 0)
                        System.out.print("┐");
                    else if (x == 0 && y == HEIGHT - 1)
                        System.out.print("└");
                    else if (x == WIDTH - 1 && y == HEIGHT - 1)
                        System.out.print("┘");
                    else if (y == 0)
                        System.out.print("┬");
                    else if (x == WIDTH - 1)
                        System.out.print("┤");
                    else if (x == 0)
                        System.out.print("├");
                    else if (y == HEIGHT - 1)
                        System.out.print("┴");
                    else
                        System.out.print("┼");
                }
                System.out.println();
            }
        }
        while (true) {
            //오목 입력
            {
                int x, y;
                Scanner scan = new Scanner(System.in);
                System.out.print("오목 x좌표: ");
                x = Integer.parseInt(scan.nextLine());
                System.out.print("오목 y좌표: ");
                y = Integer.parseInt(scan.nextLine());

                Omok omok = new Omok();
                omok.x = x;
                omok.y = y;
                omoks[count++] = omok;

            }
            // 오목 출력
            {
                // = "❍"
                for (int y = 0; y < HEIGHT; y++) {
                    for (int x = 0; x < WIDTH; x++) {
                        boolean haveToPrint = false;
                        //배열에서 현재 x,y 위치에 있는 오목이 있는지 알아본다.
                        for (int i = 0; i < count; i++) {
                            if (x == omoks[i].x && y == omoks[i].y) {
                                haveToPrint = true;
                            }
                        }
//                        if (x == omoks[count-1].x && y == omoks[count-1].y) {
//                            System.out.print("❍");
//                        }
                        if (haveToPrint) {
                            System.out.print("❍");
                        }
                        else if (x == 0 && y == 0) {
                            System.out.print("┌");
                        }
                        else if (x == WIDTH - 1 && y == 0)
                            System.out.print("┐");
                        else if (x == 0 && y == HEIGHT - 1)
                            System.out.print("└");
                        else if (x == WIDTH - 1 && y == HEIGHT - 1)
                            System.out.print("┘");
                        else if (y == 0)
                            System.out.print("┬");
                        else if (x == WIDTH - 1)
                            System.out.print("┤");
                        else if (x == 0)
                            System.out.print("├");
                        else if (y == HEIGHT - 1)
                            System.out.print("┴");
                        else
                            System.out.print("┼");
                    }
                    System.out.println();
                }
            }

        }
    }
}

