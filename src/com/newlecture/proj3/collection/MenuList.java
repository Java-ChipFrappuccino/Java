package com.newlecture.proj3.collection;

public class MenuList {
    int count = 0;
    int index = 0;
    int menusCount = 0;
    Menu[] menus;

    public MenuList() {
//        count = 5;
//        index = 0;
//        menusCount = 0;
//        menus = new Menu[count];
        this(5);
    }
    public MenuList(int count) {
        this.count = count;
        index = 0;
        menus = new Menu[count];
    }
    public void add(Menu menu) {
//        menus;
        menus[menusCount++] = menu;

    }

    public int size() {
        int size = menusCount;
        return size;
    }

    public Menu get(int index) {

        return menus[index];
    }
}
