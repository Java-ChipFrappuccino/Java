package com.newlecture.proj1.study_12_04;

public class SearchAndReplace {
    public static void main(String[] args) {
        // “HelloWorld!”를 출력하고자 만든 문자 배열에 아래와 같이 문자 'l'이 'a'로 잘못 들어가 있어요.

        // chars 문자 배열에서 문자 'a'을 찾아 'l'로 수정한 뒤 “HelloWorld!”가 출력될 수 있도록 해주세요.
        char[] chars = {'H', 'e', 'a', 'a', 'o', 'W', 'o', 'r', 'a', 'd', '!'};
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                chars[i] = 'l';
            }
            System.out.print(chars[i]);
        }

    }
}
