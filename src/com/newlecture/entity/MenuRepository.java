//package com.newlecture.entity;
//
//import java.io.FileOutputStream;
//import java.io.PrintStream;
//import java.util.Scanner;
//
//public class MenuRepository {
//    private String dataSource;
//
//    public MenuRepository() {
//
//    }
//    public MenuList findAll() {
//        return findAll(0);
//    }
//    public MenuList findAll(int page) {
//        return MenuList;
//    }
//    public Menu findByld(int id) {
//        return Menu;
//    }
//    public MenuList findAllByName(String korName) {
//        return MenuList;
//    }
//    public void save(Menu menu) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("id 입력: ");
//        menu.setId(Integer.parseInt(scanner.nextLine()));
//        System.out.print("korName 입력: ");
//        menu.setKorName(scanner.nextLine());
//        System.out.print("engName 입력: ");
//        menu.setEngName(scanner.nextLine());
//        System.out.print("가격 입력: ");
//        menu.setPrice(Integer.parseInt(scanner.nextLine()));
//        System.out.print("좋아요 입력: ");
//        menu.setLike(Integer.parseInt(scanner.nextLine()));
//        System.out.print("image 경로: ");
//        menu.setImg(scanner.nextLine());
//        FileOutputStream fos = new FileOutputStream("res/menus.csv");
//        PrintStream pos = new PrintStream(fos);
//        pos.printf("%d,%s,%s,%d,%d,%s\n", menu.getId(), menu.getKorName(), menu.getEngName(), menu.getPrice(), menu.getLike(), menu.getImage());
//        pos.close();
//        fos.close();
//    }
//    public void deleteAll(int[] ids) {
//        for (int i = 0; i < ids.length; i++) {
//            menu = menuList.get(i);
//            menulist.remove(menu);
//        }
//    }
//}
//
//
