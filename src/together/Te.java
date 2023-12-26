package together;

public class Te {
    public static void main(String[] args) {
        int[][] k = new int[5][5];
//        k[0] = new int[]{0, 1, 2, 3, 4};
        int count = 0;
        int count1 = 0;
        // 입력하기
        {
            for (int y = 0; y < 5; y++) {
                for (int x = 0; x < 5; x++) {
                    if (y % 2 == 1) {
                        k[y][4-x] = ++count;
                    } else {
                    k[y][x] = ++count;
                    }
                }
            }
        }

        // 출력하기
        {
            for (int y = 0; y < 5; y++) {
                for (int x = 0; x < 5; x++) {
                    System.out.printf("%d\t",k[y][x]);
                }
                System.out.println();
            }
        }
        System.out.println("======================");
        //입력하기
        {
            for (int y = 0; y < 5; y++) {
                for (int x = 0; x < 5; x++) {
                    if (y == 0) {
                        k[y][x] = ++count1;
                    } else if (x==4) {
                        k[y][x] = ++count1;
                    } else if (y == 4) {
                        k[y][4-x] = ++count1;
                    } else if (y > 0 && x == 0) {
                        k[5-y][x] = ++count1;
                    }
                }
            }
        }
        // 출력하기
        {
            for (int y = 0; y < 5; y++) {
                for (int x = 0; x < 5; x++) {
                    System.out.printf("%d\t",k[y][x]);
                }
                System.out.println();
            }
        }

    }
}