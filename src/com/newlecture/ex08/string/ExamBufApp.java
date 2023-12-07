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
//        System.out.println(count);

        // 성적에 대한 배열(버퍼)을 준비
        String[] names = new String[count];
//        String[] tokens = new String[count];
        int[] kors = new int[count];
        int[] engs = new int[count];
        int[] maths = new int[count];
        int korTotal = 0, engTotal = 0, mathTotal = 0;
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
//                    int totals = kors[i] + engs[i] + maths[i];
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
        // 성적순 정렬

//        int x;
//        x = kors[0];
//        kors[0] = kors[2];
//        kors[2] = x;
//
//        int[] temp;
//        temp = kors;
//        kors = engs;
//        engs = temp;
        /*
        //
         \     정렬패턴
         */
        int list = 0;
        System.out.println("===============================");
        for (int i = 0; i < count; i++) {
            System.out.printf("%d ", kors[i]);
        }
        System.out.println();
        System.out.println("===============================");
        for (int i = 0; i < count-1; i++) {
            for (int k = 0; k < count - (i+1); k++) {
                if (kors[k] > kors[k + 1]) {
                    list = kors[k + 1];
                    kors[k + 1] = kors[k];
                    kors[k] = list;
                }
            }
        }
//        for (int i = 0; i < count-1; i++) {
//            if (kors[i] > kors[i + 1]) {
//                list = kors[i+1];
//                kors[i+1]= kors[i];
//                kors[i]=list;
//            }
//        }
//        for (int i = 0; i < count-2; i++) {
//            if (kors[i] > kors[i + 1]) {
//                list = kors[i+1];
//                kors[i+1]= kors[i];
//                kors[i]=list;
//            }
//        }
//        for (int i = 0; i < count-3; i++) {
//            if (kors[i] > kors[i + 1]) {
//                list = kors[i+1];
//                kors[i+1]= kors[i];
//                kors[i]=list;
//            }
//        }

        for (int i = 0; i < count; i++) {
            System.out.printf("%d ", kors[i]);
        }
        System.out.println();
        System.out.println("===============================");

        // 위의 데이터들을 출력하기
        {

            for (int i = 0; i < count; i++) {
                String name = names[i];
                int kor = kors[i];
                int eng = engs[i];
                int math = maths[i];
                int total = kor + eng + math;
                double avg = total / 3.0;
                korTotal += kor;
                engTotal += eng;
                mathTotal += math;
                System.out.printf("이름: %s / 국어: %d , 영어: %d , 수학: %d / 총점: %d , 평균: %5.2f\n",
                        name, kor, eng, math, total, avg);
            }
            System.out.printf("총 인원수: %d / 국어 총점: %d , 영어 총점: %d , 수학 총점: %d\n",
                    count, korTotal, engTotal, mathTotal);
            System.out.printf("\t\t\t국어 평균: %5.2f , 영어 평균: %5.2f , 수학 평균: %5.2f"
                    , korTotal / 5.0, engTotal / 5.0, mathTotal / 5.0);
        }

    }

}