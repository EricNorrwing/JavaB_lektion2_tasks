package com.EricNorrwing.tasks;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TestLists lists = new TestLists();

        //lists.arrayListMethod();
        //lists.linkedListMethod();


        System.out.println("Hello my name is benny and this is my shopping list");

        ShoppingList list = new ShoppingList();
        for (int i = 0; i < 10; i++){
            Products prod = new Products("name"+i,i*50);
            list.addItem(prod);
        }

        System.out.println("Hello sir id like to get item 5 please");

        list.printItem("name5");

        System.out.println("Hello id like to remove item number 5");

        list.removeItem(5);

        System.out.println("show me the complete list please");

        list.printAll();


        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            int temp = 10-i;
            numbers.add(temp);
        }
        //Puzzle #3 VERY NICE STUFF I LIKE COOL STUFF
        System.out.println(numbers);
        numbers.sort(null);
        System.out.println(numbers);

        List<Integer> negativeList = new ArrayList<>();
        negativeList.add(-5);
        negativeList.add(-10);
        negativeList.add(-15);
        negativeList.add(-20);
        negativeList.add(-25);
        System.out.println(list.positiveList(negativeList));



    }
}
