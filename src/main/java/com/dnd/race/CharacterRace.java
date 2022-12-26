package com.dnd.race;

import com.dnd.Stats;
import com.dnd.visitor.DataElement;
import com.dnd.visitor.DataElementsVisitor;

import java.util.TreeMap;

public abstract class CharacterRace implements DataElement {
    protected String name;
    protected Stats bonuses;

    public abstract int getRaceBonuses(String type);

    public abstract void battleCry();

    @Override
    public TreeMap accept(DataElementsVisitor visitor){
        return visitor.visit(this);
    }
}
