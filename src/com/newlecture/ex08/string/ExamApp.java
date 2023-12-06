package com.newlecture.ex08.string;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExamApp {
    public static void main(String[] args) throws IOException {
        //
        FileInputStream fis = new FileInputStream("res/ex08.csv");
        Scanner scan = new Scanner(fis);
        int korTotal = 0, engTotal = 0, mathTotal = 0;
        double student = 0, korTotalAvg, engTotalAvg, mathTotalAvg;
        String line;
        scan.nextLine();

        while (scan.hasNextLine()) {
            student++;
            line = scan.nextLine();
            String[] tokens = line.split(",");

            String name = tokens[0];
            int kor = Integer.parseInt(tokens[1]),
                eng = Integer.parseInt(tokens[2]),
                math = Integer.parseInt(tokens[3]),
                total = kor + eng + math;
            double avg = total / 3.0;

            korTotal += kor;
            engTotal += eng;
            mathTotal += math;
            System.out.printf("이름: %s / 국어: %d , 영어: %d , 수학: %d / 총점: %d , 평균: %5.2f\n",
                                name, kor , eng , math , total , avg);
        }
        System.out.printf("총 인원수: %.0f / 국어 총점: %d , 영어 총점: %d , 수학 총점: %d\n",
                student , korTotal , engTotal , mathTotal);
//        korTotalAvg = korTotal / student;
//        engTotalAvg = engTotal / student;
//        mathTotalAvg = mathTotal / student;
        System.out.printf("\t\t\t국어 평균: %5.2f , 영어 평균: %5.2f , 수학 평균: %5.2f", korTotal / student , engTotal / student , mathTotal / student);
        scan.close();
        fis.close();
    }

}


