package com.dinhgt.pattern.structural.adapter.v1;

public class AdapterMain {

    public static void main(String[] args){
        DatabaseGenerator databaseGenerator = new DatabaseGenerator();
        DisplayDataAdapter displayDataAdapter = new DisplayDataAdapter();
        displayDataAdapter.convert(databaseGenerator.generateRandom(10)).forEach(DisplayData3rdParty::printData);
    }

}
