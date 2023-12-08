package com.newlecture.ex09.code01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class App {
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
        Exam[] exams = new Exam[count];

        int korTotal = 0, engTotal = 0, mathTotal = 0;
        // 성적 대입하기
        {
            FileInputStream fis = new FileInputStream("res/ex08.csv");
            Scanner scan = new Scanner(fis);
            scan.nextLine();
            String line;
            String name;
            int kor;
            int eng;
            int math;

            for (int i = 0; i < count; i++) {
                line = scan.nextLine();
                String[] tokens = line.split(",");

                name = tokens[0];
                kor = Integer.parseInt(tokens[1]);
                eng = Integer.parseInt(tokens[2]);
                math = Integer.parseInt(tokens[3]);

                Exam exam = new Exam();
                exam.name = name;
                exam.kor = kor;
                exam.eng = eng;
                exam.math = math;

                exams[i] = exam;
            }
            scan.close();
            fis.close();
        }

        // 위의 데이터들을 출력하기
        {

            for (int i = 0; i < count; i++) {
                Exam exam = exams[i];
                String name = exam.name;
                int kor = exam.kor;
                int eng = exam.eng;
                int math = exam.math;
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
