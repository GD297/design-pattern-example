package com.dinhgt.pattern.structural.adapter;

import java.util.List;

public class DisplayDataAdapter implements DatabaseDataConverter{
    @Override
    public List<DisplayData3rdParty> convert(List<DatabaseData> databaseData) {
        return databaseData.stream().map(databaseData1 -> {
            return new DisplayData3rdParty(Integer.parseInt(databaseData1.getIndex()), Float.valueOf(databaseData1.getAmount()));
        }).toList();
    }
}
