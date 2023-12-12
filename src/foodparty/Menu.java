package foodparty;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("┌─────────────────────────────────┐\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│         한식 중식 양식          │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│              모집               │\n");
        System.out.print("│                                 │\n");
        System.out.print("└─────────────────────────────────┘\n");
        System.out.println("\t1.한식 2.중식 3.양식");

        System.out.print("┌─────────────────────────────────┐\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│            식당 추가            │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│              모집               │\n");
        System.out.print("│                                 │\n");
        System.out.print("└─────────────────────────────────┘\n");

        Store[] stores = new Store[5];
        for (int i = 0; i < stores.length; i++) {
            stores[i] = new Store();
        }
        System.out.println("식당을 추가하려면 + 를 입력하세요");
        String choice = scanner.nextLine();
        if (choice.equals("+")) {
            System.out.print("추가할 식당의 이름: ");
            stores[0].name = scanner.nextLine();
        }
//        stores[1].name = scanner.nextLine();
        System.out.print("┌─────────────────────────────────┐\n");
        System.out.print("│                                 │\n");
        System.out.print("│" + stores[0].name + "             │\n");
        System.out.print("│                                 │\n");
        System.out.print("│" + stores[1].name + "             │\n");
        System.out.print("│                                 │\n");
        System.out.print("│" + stores[2].name + "             │\n");
        System.out.print("│                                 │\n");
        System.out.print("│" + stores[3].name + "             │\n");
        System.out.print("│                                 │\n");
        System.out.print("│" + stores[4].name + "             │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│              모집               │\n");
        System.out.print("│                                 │\n");
        System.out.print("└─────────────────────────────────┘\n");

        System.out.println("1번 식당 클릭");

//        if (choice.equals("1")) {
            System.out.print("┌─────────────────────────────────┐\n");
            System.out.print("│                                 │\n");
            System.out.print("│" + stores[0].name + "             │\n");
            System.out.print("│                                 │\n");
            System.out.print("└─────────────────────────────────┘\n");
            System.out.println("리뷰를 추가하려면 + 를 입력해주세요");
            choice = scanner.nextLine();
            if (choice.equals("+")) {
                Review review = new Review();
                System.out.print("리뷰: ");
                stores[0].name = scanner.nextLine();
            }
//        }
    }
}