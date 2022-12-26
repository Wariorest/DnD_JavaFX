package com.dnd;

public class Dice {
    protected int roll(){
        return  (int) (Math.random() * 6);
    }
}
