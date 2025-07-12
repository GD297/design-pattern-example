package com.dinhgt.pattern.structural.facade;

public class HardDrive {
    public byte[] read(long l, int size) {
        System.out.println("Reading " + size + " bytes from HDD at " + l);
        return new byte[size];
    }
}
