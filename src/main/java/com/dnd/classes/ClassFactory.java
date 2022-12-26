package com.dnd.classes;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        if("classes.Barbarian".equalsIgnoreCase(type))
            return new Barbarian();
        else if ("classes.Bard".equalsIgnoreCase(type))
            return new Bard();

        return null;
    }
}
