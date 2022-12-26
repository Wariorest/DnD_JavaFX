package com.dnd.memento;

import com.dnd.Stats;

public class Memento {
    private Stats state;

    public Memento(Stats state){

        this.state = state;
    }

    public Stats getState() {

        return state;
    }

    public void setState(Stats state) {
        this.state = state;
    }
}
