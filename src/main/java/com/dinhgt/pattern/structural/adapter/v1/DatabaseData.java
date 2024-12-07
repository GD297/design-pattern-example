package com.dinhgt.pattern.structural.adapter.v1;

public class DatabaseData {

    private String index;
    private String amount;

    public DatabaseData() {
    }

    public DatabaseData(String index, String amount) {
        this.index = index;
        this.amount = amount;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
