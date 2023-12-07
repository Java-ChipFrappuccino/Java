package com.newlecture.ex08.string;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExamApp {
    public static void main(String[] args) throws IOException {
//        //
//        FileInputStream fis = new FileInputStream("res/ex08.csv");
//        Scanner scan = new Scanner(fis);
//        int korTotal = 0, engTotal = 0, mathTotal = 0;
//        double student = 0, korTotalAvg, engTotalAvg, mathTotalAvg;
//        String line;
//        scan.nextLine();
//
//        while (scan.hasNextLine()) {
//            student++;
//            line = scan.nextLine();
//            String[] tokens = line.split(",");
//
//            String name = tokens[0];
//            int kor = Integer.parseInt(tokens[1]),
//                eng = Integer.parseInt(tokens[2]),
//                math = Integer.parseInt(tokens[3]),
//                total = kor + eng + math;
//            double avg = total / 3.0;
//
//            korTotal += kor;
//            engTotal += eng;
//            mathTotal += math;
//            System.out.printf("이름: %s / 국어: %d , 영어: %d , 수학: %d / 총점: %d , 평균: %5.2f\n",
//                                name, kor , eng , math , total , avg);
//        }
//        System.out.printf("총 인원수: %.0f / 국어 총점: %d , 영어 총점: %d , 수학 총점: %d\n",
//                student , korTotal , engTotal , mathTotal);
////        korTotalAvg = korTotal / student;
////        engTotalAvg = engTotal / student;
////        mathTotalAvg = mathTotal / student;
//        System.out.printf("\t\t\t국어 평균: %5.2f , 영어 평균: %5.2f , 수학 평균: %5.2f", korTotal / student , engTotal / student , mathTotal / student);
//        scan.close();
//        fis.close();

        /*흐름제어 확인퀴즈======================================================
        int i=1;                //2     2                3         2     2
        System.out.println((++i) + (i) + (2) -(1) + (i++) - (--i) - (i));
        System.out.println(i);

        int i=0;        // 2   3     2   2%2    1/3     4     3  /  2
        System.out.println(i+ i++ + ++i/i%2 + (++i/3) + i++ - ++i/i--);
        System.out.println(i);//

        exit:
        for (int i = 0; i < 5; i++) {
            while (true) {
                i++;
                if (i==3)
                    break;
                if (i==3)
                    continue;
                if (i>10)
                    break exit;
                System.out.println(i);
            }

        }

        int[] nums = new int[10];
        int idx = 0;

        for (int i = 0; i < 3; i++) {
            nums[i] = i + 1;
        }

        // num[0] = 1
        // num[1] = 2
        // num[2] = 3

        for (int i = 0; i < 3; i++) {
            nums[++idx] = idx + 1;
        }
        // num[1] = 2
        // num[2] = 3
        // num[3] = 4

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d", nums[i]);
        }
        // num[0] = 1
        // num[1] = 2
        // num[2] = 3
        // num[3] = 4
        // num[4] = 0
        // num[5] = 0
        // num[6] = 0
        // num[7] = 0
        // num[8] = 0
        // num[9] = 0

         */
    }
}