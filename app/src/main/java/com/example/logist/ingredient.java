package com.example.logist;

public class ingredient {
    private String name;
    private double amount;
    private String unit;

    public ingredient(String n, String d, double a, String u){
        name = n;
        amount = a;
        unit = u;
    }

    public String getName() {return name;}
    public double getAmount() {return amount;}
    public String getUnit(){return unit}

    public void setName(String n) {
        name = n;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
}
