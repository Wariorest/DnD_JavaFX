package com.dnd;

import com.dnd.visitor.DataElement;
import com.dnd.visitor.DataElementsVisitor;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Stats implements DataElement {
    protected HashMap<String, Integer> stats;

    public Stats(int st, int dex, int con, int intel, int wis, int ch){
        this.stats = new HashMap<String, Integer>();

        this.stats.put("Strength", st);
        this.stats.put("Dexterity", dex);
        this.stats.put("Constitution", con);
        this.stats.put("Intelligence", intel);
        this.stats.put("Wisdom", wis);
        this.stats.put("Charisma", ch);
    }

    public HashMap<String, Integer> getStats(){
        return stats;
    }

    public void setStats(HashMap<String, Integer> stats){
        this.stats = stats;
    }

    public static Stats generate(){
        Dice dice = new Dice();

        return new Stats(dice.roll(), dice.roll(), dice.roll(), dice.roll(),
                dice.roll(), dice.roll());
    }

    public void print(){
        System.out.println();
        System.out.println("Strength: " + this.stats.get("Strength"));
        System.out.println("Dexterity: " + this.stats.get("Dexterity"));
        System.out.println("Constitution: " + this.stats.get("Constitution"));
        System.out.println("Intelligence: " + this.stats.get("Intelligence"));
        System.out.println("Wisdom: " + this.stats.get("Wisdom"));
        System.out.println("Charisma: " + this.stats.get("Charisma"));
    }
    public Memento save(){
        return  new Memento(stats);
    }
    private class Memento{
        private Map<String, Integer> stats;

        Memento(Map<String, Integer> stats){
            this.stats = stats;
        }
    }

    @Override
    public TreeMap accept(DataElementsVisitor visitor){
        return visitor.visit(this);
    }
}
