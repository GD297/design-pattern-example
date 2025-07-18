package com.dinhgt.pattern.behavioral.visitor;

public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
