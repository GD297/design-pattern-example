package com.dinhgt.pattern.behavioral.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
