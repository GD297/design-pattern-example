package com.dinhgt.pattern.behavioral.memento;

public class Editor {
    private final TextWindow textWindow = new TextWindow();

    public void write(String text){
        textWindow.setText(text);
    }

    public String print(){
        return textWindow.getText();
    }

    public TextWindowState save(){
        return new TextWindowState(textWindow.getText());
    }

    public void restore(TextWindowState state){
        textWindow.setText(state.text());
    }
}
