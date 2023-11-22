package com.dinhgt.pattern.creational.factorymethod;

import static com.dinhgt.pattern.creational.factorymethod.Constants.*;

public class DatabaseFactory {

    public static Database getDatabase(String database) throws IllegalArgumentException {
        if (database == null) {
            throw new IllegalArgumentException("Database type is null");
        }
        return switch (database) {
            case SQL_SERVER -> new SqlServerDatabase();
            case MY_SQL -> new MySqlServer();
            case ORACLE -> new OracleDatabase();
            default -> throw new IllegalArgumentException("Database type " + database + " not found");
        };
    }

}
