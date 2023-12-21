package foodparty;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

    static void storeList(Store[] stores, int storeNo) throws IOException {
        System.out.print("┌─────────────────────────────────┐\n");
        System.out.print("│                     + 식당 추가 │\n");
        System.out.print("│                                 │\n");
        // System.out.println(stores.length); // 스토어 개수 테스트
        if (stores == null) {  // 스토어 개수가 0이면?
            System.out.print("│     등록된 식당이 없습니다      │\n");
        } else {
            for (int i = 0; i < storeNo; i++) { // for문 돌면서 식당폴더의 이름을 가져올수 있는 방법이 있을까?
                stores[i].review.storeName = stores[i].name;
                stores[i].review.count();
                stores[i].setStar(stores[i].review.Load());
                System.out.print("│ " + stores[i].star + " " + stores[i].name +"\t"+ stores[i].review.reviewCount+"개의 리뷰"+"\n");
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
    static Store[] storeSelect(Store[] stores, int storeNo,String choice) throws IOException {
        Scanner scanner = new Scanner(System.in);
//        String choice = scanner.nextLine();
        for (int i = 0; i < storeNo; i++) {
            if (stores[i].name.equals(choice)) {
                stores[i].review.storeName = stores[i].name;
                stores[i].review.count();
//                stores[i].review.Load();
                stores[i].setStar(stores[i].review.Load());
                System.out.print("┌─────────────────────────────────┐\n");
                System.out.print("│" + stores[i].star + " " + stores[i].name + "\n");
                System.out.print("│                                 │\n");
                System.out.print("│                                 │\n");
                System.out.print("│         네이버지도 API          │\n");
                System.out.print("│                                 │\n");
                System.out.print("│                                 │\n");
                System.out.print("│  메뉴소개~                      │\n");
                System.out.print("└─────────────────────────────────┘\n");
                stores[i].review.Print();
                System.out.println("리뷰를 추가하려면 + 를 입력해주세요");

                System.out.println("식당 리스트로 돌아가려면 아무키나 입력해주세요");

                choice = scanner.nextLine();
                if (choice.equals("+")) {
                    stores[i].review.storeName = stores[i].name;
                    stores[i].review.count();
                    stores[i].review.Write();
                    stores[i].review.Save();
                    stores[i].review.count();
                    stores[i].review.Load();
                    stores[i].review.Print();

                }
            }
        }
        return stores;
    }

    public static Store[] storeAdd(Store[] stores , String addStore) {
        // 식당 추가할때마다 배열 한칸씩 늘리기
        {
            Scanner scanner = new Scanner(System.in);
//            System.out.println("식당을 추가하려면 + 를 입력하세요");
//            String addStore = scanner.nextLine();
            if (addStore.equals("+") && storeNo == 0) {  //첫 식당 추가시 한개짜리 배열 생성
                storeNo++;
                stores = new Store[storeNo];
                stores[storeNo - 1] = new Store();
//                    stores[storeNo - 1].number = 1; // ?
                System.out.print("추가할 식당의 이름: ");
                stores[storeNo - 1].name = scanner.nextLine();
                System.out.print("식당 분류 입력(한식,중식,일식,양식,디저트): ");
                stores[storeNo - 1].category = scanner.nextLine();
                System.out.println("\n추가 되었습니다!\n");
                stores[storeNo - 1].number = storeNo;
                File storeDir = new File("res/store/" + stores[storeNo - 1].name);
                if (!storeDir.exists()) {
                    storeDir.mkdirs();
                }
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
                System.out.print("식당 분류 입력(한식,중식,일식,양식,디저트): ");
                stores[storeNo - 1].category = scanner.nextLine();
                System.out.println("\n추가되었습니다!\n");
                stores[storeNo - 1].number = storeNo;
                File storeDir2 = new File("res/store/" + stores[storeNo - 1].name);
                if (!storeDir2.exists()) {
                    storeDir2.mkdirs();
                }
            }
            return stores;
        }
    }
    static int storeNo = 0;

    public static void main(String[] args) throws IOException {
        // 전역변수
        Scanner scanner = new Scanner(System.in);
        File storeDir = new File("res/store");
        if (!storeDir.exists()) {
            storeDir.mkdirs();
        }
        Path path = Paths.get("res/store");

//        System.out.println("스토어이름"+storeName);

        long storeCount = Files.list(path).count();
        System.out.println(storeCount);

//        int storeNo = 0; //입점한 총 가게수
//        Store[] stores = null; //가게별 배열 개체 이름표 만들기
        storeNo = (int)storeCount; //입점한 총 가게수
        Store[] stores;
        if (storeNo == 0) {
            stores = null;
        } else {
            stores = new Store[(int) storeCount]; //가게별 배열 개체 이름표 만들기
        }
        // 메인화면 로딩
        {
            home();
            System.out.println("1.한식 2.일식 3.중식 4.양식 5.디저트\n\t\t\t0.모집");
            System.out.print("선택: ");
            scanner.nextLine();

        }
//        Store[] temp;
//        stores[0].no = 1;

            // 식당 추가할때마다 배열 한칸씩 늘리기
        storeAdd:
        while (true) {
            {
                storeList(stores, storeNo);
                Scanner scan = new Scanner(System.in);
                System.out.println("식당을 추가하려면 + 를 입력하세요");
                System.out.println("생성된 식당을 클릭하려면 이름을 입력하세요");
                System.out.print("입력 : ");
                String Store = scanner.nextLine();
                if (Store.equals("+")) {
                    stores = storeAdd(stores, Store);
                } else {
                    storeSelect(stores,storeNo,Store);

                }
            }
        }
//            {
//                System.out.println("식당을 추가하려면 + 를 입력하세요");
//                String addStore = scanner.nextLine();
//                if (addStore.equals("+") && storeNo == 0) {  //첫 식당 추가시 한개짜리 배열 생성
//                    storeNo++;
//                    stores = new Store[storeNo];
//                    stores[storeNo - 1] = new Store();
////                    stores[storeNo - 1].number = 1; // ?
//                    System.out.print("추가할 식당의 이름: ");
//                    stores[storeNo - 1].name = scanner.nextLine();
//                    System.out.print("식당 분류 입력(한식,중식,일식,양식,디저트): ");
//                    stores[storeNo - 1].category = scanner.nextLine();
//                    stores[storeNo - 1].number = storeNo;
//                    File storeDir = new File("res/store/" + stores[storeNo - 1].name);
//                    if (!storeDir.exists()) {
//                        storeDir.mkdirs();
//                    }
//                    } else if (addStore.equals("+") && storeNo > 0) {  //두번째 식당부터 첫식당 배열을 복사해옴
//                        storeNo++;
//                        Store[] temp = new Store[storeNo];
////                    for (int k = 0; k < storeNo; k++) {  //늘어난 배열에 식당 객체 참조시킴
////                        temp[k] = new Store();
////                    }
//                        for (int i = 0; i < storeNo - 1; i++) {
////                        stores[i].number = i + 1; // 왜 안됨?
//                            temp[i] = stores[i];
//                        }
//                        stores = temp;
//                        stores[storeNo - 1] = new Store(); //추가된 식당이름표에 식당 객체 참조시킴
//
//                        System.out.print("추가할 식당의 이름: ");
//                        stores[storeNo - 1].name = scanner.nextLine();
//                        System.out.print("식당 분류 입력(한식,중식,일식,양식,디저트): ");
//                        stores[storeNo - 1].category = scanner.nextLine();
//                        stores[storeNo - 1].number = storeNo;
//                        File storeDir2 = new File("res/store/" + stores[storeNo - 1].name);
//                        if (!storeDir2.exists()) {
//                            storeDir2.mkdirs();
//                        }
//                    }
//                }

//                    storeList(stores, storeNo);

//                System.out.println("생성된 식당 클릭");
//                stores = storeSelect(stores, storeNo);

//                storeList(stores,storeNo);

            }
        }
