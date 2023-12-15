package com.newlecture.proj1.study_12_14;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class AppTest {
    static int countStudent() throws IOException {
        int count = 0;
        FileInputStream fis = new FileInputStream("res/ex08.csv");
        Scanner scan = new Scanner(fis);
        if (scan.hasNextLine())
            scan.nextLine();

        // 반복해서 개수 알아보기
        while (scan.hasNextLine()) {
            count++;
            scan.nextLine();
        }

        scan.close();
        fis.close();

//        System.out.println(count);
        return count;
    }


    static Exam[] load(int count) throws IOException

    // 성적　로드하기
    {
        Exam[] exams = new Exam[count];
        FileInputStream fis = new FileInputStream("res/ex08.csv");
        Scanner scan = new Scanner(fis);
        if (scan.hasNextLine())
            scan.nextLine();

        for (int i = 0; i < count; i++) {
            String line = scan.nextLine();

            String[] tokens = line.split(",");
            String name = tokens[0];
            int kor = Integer.parseInt(tokens[1]);
            int eng = Integer.parseInt(tokens[2]);
            int math = Integer.parseInt(tokens[3]);

            Exam exam = new Exam();
            exam.name = name;
            exam.kor = kor;
            exam.eng = eng;
            exam.math = math;

            exams[i] = exam;
        }

        scan.close();
        fis.close();

        System.out.println();
        return exams;
    }

    static Exam[] addStudent(Exam[] exams, int count)
    // 공간늘리기
    {
        Exam[] temp = new Exam[count + 1];

        // 이주시키기
        for (int i = 0; i < count; i++)
            temp[i] = exams[i];

        // temp가 참조하는 객체를 exams 에게도 참조하도록 수정
        exams = temp;
        System.out.println(exams.length);
        return exams;
    }

    static int inputScore(Exam[] exams, int count)
    //      --　성적입력　---------------------------------

    {
        Scanner scan = new Scanner(System.in);

        Exam exam = new Exam();

        System.out.printf("name:");
        String name = scan.nextLine();

        System.out.printf("kors:");
        int kor = Integer.parseInt(scan.nextLine());

        System.out.printf("eng: ");
        int eng = Integer.parseInt(scan.nextLine());

        System.out.printf("math: ");
        int math = Integer.parseInt(scan.nextLine());

        exam.name = name;
        exam.eng = eng;
        exam.kor = kor;
        exam.math = math;

        exams[count++] = exam;
//            count++;
        return count;
    }

    static void sortScore(Exam[] exams, int count) {
        for (int i = 0; i < count - 1; i++)
            for (int j = 0; j < count - 1 - i; j++)
                if (exams[j].kor < exams[j + 1].kor) {
                    Exam temp;
                    temp = exams[j];
                    exams[j] = exams[j + 1];
                    exams[j + 1] = temp;
                }

    }

    static void printScore(Exam[] exams, int count)
    // 위의 데이터들을 출력하기
    {
        // 첫 번째 학생의 성적을 출력해보시오
        // names[0], kors[0], engs[0], maths[0]
        for (int i = 0; i < count; i++) {
//            String name = names[i];
            Exam exam = exams[i];

            String name = exam.name;
            int kor = exam.kor;//kors[i];
            int eng = exam.eng;//engs[i];
            int math = exam.math;//maths[i];
            int total = kor + eng + math;
            double avg = total / 3.0;

            System.out.printf("name=%s, kor=%d, eng=%d, math=%d, total=%d, avg=%.2f\n", name, kor, eng, math, total,
                    avg);
        }
    }

    // int korTotal = kors[0]+kors[1]+kors[2]+.args..;


    public static void main(String[] args) throws IOException {

        int count = countStudent();
        Exam[] exams = load(count);
        System.out.println(exams.length);
//        System.out.println(exams.hashCode());
        addStudent(exams, count);
        System.out.println(exams.length);
//        System.out.println(exams.hashCode());
//        count = inputScore(exams, count);
//        sortScore(exams, count);
//        printScore(exams, count);

    }
}