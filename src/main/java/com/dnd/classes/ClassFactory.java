package com.dnd.classes;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        if("Barbarian".equalsIgnoreCase(type))
            return new Barbarian();
        else if ("Bard".equalsIgnoreCase(type))
            return new Bard();

        return null;
    }
}
