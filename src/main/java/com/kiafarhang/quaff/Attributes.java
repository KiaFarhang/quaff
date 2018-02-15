package com.kiafarhang.quaff;

public class Attributes {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;

    public Attributes(int str, int dex, int con, int intel) {
        this.strength = str;
        this.dexterity = dex;
        this.constitution = con;
        this.intelligence = intel;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getDexterity() {
        return this.dexterity;
    }

    public int getConstitution() {
        return this.constitution;
    }

    public int getIntelligence() {
        return this.intelligence;
    }
}