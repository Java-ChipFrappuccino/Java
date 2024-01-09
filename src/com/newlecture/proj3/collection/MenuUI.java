package com.newlecture.proj3.collection;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MenuUI {
    private MenuRepository repository;

    public MenuUI() {
        repository = new MenuRepository();
    }

    public void list() throws FileNotFoundException {
        MenuList menuList = repository.findAll();
        int size = menuList.size();
        System.out.println(size);
//        FileOutputStream fos = new FileOutputStream("res/menu.csv");
        for (int i = 0; i < size; i++) {
            Menu menu = menuList.get(i);
            int id = menu.getId();
            String korName = menu.getKorName();
            String engName = menu.getEngName();
            int price = menu.getPrice();
            int like = menu.getLike();
            String image = menu.getImage();
            System.out.printf("[%d] %s (%s) / %d원 / 좋아요(%d) [%s]\n",id,korName,engName,price,like,image);

        }
    }

    public static int inputMenu() {
        System.out.println("[ 메뉴관리 ]");
        System.out.println("1.메뉴목록");
        System.out.println("2.메뉴추가");
        System.out.println("3. 종료");
        System.out.print(">");
        Scanner scan = new Scanner(System.in);
        int menu = scan.nextInt();
        return menu;
    }

    public void index() throws FileNotFoundException {
        boolean onOff = true;
        while (onOff) {
            int menu = inputMenu();


            switch (menu) {
                case 1:
                    list();
                    break;
                case 2:
                    leg();
                    break;
                case 3:
                    onOff = false;
                    break;
                default:
                    System.out.println("오류");
            }
        }
        System.out.println("시스템 종료");
    }

    private void leg() throws FileNotFoundException {
        Menu menu = new Menu();
        repository.save(menu);
    }
}
