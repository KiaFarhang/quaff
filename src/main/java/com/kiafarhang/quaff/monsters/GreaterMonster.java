package com.kiafarhang.quaff.monsters;

import com.kiafarhang.quaff.BattleStats;
import com.kiafarhang.quaff.HasBattleStats;

public class GreaterMonster implements HasBattleStats {

    private HasBattleStats decorated;

    public GreaterMonster(HasBattleStats decorated) {
        this.decorated = decorated;
    }

    @Override
    public BattleStats getMaxStats() {
        BattleStats originalStats = decorated.getMaxStats();
        BattleStats enhancedStats = new BattleStats(originalStats.getHP() + 2, originalStats.getATK() + 2,
                originalStats.getDEF() + 2, originalStats.getAGI() + 2, originalStats.getLUK() + 2);
        return enhancedStats;
    }

    @Override
    public BattleStats getCurrentStats() {
        BattleStats originalStats = decorated.getCurrentStats();
        BattleStats enhancedStats = new BattleStats(originalStats.getHP() + 2, originalStats.getATK() + 2,
                originalStats.getDEF() + 2, originalStats.getAGI() + 2, originalStats.getLUK() + 2);
        return enhancedStats;
    }
}