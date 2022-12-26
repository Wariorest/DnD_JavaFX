package com.dnd.visitor;

import com.dnd.Stats;
import com.dnd.Character;
import com.dnd.classes.CharacterClass;
import com.dnd.race.CharacterRace;

import java.util.TreeMap;

public class ElementVisitor implements DataElementsVisitor{
    @Override
    public TreeMap visit(Character character){
        TreeMap obj = new TreeMap();
        obj.put("Name", character.getName());
        obj.put("HP", character.getHp());
        return obj;
    }

    @Override
    public TreeMap visit(CharacterClass characterClass){
        TreeMap obj = new TreeMap();
        obj.put("Class", characterClass.toString());
        return obj;
    }

    @Override
    public TreeMap visit(CharacterRace characterRace){
        TreeMap obj = new TreeMap();
        obj.put("Race", characterRace.toString());
        return obj;
    }

    @Override
    public TreeMap visit(Stats stats){
        TreeMap obj = new TreeMap();
        obj.put("Stats", stats.getStats());
        return obj;
    }
}
