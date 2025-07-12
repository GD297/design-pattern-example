package com.dinhgt.pattern.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("Version1");
        TextWindowState saved = editor.save();
        editor.write("Version2");
        System.out.println(editor.print());
        editor.restore(saved);
        System.out.println(editor.print());
    }
}
