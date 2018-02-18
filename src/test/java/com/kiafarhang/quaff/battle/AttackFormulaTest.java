package com.kiafarhang.quaff.battle;

import com.kiafarhang.quaff.HasBattleStats;
import com.kiafarhang.quaff.Warrior;
import com.kiafarhang.quaff.battle.AttackFormula;
import org.junit.Test;
import static org.junit.Assert.*;

public class AttackFormulaTest {
    HasBattleStats attacker = new Warrior();
    HasBattleStats defender = new Warrior();

    @Test
    public void testReturnsCorrectNumber() {
        assertEquals(3, AttackFormula.calculateDamage(attacker, defender), 0);
    }
}