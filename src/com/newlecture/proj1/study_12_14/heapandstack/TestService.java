package com.newlecture.proj1.study_12_14.heapandstack;

public class TestService {
    public static void main(String[] args) {
        ObjectInitService service=new ObjectInitService();
        Friend friend=new Friend("제니",18);
        service.passOne(friend);
        System.out.println("1번 예상:"+friend.getName()+" "+friend.getAge());
        service.passTwo(friend);
        System.out.println("2번 예상:"+friend.getName()+" "+friend.getAge());
    }
}