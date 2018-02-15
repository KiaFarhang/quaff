package com.kiafarhang.quaff;

public class BattleStats {
    private int HP;
    private int ATK;
    private int DEF;
    private int AGI;
    private int LUK;

    public BattleStats(int hp, int atk, int def, int agi, int luk) {
        this.HP = hp;
        this.ATK = atk;
        this.DEF = def;
        this.AGI = agi;
        this.LUK = luk;
    }

    public int getHP() {
        return this.HP;
    }

    public int getATK() {
        return this.ATK;
    }

    public int getDEF() {
        return this.DEF;
    }

    public int getAGI() {
        return this.AGI;
    }

    public int getLUK() {
        return this.LUK;
    }

    public void setHP(int hp) {
        if (hp < 0) {
            this.HP = 0;
        } else {
            this.HP = hp;
        }
    }
}