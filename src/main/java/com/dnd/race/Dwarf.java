package com.dnd.race;

import com.dnd.Stats;

public class Dwarf extends CharacterRace{
    Dwarf(String name, Stats stats){
        this.name = name;
        this.bonuses = stats;
    }

    public Dwarf(Stats stats) {
        super();
    }

    @Override
    public int getRaceBonuses(String type){
        if(type == "Constitution")
            return 2;
        else if(type == "Wisdom")
            return 1;

        return 0;
    }

    @Override
    public void battleCry(){
        System.out.println("Jerk beer!");
    }
}
