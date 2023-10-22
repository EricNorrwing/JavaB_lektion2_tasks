package com.EricNorrwing.tasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLists {

    //Uppgift 1
    //Uppgift 2
    public void arrayListMethod(){
        List<Integer> scoreList = new ArrayList<>();
        scoreList.add(1);
        scoreList.add(2);
        scoreList.add(3);
        scoreList.add(4);
        scoreList.add(5);
        System.out.println(scoreList);
    }
    public void linkedListMethod(){
        List<Integer> scoreList = new LinkedList<>();
        scoreList.add(1);
        scoreList.add(2);
        scoreList.add(3);
        scoreList.add(4);
        scoreList.add(5);
        scoreList.remove(0);
        scoreList.add(10);
        scoreList.set(0,5);
        //Upgift 3
        //scoreList.addFirst(15);

        System.out.println(scoreList.get(0));
        System.out.println(scoreList);

    }
}
