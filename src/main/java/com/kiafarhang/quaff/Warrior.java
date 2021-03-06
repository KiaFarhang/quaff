package com.kiafarhang.quaff;

import com.kiafarhang.quaff.HasName;

public class Warrior implements HasBattleStats, HasName {
    private Attributes attributes;
    private BattleStats maxStats;
    private BattleStats currentStats;

    public Warrior() {
        this.attributes = new Attributes(8, 5, 5, 2);
        this.maxStats = new BattleStats(5, 8, 5, 3, 2);
        this.currentStats = new BattleStats(5, 8, 5, 3, 2);
    }

    public BattleStats getMaxStats() {
        return this.maxStats;
    }

    public BattleStats getCurrentStats() {
        return this.currentStats;
    }

    public String getName() {
        return "Warrior";
    }
}