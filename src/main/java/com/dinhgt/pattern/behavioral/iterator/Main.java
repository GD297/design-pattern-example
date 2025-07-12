package com.dinhgt.pattern.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        Iterator<String> iterator = namesRepository.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
