package com.dinhgt.pattern.structural.adapter;

public class DisplayData3rdParty {

    private Integer index;
    private Float amount;


    public void printData(){
        System.out.println(this.index+": "+ this.amount);
    }

    public DisplayData3rdParty() {
    }

    public DisplayData3rdParty(Integer index, Float amount) {
        this.index = index;
        this.amount = amount;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
