package com.newlecture.proj1.study_12_04;

import java.sql.Struct;
import java.util.Scanner;

public class DoraemonBooks {
    public static void main(String[] args) {
// 뉴렉이는 도라에몽에게 신기한 책장을 받았어요.

// 이 책장은 넣는 책의 수에 상관없이 항상 크기를 두 배로 늘려요. 이 책장의 동작을 구현해보세요


// 입출력 case 1


// 책의 개수를 입력하세요 : 3
// 책들을 입력하세요 :

// 오만과 편견

// 햄릿

// 반지의 제왕

//

// 출력:

// 오만과 편견

// 햄릿

// 반지의 제왕

// null

// null

// null


// 입출력 case 2


// 책의 개수를 입력하세요 : 1
// 책들을 입력하세요 :

// 오만과 편견

//

// 출력:

// 오만과 편견

// null
//        String booksName;
        Scanner scanner = new Scanner(System.in);
        int booksCount;
        System.out.print("책의 개수를 입력하세요: ");
        booksCount = scanner.nextInt();
        scanner.nextLine();
        String[] booksName = new String[booksCount * 2];

        for (int i = 0; i < booksName.length / 2; i++) {
            System.out.print("\n책들을 입력하세요: ");
            booksName[i] = scanner.nextLine();
        }
        for (int i = 0; i < booksName.length; i++) {
            System.out.println("\n" + booksName[i]);
        }

    }
}
