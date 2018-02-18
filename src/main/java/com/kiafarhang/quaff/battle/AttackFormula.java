package com.kiafarhang.quaff.battle;

import java.util.*;
import com.kiafarhang.quaff.*;

public class AttackFormula {
    public static int calculateDamage(HasBattleStats attacker, HasBattleStats target) {
        BattleStats attackerStats = attacker.getCurrentStats();
        BattleStats targetStats = target.getCurrentStats();

        Random random = new Random();

        int attackerATK = attackerStats.getATK();
        int targetDEF = targetStats.getDEF();

        // int critChance = attackerStats.getLUK() - 1;

        // if (critChance >= random.nextInt()) {
        //     System.out.println("Critical hit!");
        //     attackerATK *= 2;
        // }

        return attackerATK - targetDEF;

    }
}