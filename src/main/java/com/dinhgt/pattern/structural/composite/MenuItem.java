package com.dinhgt.pattern.structural.composite;

public class MenuItem extends MenuComponent{

    public MenuItem(String name, String url){
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return print();
    }
}
