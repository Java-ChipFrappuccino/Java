package com.newlecture.proj1.study_12_12;

import com.newlecture.ex10.Omok;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = 11, height = 6;
        int count = 0;
        int turn = 0;
        int color = 1;
        char[] omok = new char[width * height];
        Omok[] omoks = new Omok[width * height];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (x == 0 && y == 0)
                    omok[count++] = '┌';
                else if (x == width - 1 && y == 0)
                    omok[count++] = '┐';
                else if (x == 0 && y == height - 1)
                    omok[count++] = '└';
                else if (x == width - 1 && y == height - 1)
                    omok[count++] = '┘';
                else if (y == 0)
                    omok[count++] = '┬';
                else if (x == 0)
                    omok[count++] = '├';
                else if (x == width - 1)
                    omok[count++] = '┤';
                else if (y == height - 1)
                    omok[count++] = '┴';
                else
                    omok[count++] = '┼';
            }
        }

        for (int k = 0; k < height; k++) {
            for (int x = 0; x < width; x++) {
                System.out.printf("%c", omok[k * width + x]);
            }
            System.out.println();
        }
        while (true) {
            if ((turn % 2) == 0)
                System.out.println("흑돌차례");
            else
                System.out.println("백돌차례");

            Omok omokc = new Omok();
            System.out.print("x: ");
            omokc.x = Integer.parseInt(scanner.nextLine());
            System.out.print("y: ");
            omokc.y = Integer.parseInt(scanner.nextLine());
            omokc.color = color++;
            omoks[turn++] = omokc;

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    if (omoks[turn - 1].x == x && omoks[turn - 1].y == y) {
                        if (omoks[turn - 1].color % 2 == 0) {
                            omok[y * width + x] = '❍';
                            System.out.print("❍");
                        } else {
                            omok[y * width + x] = '●';
                            System.out.print("●");
                        }
                    } else
                        System.out.printf("%c", omok[y * width + x]);
                }
                System.out.println();
            }
        }
    }
}