package com.dnd.race;

import com.dnd.Stats;
import com.dnd.race.CharacterRace;

public class Human extends CharacterRace{
    Human(String name, Stats stats){
        this.name = name;
        this.bonuses = stats;
    }

    public Human(Stats stats) {
        super();
    }

    @Override
    public int getRaceBonuses(String type){
        if(type == "Strength")
            return 1;
        else if(type == "Dexterity")
            return 1;
        else if(type == "Constitution")
            return 1;
        else if(type == "Intelligence")
            return 1;
        else if(type == "Wisdom")
            return 1;
        else if(type == "Charisma")
            return 1;

        return 0;
    }

    @Override
    public void battleCry(){
        System.out.println("For Alliance!");
    }
}
