package com.newlecture.proj1.study_12_15.car;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1번문제
        {
            int user;
            while (true) {
                int scan = Integer.parseInt(scanner.nextLine());
                user = scan;
                if (0 < user && user < 10) {
                    for (int i = 0; i < user; i++)
                        System.out.print("* ");

                    System.out.println();
                } else {
                    for (int i = 0; i < 1; i++)
                        System.out.print("* ");

                    System.out.println();
                    break;
                }
            }
        }
        // 2번문제
        {
            int user;
            int max = 0;
            for (int i = 0; i < 3; i++) {
                int scan = Integer.parseInt(scanner.nextLine());
                user = scan;
//                System.out.println(user);
                if (max < user) {
                    max = user;
                }
            }
            System.out.println("MAX: " + max);
        }

    }
}
