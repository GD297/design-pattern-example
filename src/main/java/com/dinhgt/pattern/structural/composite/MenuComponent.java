package com.dinhgt.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    protected String name;
    protected String url;
    protected List<MenuComponent> menuComponents = new ArrayList<>();

    public void add(MenuComponent menuComponent) {
       throw new UnsupportedOperationException("add method is not implement yet!");
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("add method is not implement yet!");
    }

    public abstract String toString();

    String print(){
        return name +
                ": " +
                url +
                "\n";
    }


}
