package com.dinhgt.pattern.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
