package com.dinhgt.pattern.structural.adapter;

import java.util.List;

public interface DatabaseDataConverter {
    List<DisplayData3rdParty> convert(List<DatabaseData> databaseData);

}
