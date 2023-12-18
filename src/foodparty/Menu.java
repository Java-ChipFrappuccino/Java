package foodparty;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    static void home() {
        System.out.print("┌─────────────────────────────────┐\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│         한식      중식          │\n");
        System.out.print("│                                 │\n");
        System.out.print("│         일식      양식          │\n");
        System.out.print("│                                 │\n");
        System.out.print("│             디저트              │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│              모집               │\n");
        System.out.print("│                                 │\n");
        System.out.print("└─────────────────────────────────┘\n");
    }

    static void storeList(Store[] stores, int storeNo) {
        System.out.print("┌─────────────────────────────────┐\n");
        System.out.print("│                     + 식당 추가 │\n");
        System.out.print("│                                 │\n");
        if (stores == null) {
            System.out.print("│     등록된 식당이 없습니다      │\n");
        } else {
            for (int i = 0; i < storeNo; i++) {
                System.out.print("│ " + stores[i].star + " " + stores[i].name + "\n");
                System.out.print("│                                 │\n");
            }
        }
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│                                 │\n");
        System.out.print("│              모집               │\n");
        System.out.print("│                                 │\n");
        System.out.print("└─────────────────────────────────┘\n");
    }

    //    static int addStoreInfo(Store[] stores, int storeNo) {
//        {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("식당을 추가하려면 + 를 입력하세요");
//            String addStore = scanner.nextLine();
//            if (addStore.equals("+") && storeNo == 0) {  //첫 식당 추가시 한개짜리 배열 생성
//                storeNo++;
//                stores = new Store[storeNo];
//                stores[storeNo - 1] = new Store();
////                    stores[storeNo - 1].number = 1; // ?
//                System.out.print("추가할 식당의 이름: ");
//                stores[storeNo - 1].name = scanner.nextLine();
//                System.out.print("식당 분류 입력(한식,중식,일식,양식,디저트,): ");
//                stores[storeNo - 1].category = scanner.nextLine();
//                stores[storeNo - 1].number = storeNo;
//
//            } else if (addStore.equals("+") && storeNo > 0) {  //두번째 식당부터 첫식당 배열을 복사해옴
//                storeNo++;
//                Store[] temp = new Store[storeNo];
////                    for (int k = 0; k < storeNo; k++) {  //늘어난 배열에 식당 객체 참조시킴
////                        temp[k] = new Store();
////                    }
//                for (int i = 0; i < storeNo - 1; i++) {
////                        stores[i].number = i + 1; // 왜 안됨?
//                    temp[i] = stores[i];
//                }
//                stores = temp;
//                stores[storeNo - 1] = new Store(); //추가된 식당이름표에 식당 객체 참조시킴
//
//                System.out.print("추가할 식당의 이름: ");
//                stores[storeNo - 1].name = scanner.nextLine();
//                System.out.print("식당 분류 입력(한식,중식,일식,양식,디저트,): ");
//                stores[storeNo - 1].category = scanner.nextLine();
//                stores[storeNo - 1].number = storeNo;
//            }
//            return storeNo;
//        }
//    }
    static Store[] storeSelect(Store[] stores, int storeNo) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        for (int i = 0; i < storeNo; i++) {
            if (stores[i].name.equals(choice)) {
                System.out.print("┌─────────────────────────────────┐\n");
                System.out.print("│" + stores[i].star + " " + stores[i].name + "\n");
                System.out.print("│                                 │\n");
                System.out.print("│                                 │\n");
                System.out.print("│  메뉴소개~                      │\n");
                System.out.print("└─────────────────────────────────┘\n");
                stores[i].review.storeName = stores[i].name;
                stores[i].review.Load();
                stores[i].review.Print();
                System.out.println("리뷰를 추가하려면 + 를 입력해주세요");

                choice = scanner.nextLine();
                if (choice.equals("+")) {
                    stores[i].review.storeName = stores[i].name;
                    stores[i].review.Write();
                    stores[i].review.Save();
                    stores[i].review.Load();
                    stores[i].review.Print();

                }
            }
        }
        return stores;
    }

            public static void main (String[]args) throws IOException {
                // 전역변수
                Scanner scanner = new Scanner(System.in);
                int storeNo = 0; //입점한 총 가게수
                Store[] stores = null; //가게별 배열 개체 이름표 만들기
                // 메인화면 로딩
                {
                    home();
                    System.out.println("1.족발•보쌈 2.돈까스•회•일식 3.고기•구기 4.피자 5.찜•탕•찌개\n" +
                            "6.양식 7.중식 8.아시안 9.치킨 10.백반•죽•국수\n" +
                            "11.버거 12.분식 13.카페•디저트\n\t\t\t0.모집");
                    System.out.print("선택: ");
                    scanner.nextLine();


                    storeList(stores, storeNo);
                }
//        Store[] temp;
//        stores[0].no = 1;
                for (int j = 0; j < 2; j++) {

                    // 식당 추가할때마다 배열 한칸씩 늘리기
                    {
                        System.out.println("식당을 추가하려면 + 를 입력하세요");
                        String addStore = scanner.nextLine();
                        if (addStore.equals("+") && storeNo == 0) {  //첫 식당 추가시 한개짜리 배열 생성
                            storeNo++;
                            stores = new Store[storeNo];
                            stores[storeNo - 1] = new Store();
//                    stores[storeNo - 1].number = 1; // ?
                            System.out.print("추가할 식당의 이름: ");
                            stores[storeNo - 1].name = scanner.nextLine();
                            System.out.print("식당 분류 입력(한식,중식,일식,양식,디저트,): ");
                            stores[storeNo - 1].category = scanner.nextLine();
                            stores[storeNo - 1].number = storeNo;

                        } else if (addStore.equals("+") && storeNo > 0) {  //두번째 식당부터 첫식당 배열을 복사해옴
                            storeNo++;
                            Store[] temp = new Store[storeNo];
//                    for (int k = 0; k < storeNo; k++) {  //늘어난 배열에 식당 객체 참조시킴
//                        temp[k] = new Store();
//                    }
                            for (int i = 0; i < storeNo - 1; i++) {
//                        stores[i].number = i + 1; // 왜 안됨?
                                temp[i] = stores[i];
                            }
                            stores = temp;
                            stores[storeNo - 1] = new Store(); //추가된 식당이름표에 식당 객체 참조시킴

                            System.out.print("추가할 식당의 이름: ");
                            stores[storeNo - 1].name = scanner.nextLine();
                            System.out.print("식당 분류 입력(한식,중식,일식,양식,디저트,): ");
                            stores[storeNo - 1].category = scanner.nextLine();
                            stores[storeNo - 1].number = storeNo;
                        }
                    }
//             추가한 식당의 정보 입력
//            System.out.print("추가할 식당의 이름: ");
//            stores[storeNo - 1].name = scanner.nextLine();
//            System.out.print("식당 분류 입력(한식,중식,일식,양식,디저트,): ");
//            stores[storeNo - 1].category = scanner.nextLine();
//            stores[storeNo - 1].number = storeNo;

//        }

                    storeList(stores, storeNo);


                }


                System.out.println("생성된 식당 클릭");
                stores = storeSelect(stores , storeNo);

//                String choice = scanner.nextLine();
//                for (int i = 0; i < storeNo; i++) {
//                    if (stores[i].name.equals(choice)) {
//                        System.out.print("┌─────────────────────────────────┐\n");
//                        System.out.print("│" + stores[i].star + " " + stores[i].name + "\n");
//                        System.out.print("│                                 │\n");
//                        System.out.print("│                                 │\n");
//                        System.out.print("│  메뉴소개~                      │\n");
//                        System.out.print("└─────────────────────────────────┘\n");

//                        System.out.println("리뷰를 추가하려면 + 를 입력해주세요");
//
//                        choice = scanner.nextLine();
//                        if (choice.equals("+")) {
//                            stores[i].review.Write();
//                            stores[i].review.Print();
//                        }
//                    }
//                }

//        if (choice.equals(stores[0].name)) {
//            System.out.print("┌─────────────────────────────────┐\n");
//            System.out.print("│                                 │\n");
//            System.out.print("│" + stores[0].name + "\n");
//            System.out.print("│                                 │\n");
//            System.out.print("└─────────────────────────────────┘\n");
//            System.out.println("리뷰를 추가하려면 + 를 입력해주세요");
//            choice = scanner.nextLine();
//            if (choice.equals("+")) {
//                Review review = new Review();
//                System.out.print("리뷰: ");
//                stores[0].name = scanner.nextLine();
//            }
//        }
            }
        }

//    }
//}