package com.dnd.visitor;

import com.dnd.Stats;

import java.util.TreeMap;
import com.dnd.Character;
import com.dnd.classes.CharacterClass;
import com.dnd.race.CharacterRace;

public interface DataElementsVisitor {
    public TreeMap visit(Character character);
    public TreeMap visit(CharacterClass characterClass);
    public TreeMap visit(CharacterRace characterRace);
    public TreeMap visit(Stats stats);
}
