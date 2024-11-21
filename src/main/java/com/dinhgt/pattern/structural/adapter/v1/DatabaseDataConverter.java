package com.dinhgt.pattern.structural.adapter.v1;

import java.util.List;

public interface DatabaseDataConverter {
    List<DisplayData3rdParty> convert(List<DatabaseData> databaseData);

}
