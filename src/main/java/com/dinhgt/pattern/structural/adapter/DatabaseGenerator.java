package com.dinhgt.pattern.structural.adapter;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class DatabaseGenerator {

    public List<DatabaseData> generateRandom(int number){
        Random random = new Random();
       return IntStream.range(0, number)
                        .mapToObj(operand -> new DatabaseData(String.valueOf(operand), String.valueOf(random.nextInt(100000))))
                        .toList();
    }

}
