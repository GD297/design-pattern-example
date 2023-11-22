package com.dinhgt.pattern.creational.factorymethod;

import static com.dinhgt.pattern.creational.factorymethod.Constants.*;

public class FactoryMethodPatternMain {

    public static void main(String[] args) {
        try{
            Database sqlServer = DatabaseFactory.getDatabase(SQL_SERVER);
            sqlServer.getConnection();

            Database mySqlServer = DatabaseFactory.getDatabase(MY_SQL);
            mySqlServer.getConnection();

            Database oracle = DatabaseFactory.getDatabase(ORACLE);
            oracle.getConnection();

        }catch(IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
    }

}
