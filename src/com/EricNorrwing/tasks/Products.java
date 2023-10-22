package com.EricNorrwing.tasks;

public class Products {

    String name;
    int price;

    public Products(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return this.name + " + " + this.price + " cost";
    }

}
