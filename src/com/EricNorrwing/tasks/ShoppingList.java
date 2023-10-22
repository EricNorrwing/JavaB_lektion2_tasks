package com.EricNorrwing.tasks;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    List<Products> shoppingList = new ArrayList<>();

    public void addItem(Products product){
        shoppingList.add(product);

    }

    public int getSize(){
        return shoppingList.size();
    }
    public void removeItem(int i){
        shoppingList.remove(i);

    }
    public void printItem(String inputName){
        for (Products i : shoppingList){
            if (i.getName().equals(inputName)){
                System.out.println(i);
            }
        }
    }
    public void printAll(){
        System.out.println(shoppingList);
    }

    public List<Integer> positiveList(List<Integer> list){
        List<Integer> posList = new ArrayList<>();
        for (int i : list){
            int k = Math.abs(i);
            posList.add(k);
        }
        return posList;
    }


}
