package com.dnd.classes;

public class Bard extends CharacterClass{
    private String perk;

    public Bard(){
        this.name = "Bard";
        this.dice = 8;
        this.perk = "Charm person OR Heroism";
    }

    @Override
    public void printMagika(){
        System.out.println("Class " + name + "can do " + perk);
    }
}
