package com.kiafarhang.quaff.monsters;

import com.kiafarhang.quaff.BattleStats;
import com.kiafarhang.quaff.HasBattleStats;

public class Slime implements HasBattleStats {
    private BattleStats maxStats;
    private BattleStats currentStats;

    public Slime() {
        this.maxStats = new BattleStats(2, 2, 2, 4, 1);
        this.currentStats = new BattleStats(2, 2, 2, 4, 1);
    }

    public BattleStats getMaxStats() {
        return this.maxStats;
    }

    public BattleStats getCurrentStats() {
        return this.currentStats;
    }

    public String getName() {
        return "Slime";
    }
}