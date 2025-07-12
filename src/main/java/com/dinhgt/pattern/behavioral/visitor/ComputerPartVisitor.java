package com.dinhgt.pattern.behavioral.visitor;

public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
