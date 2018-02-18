package com.kiafarhang.quaff.battle;

import com.kiafarhang.quaff.HasBattleStats;
import com.kiafarhang.quaff.Warrior;
import com.kiafarhang.quaff.monsters.*;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class BattleTest {
    Warrior warrior = new Warrior();
    Slime slime = new Slime();

    @Test
    public void sortsTurnOrderCorrectly() {
        ArrayList<HasBattleStats> sideA = new ArrayList<HasBattleStats>(1);
        ArrayList<HasBattleStats> sideB = new ArrayList<HasBattleStats>(1);

        sideA.add(warrior);
        sideB.add(slime);

        List<HasBattleStats> sortedTurnOrder = Battle.generateTurnOrder(sideA, sideB);

        assertEquals(slime.getClass().toString(), sortedTurnOrder.get(0).getClass().toString());
    }
}
