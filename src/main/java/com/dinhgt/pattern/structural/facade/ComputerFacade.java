package com.dinhgt.pattern.structural.facade;

public class ComputerFacade {
    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        memory.load(0L, hardDrive.read(0L, 1024));
        cpu.jump(0L);
        cpu.execute();
    }
}
