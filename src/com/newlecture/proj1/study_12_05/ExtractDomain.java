package com.newlecture.proj1.study_12_05;

import java.util.Scanner;

public class ExtractDomain {
    public static void main(String[] args) {
// 뉴렉이네 쇼핑몰은 이메일 회원가입을 지원해요

// 뉴렉이는 어떤 사이트(도메인)의 회원들이 쇼핑몰을 이용하는지 데이터를 수집하려해요

// 뉴렉이를 도와 사용자 이메일의 도메인을 추출하는 프로그램을 작성해주세요

// 입력 : newlec@newlecture.com
// 출력 : newlecture.com

// 입력 : tom@never.io

// 출력 : never.io
        String user,domain;
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력 : ");
        user = scanner.nextLine();

        domain = user.substring(user.indexOf("@")+1);
        System.out.print("출력 : " + domain);

    }
}
