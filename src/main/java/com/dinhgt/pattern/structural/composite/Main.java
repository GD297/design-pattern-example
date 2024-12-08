package com.dinhgt.pattern.structural.composite;

public class Main {

    public static void main(String[] args){
        Menu menu = new Menu("MainMenu", "/main-menu");

        MenuItem menuItem1 = new MenuItem("MenuItem1", "/menu-item1");
        MenuItem menuItem2 = new MenuItem("MenuItem2", "/menu-item2");
        menu.add(menuItem1);
        menu.add(menuItem2);

        Menu subMenu1 = new Menu("SubMenu1", "/sub-menu1");
        menu.add(subMenu1);

        MenuItem subMenuItem1 = new MenuItem("SubMenuItem1", "/sub-menu-item1");
        MenuItem subMenuItem2 = new MenuItem("SubMenuItem2", "/sub-menu-item2");
        subMenu1.add(subMenuItem1);
        subMenu1.add(subMenuItem2);
        System.out.println("###### Before Delete ######");
        System.out.println(menu);

        menu.remove(menuItem1);

        System.out.println("###### After Delete ######");
        System.out.println(menu);



    }

}
