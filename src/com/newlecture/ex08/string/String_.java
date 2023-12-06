package com.newlecture.ex08.string;

import java.util.logging.Filter;

public class String_ {
    public static void main(String[] args) {
//        String name1 = "아이유";
//        String name2 = "아이유";
//
//        String name3 = "아이유";
//        String name4 = new String("아이유");
//
//        System.out.println(name1 == name2);
//        System.out.println(name3 == name4);
//        System.out.println(name3.equals(name4));
//        System.out.println(name1 == "아이유"); //?
//
//        String fileName = "photo.jpg";
//        System.out.println(fileName.length());
//        System.out.println(fileName.indexOf("."));
//        System.out.println(fileName.substring(0, 3)); // endIndex - beginIndex의 값만큼 beginIndex에서 출력
//        System.out.println(fileName.substring(0, 5));
//        System.out.println(fileName.substring(0, fileName.indexOf(".")));
//        int endIndex = fileName.indexOf(".");
//        System.out.println(fileName.substring(0, endIndex));

        String fileNames = "photoz.jpg";
        for (int i = 0; i < fileNames.length(); i++) {
            if (fileNames.substring(i, i + 1).equals("z")) {
                System.out.println("\'z\'가 있습니다");
                System.out.println("\'z\'의 인덱스는 " + fileNames.indexOf("z") + "입니다");
            }
        }
            System.out.println("\'z\'가 없습니다");
//
        int idx = fileNames.indexOf("z");
//        if (idx == -1) {
//            System.out.println("없음");
//        } else {
//            System.out.println("있음");
//            System.out.println(idx);
//        }

//        String m = (idx == -1) ? "없음" : String.valueOf(idx);
//        System.out.println(m);
    }
}
