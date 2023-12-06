package com.newlecture.proj1.study_12_01_exercise;

import java.io.*;
import java.util.Scanner;

public class ReverseParrot {
    public static void main(String[] args) throws IOException {
//        뉴렉이네 앵무새는 숫자를 말해주면 거꾸로 말하는 앵무새에요.
//
//                예를 들어 12345를 말하면 54321을 말해요. 뉴렉이네 앵무새를 구현해보세요
//
//
//        입력: 12345
//
//        출력: 54321
//
//        입력: 32456
//        출력: 65423
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        System.out.print("입력: ");
        int number = scanner.nextInt();
        FileOutputStream fos = new FileOutputStream("res/Parrot.txt");
        PrintStream ps = new PrintStream(fos);
        ps.print(number);
        System.out.println(number);


//        int length = (int)(Math.log10(number)+1);
//        System.out.println(length);
//        System.out.println();
//
        FileInputStream fis = new FileInputStream("res/Parrot.txt");
//        Scanner scanner1 = new Scanner(fis);
//        int t = scanner1.nextInt();
//        System.out.println(t);
        while (true) {
            int a = fis.read();
            if (a == -1) {
                break;
            }
            System.out.print(a + " ");
        }


//        Scanner sc = new Scanner(System.in);
//        System.out.print("입력 : ");
//        int inputData = sc.nextInt();
//       int   tmp = inputData;
//       int total = 0;
//        while(true) {
//            /*
//             * tmp = 123;
//             * total = 0 + 3;
//             * tmp = 12;
//
//             * total = 3 * 10;
//             * total = 30 + 2;
//             * tmp = 1;
//
//             * total = 32 * 10;
//             * total = 320 + 1;
//             */
//            total = total * 10;
//            total = total + tmp % 10;
//            tmp = tmp / 10;
//            if(tmp == 0)
//                break;
//        }
//        System.out.println(inputData + "의 거꾸로된 정수 : " + total);


//        int a = fis.read();
//        int b = fis.read();
//        int c = fis.read();
//        int d = fis.read();
//        int e = fis.read();
//        int f = fis.read();
//        int g = fis.read();
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(g);

//        for (int i = 0; i < 0; i++) {
//
//        }
    }
}
