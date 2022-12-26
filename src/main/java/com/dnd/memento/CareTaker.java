package com.dnd.memento;

import com.dnd.Stats;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    protected List<Stats> mementoList = new ArrayList<Stats>();
    static int saveId = 0;

    protected void add(Stats state){
        mementoList.add(state);
        System.out.println("\nState saved. Save id: " + saveId);
        System.out.println("--------------");
        System.out.println();
        saveId++;
    }

    protected Stats get(int index){
        System.out.println("\nLoading from save id" + index + "...");
        return mementoList.get(index);
    }
}
