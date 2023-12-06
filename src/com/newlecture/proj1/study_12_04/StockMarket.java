package com.newlecture.proj1.study_12_04;

public class StockMarket {
    public static void main(String[] args) {
//뉴렉이는 숨겨진 주식의 고수에요.

// 기업 뉴렉슬라의 일 주식 가격을 수집한 뉴렉이는 가장 주식 가격의 변동이 큰 날을 찾으려해요.

// 뉴렉이를 도와 가장 변동이 큰 날과, 변동된 값을 출력해주세요.
// Java에서는 Math.abs로 절대값을 구할 수 있다고해요

//        출력:
//        가장 큰 가격 변동이 일어난 날: 3일 (4일로 나와도 무관)
//
//        변동값: 60

        int highPrice = 0, absPrice = 0, highPriceIndex = 0;
        int[] prices = {120, 140, 180, 240, 220, 205, 180};
        for (int i = 0; i < prices.length - 1; i++) {
            absPrice = Math.abs((prices[i]) - Math.abs(prices[i + 1]));
            if (highPrice < absPrice) {
                highPrice = absPrice;
                highPriceIndex = i;
            }
        }
        System.out.println("가장 큰 가격 변동이 일어난 날: " + ((highPriceIndex) + 2) + "일\n");
        System.out.println("변동값: " + Math.abs(prices[highPriceIndex] - prices[highPriceIndex + 1]));


    }
}
