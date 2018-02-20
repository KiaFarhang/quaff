package com.kiafarhang.quaff.monsters;

import com.kiafarhang.quaff.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class GreaterMonsterTest {
    Slime slime = new Slime();

    @Test
    public void AddsTwoToAllCurrentStats() {
        GreaterMonster greaterSlime = new GreaterMonster(slime);

        BattleStats originalStats = slime.getCurrentStats();
        BattleStats greaterStats = greaterSlime.getCurrentStats();

        assertEquals(originalStats.getHP() + 2, greaterStats.getHP());
        assertEquals(originalStats.getATK() + 2, greaterStats.getATK());
        assertEquals(originalStats.getDEF() + 2, greaterStats.getDEF());
        assertEquals(originalStats.getAGI() + 2, greaterStats.getAGI());
        assertEquals(originalStats.getLUK() + 2, greaterStats.getLUK());
    }

    @Test
    public void AddsTwoToAllMaxStats() {
        GreaterMonster greaterSlime = new GreaterMonster(slime);

        BattleStats originalStats = slime.getMaxStats();
        BattleStats greaterStats = greaterSlime.getMaxStats();

        assertEquals(originalStats.getHP() + 2, greaterStats.getHP());
        assertEquals(originalStats.getATK() + 2, greaterStats.getATK());
        assertEquals(originalStats.getDEF() + 2, greaterStats.getDEF());
        assertEquals(originalStats.getAGI() + 2, greaterStats.getAGI());
        assertEquals(originalStats.getLUK() + 2, greaterStats.getLUK());
    }
}