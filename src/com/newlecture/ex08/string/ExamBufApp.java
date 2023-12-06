package com.newlecture.ex08.string;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExamBufApp {
    public static void main(String[] args) throws IOException {
        // 현재 데이터의 개수를 얻기
        int count = 0;
        {
            FileInputStream fis = new FileInputStream("res/ex08.csv");
            Scanner scan = new Scanner(fis);
            scan.nextLine();
            // 반복해서 개수 알아보기
            while (scan.hasNextLine()) {
                scan.nextLine();
                count++;
            }

            scan.close();
            fis.close();
        }
        System.out.println(count);

        // 성적에 대한 배열(버퍼)을 준비
        String[] names = new String[count];
//        String[] tokens = new String[count];
        int[] kors = new int[count];
        int[] engs = new int[count];
        int[] maths = new int[count];
        // 성적 대입하기
        {
            FileInputStream fis = new FileInputStream("res/ex08.csv");
            Scanner scan = new Scanner(fis);
            scan.nextLine();
            String line;

//            while (scan.hasNextLine()) {
//                for (int i = 0; i < count; i++) {
//                    line = scan.nextLine();
//                    String[] tokens = line.split(",");
//
//                    names[i] = tokens[0];
//                    kors[i] = Integer.parseInt(tokens[1]);
//                    engs[i] = Integer.parseInt(tokens[2]);
//                    maths[i] = Integer.parseInt(tokens[3]);
//
//                    int total = kors[i] + engs[i] + maths[i];
//
//                    System.out.printf("이름: %s / 국어: %d , 영어: %d , 수학: %d / 총점: %d , 평균: %5.2f\n",
//                            names[i], kors[i], engs[i], maths[i], total, total/3.0);
//                }
//            }
            for (int i = 0; i < count; i++) {
                line = scan.nextLine();
                String[] tokens = line.split(",");

                names[i] = tokens[0];
                kors[i] = Integer.parseInt(tokens[1]);
                engs[i] = Integer.parseInt(tokens[2]);
                maths[i] = Integer.parseInt(tokens[3]);
            }
            scan.close();
            fis.close();
        }
        // 위의 데이터들을 출력하기
        {
//            for (int i = 0; i < count; i++) {
                System.out.printf("이름: %s / 국어: %d , 영어: %d , 수학: %d / 총점: %d , 평균: %5.2f\n",
                        names[0], kors[0], engs[0], maths[0], 0, 0.0);
//            }
        }
    }
}
