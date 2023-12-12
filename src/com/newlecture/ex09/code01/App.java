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
        System.out.println(count);

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
        // 사용자에게 정보 입력받기(전에 배열공간을 늘리기)
        {
            Exam[] temp = new Exam[count + 1];
            for (int i = 0; i < count; i++)
                temp[i] = exams[i];

            exams = temp; // temp가 참조하는 객체를 exams도 참조하게 만듬 , exams가 참조하던 객체는 이름을 잃어버리므로 사라짐
//        }
//            for (Exam : exams[]) {
//        }
            }
            // 사용자 정보 입력받기
        {
            Scanner scanner = new Scanner(System.in);
            Exam exam = new Exam();
            System.out.print("이름: ");
            exam.name = scanner.nextLine();
            System.out.print("국어성적: ");
//            exam.kor = scanner.nextInt();
            exam.kor = Integer.parseInt(scanner.nextLine());

            System.out.print("영어성적: ");
            exam.eng = scanner.nextInt();
            System.out.print("수학성적: ");
            exam.math = scanner.nextInt();
//            exams[++count] = exam;
            exams[count++] = exam;
//            count++;
            System.out.println(count);
        }

        System.out.println(exams[0].name);
        System.out.println(exams[1].name);
        System.out.println(exams[2].name);
        System.out.println(exams[3].name);
        System.out.println(exams[4].name);
        System.out.println(exams[5].name);
//        System.out.println(exams[6].name);
            // 정렬하기
            {
                for (int i = 0; i < count; i++) {
                    int total = exams[i].kor + exams[i].eng + exams[i].math;
                    exams[i].avg = total / 3.0;
                }
                Exam temps;
                for (int i = 0; i < count - 1; i++) {
//                int total = exams[i].kor + exams[i].eng + exams[i].math;
//                exams[i].avg = total / 3.0;
                    for (int k = 0; k < count - (i + 1); k++) {
                        if (exams[k].kor < exams[k + 1].kor) {
                            temps = exams[k];
                            exams[k] = exams[k + 1];
                            exams[k + 1] = temps;
                        }
                    }
                }

            }

            // 위의 데이터들을 출력하기
            {

                for (int i = 0; i < exams.length; i++) {
                    Exam exam = exams[i];
                    String name = exam.name;
                    int kor = exam.kor;
                    int eng = exam.eng;
                    int math = exam.math;
                    int total = kor + eng + math;
                    double avg = exam.avg;
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
